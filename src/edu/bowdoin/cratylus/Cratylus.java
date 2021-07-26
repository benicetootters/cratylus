package edu.bowdoin.cratylus;

import java.io.*;
import java.nio.file.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.stream.*;

import javax.mail.internet.*;

import javax.sql.DataSource;

import org.apache.logging.log4j.Logger;
import org.jdom2.*;
import edu.bowdoin.volva.DataUtilities;

/**
 * Cratylus extends the DataUtilities interface to perform various datasource interactions with the 
 * Cratylus database to handle user state information and to add tags to the datasource
 * 
 * @author  David Francis
 * @version 1.4
 * @since   2020-03-31 
 */
public class Cratylus extends DataUtilities {

	
    /** 
     * Constructor initiates the data source and logger
     * @param ds data source
     * @param log4j Apache log4j2 logger
     */
    public Cratylus(DataSource ds, Logger log4j) {
		this.logger = log4j;
    	this.ds = ds;
	}
     
    /**
     * Accepts various parameters to create a parameterized SQL statement to insert a new 
     * tag row in the takiTags table.
     * @param gid The unique Getty AAT subject ID for a vocabulary selection (tag)
     * @param pt The Getty AAT term associated with the subject ID
     * @param oid The unique object ID for the object being tagged 
     * @param an The unique accession number for the object being tagged
     * @param uid The Cratylus user ID
     * @param tid The tagging area defined in Cratylus
     * @param tb The timestamp of the tagging event (epoch)
     * @return
     */
    public int AddTag(String gid, String pt, String oid, String an, String uid, int tid, long tb) {

    	int rtn = 0;
    	try {
    	String sql = "INSERT INTO takiTags (SubjectID, PTerm, ObjectID, AN, UID, TagAreaID, TagBlock) "
    			+"Values(?,?,?,?,?,?,?)";
    	
    	int sid = Integer.parseInt(gid);
	    Vector<Object> ps = new Vector<Object>(7);

	    ps.add(new Integer(sid));
	    	ps.add(pt);
	    	ps.add(new Integer(oid));
	    	ps.add(an);
	    	ps.add(new Integer(uid));
	    	ps.add(new Integer(tid));
	    	ps.add(new Long(tb));

	    	rtn = addRecord(sql,ps);
	    
	    
    	} catch(Exception e) {
    		logger.error("AddTags: "+e);
    	}
	    
	    return rtn;
	    
    }
    
    
    /**
     * The same as AddTag @see Cratylus#AddTag()
     * but accepts an array of tags to insert 
     * @param tags An array of pipe-deliminated entries: AAT subject id | AAT term
     * @param oid The unique object ID for the object being tagged
     * @param an The unique accession number for the object being tagged
     * @param uid The Cratylus user ID
     * @param tid The tagging area defined in Cratylus
     * @param tb The timestamp of the tagging event (epoch)
     * @return success code
     */
    public int AddTags(String[] tags, String oid, String an, String uid, int tid, long tb) {

    	int rtn = 0;
    	try {
    	String sql = "INSERT INTO takiTags (SubjectID, PTerm, ObjectID, AN, UID, TagAreaID, TagBlock) "
    			+"Values(?,?,?,?,?,?,?)";
    	
		    for(String t: tags) {
	
		    	String[] getty = t.split("\\|");
		    	int sid = Integer.parseInt(getty[0]);
		    	String pt = getty[1];
	
		    	Vector<Object> ps = new Vector<Object>(7);
	
		    	ps.add(new Integer(sid));
		    	ps.add(pt);
		    	ps.add(new Integer(oid));
		    	ps.add(an);
		    	ps.add(new Integer(uid));
		    	ps.add(new Integer(tid));
		    	ps.add(new Long(tb));
	
		    	rtn = addRecord(sql,ps);
		    }
	    
    	} catch(Exception e) {
    		logger.error("AddTags: "+e);
    	}
	    
	    return rtn;
	    
    }
    
    
    /**
     * Add a user to the takiUsers table. In the current version of Cratylus, user handles are not stored 
     * and only user cookie data is maintained. This will be replaced in future versions with actual
     * user handles.
     * 
     * @param hand A unique ID to identify a user
     * @param ava The user's provided email address
     * @return success code
     */
    public int RegisterUser(String hand, String ava) {
    	
    	int rtn = -999; // exists=-1
    	
    	// check if entry exists
    	if( HandleAvailable(hand)) {
    		
  	    	String sql = "INSERT INTO takiUsers (UserName, Email) "
  	    					+"Values(?,?)";
    	
  	    	Vector<Object> ps = new Vector<Object>(3);

	    	ps.add(hand);
	    	ps.add(ava);
	    	
	    	rtn = addRecord(sql,ps);
	    	//NotifyUser(fn, em, pt,0);
    	}
    	
    	return rtn;
    }
    
    /**
     * Resets a user's password based on the provided email
     * In the current version of Cratylus, user handles are not stored 
     * and only user cookie data is maintained. This will be replaced in future versions with actual
     * user handles.
     * @param em User's email
     * @return success code
     */
    public int RegeneratePassword(String em) {
    	
    	int rtn = -999; // exists=-1
    	
    	// check if entry exists
    	
    	int UID = GetUserID(em);
    	if( UID > 0) {
    		Element User = GetUserData(UID);
    		String fn = User.getChild("record").getChildText("UserName");
    		
    		String pt = GenerateUserPassword(fn,em);
    		
  	    	String sql = "UPDATE takiUsers SET PTorque=? WHERE UID=?";
    	
  	    	Vector<Object> ps = new Vector<Object>(2);
	    	ps.add(pt);
	    	ps.add(new Integer(UID));
	    	
	    	rtn = addRecord(sql,ps);
	    	NotifyUser(fn, em, pt,1);
    	}
    	
    	return rtn;
    }
    

    /**
     * Attempts to notify user of account setup. Note that this password is not intended to be a truly secure
     * password (think more of a video game pin)
     * In the current version of Cratylus, user handles are not stored 
     * and only user cookie data is maintained. This will be replaced in future versions with actual
     * user handles.
     * @param f User's name
     * @param e User's email
     * @param pw User's password
     * @param t Flag {0|1} to choose which message to display {New account|New password}
     */
    private void NotifyUser(String f, String e, String pw, int t) {

    	int rtn = -9;
    	String[] msg = new String[2];
    	msg[0] ="<p>Dear "+f+"</p>\n\n <p>We have created your Cratylus account. You may login using the "
    			+"email you provided and the following password:</p>\n\n <center>"+pw+"</center>\n\n"
    			+"<p>Happy tagging!</p>\n\n <h3><a href='https://apps.bowdoin.edu/cratylus'>Login to Cratylus</a></h3>";
    	msg[1] ="<p>Dear "+f+"</p>\n\n <p>We have created a new password for your Cratylus account. You may login using the "
    			+"email you provided and the following password:</p>\n\n <center>"+pw+"</center>\n\n"
    			+"<p>Happy tagging!</p>\n\n <h3><a href='https://apps.bowdoin.edu/cratylus'>Login to Cratylus</a></3m>";
    	
    	
    	try {
    		InternetAddress recipient = new InternetAddress(e);
    		Properties props = new Properties();
   	        props.put("mail.smtp.host", "smtp-internal.bowdoin.edu");
   	        javax.mail.Session ses = javax.mail.Session.getDefaultInstance(props, null);
   	        ses.setDebug(false);
   	        javax.mail.Message emsg = new MimeMessage(ses);
   	        InternetAddress addressFrom = new InternetAddress("bcma@bowdoin.edu");
    	    emsg.setFrom(addressFrom);
    	    emsg.addRecipient(javax.mail.Message.RecipientType.TO, recipient);
    		emsg.addRecipient(javax.mail.Message.RecipientType.BCC, new InternetAddress("dfrancis@bowdoin.edu"));    
    	    emsg.setSubject("YOur Cratylus account is ready to use");
    	        emsg.setContent(msg[t], "text/html");
    	        javax.mail.Transport.send(emsg);

    	    } catch (Exception ex) {
    	    	logger.error("NotifyUser:Error sending mail  :"+new java.util.Date()+" :"+ex);
    	    }

    	}
    
    /**
     * A function to create a simple random password. Note that this password is not intended to be a truly secure
     * password but more of a pin number.  
     * In the current version of Cratylus, user handles are not stored 
     * and only user cookie data is maintained. This will be replaced in future versions with actual
     * user handles.
     * @param f user name
     * @param e user email
     * @return a simple non-secure user password for accessing Cratylus
     */
    private String GenerateUserPassword(String f, String e) {
    	// super simple password generator
    	String rtn = "q2$322dWdf%6g&";
    	String[] art = {"basket","ceramic","coin","drawing","engraving","film","glass","paper","silver","stone","wood"};
    	
    	rtn = e.substring(0,1);
    	StringBuilder sb = new StringBuilder(f);
    	rtn += sb.reverse().toString();
    	long rnd = (Math.round(1000*Math.random()) % 99);
    	rtn += rnd;
    	int rnd2 = (int) (Math.round(1000*Math.random()) % art.length);
    	rtn += "_"+art[rnd2];
    	return rtn;
    }
    
    
    /**
     * Checks to see if user with this email already exists. In the current version of Cratylus, user handles are not stored 
     * and only user cookie data is maintained. This will be replaced in future versions with actual
     * user handles.
     * @param em User email
     * @return boolean
     */
    private boolean UserExists(String em) {
    	String sql = "SELECT COUNT(UserName) FROM takiUsers WHERE Email=?";
    	Vector<Object> ps = new Vector<Object>(1);
    	ps.add(em);
    	int count = QueryIntPS(sql,ps);
    
    	return (count > 0);
    	
    	
    }
    
    /**
     * Checks to verify the requested user handle is available
     * In the current version of Cratylus, user handles are not stored 
     * and only user cookie data is maintained. This will be replaced in future versions with actual
     * user handles.
     * @param em User email/handle
     * @return boolean
     */
    public boolean HandleAvailable(String em) {
    	String sql = "SELECT COUNT(UserName) FROM takiUsers WHERE BINARY_CHECKSUM(UserName)=BINARY_CHECKSUM(?)";
    	Vector<Object> ps = new Vector<Object>(1);
    	ps.add(em);
    	int count = QueryIntPS(sql,ps);
    
    	return (count < 1);
    	
    	
    }
    
    
    public int AddUser(String rip) {
    	int rtn = -999;
    	try {
    	String sqlr = "INSERT INTO takiUsers (UserName,Email,PTorque,Logins) Values(?,?,?,?)";
    	Connection connection = this.ds.getConnection();
        PreparedStatement statement = connection.prepareStatement(sqlr,Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, "autoset");
        statement.setString(2, "autoset");
        statement.setString(3, rip);
        statement.setInt(4, 1);
    	rtn = statement.executeUpdate();

		if(rtn > 0) {
			ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                rtn = generatedKeys.getInt(1);

            }

		}
    	} catch(Exception e) {
    		rtn = -999;
    	}
    	
    	return rtn;
    }
    
    
    private int GetUserID(String em) {
    	String sql = "SELECT UID FROM takiUsers WHERE Email=?";
    	Vector<Object> ps = new Vector<Object>(1);
    	ps.add(em);
    	int count = QueryIntPS(sql,ps);
    
    	return count;
    	
    	
    }
    
    
    
    
    public Element GetUserLogin(int handle) {
    	Element rtn = null;
    	
    	String sql = "SELECT UID,LID,UserName,Email,LogIns FROM takiUsers WHERE UID=?";
    	Vector<Object> ps = new Vector<Object>(1);
    	ps.add(new Integer(handle));
    	
    	rtn = xmlQueryPreparedStatement(sql,"UserData",ps);
    	
    	
    	if(null != rtn.getChild("record")) {
    		sql = "UPDATE takiUsers SET LogIns = LogIns+1 WHERE UID=?";
    		addRecord(sql,ps);
    	}
    	
    	return rtn;
    	
    }
    
    
    public int GetUserTagCount(int uid) {
    	Vector<Object> ps = new Vector<Object>(1);
    	ps.add(new Integer(uid));
    	String sql = "select COUNT(*) from takiTags WHERE UID=?";
    	int all = QueryIntPS(sql,ps);
    	
    	return all;
    }
    
    
    public Element GetUserData(int uid) {
    	Element rtn = null;
    	try {
	    	String sql = "select COUNT(DISTINCT t.AN) from takiTags t WHERE t.UID=?";
	    	Vector<Object> ps = new Vector<Object>(1);
	    	ps.add(new Integer(uid));
	    	
	    	int uobjs = QueryIntPS(sql,ps);    	
	    	
	    	int logins = QueryIntPS("SELECT Logins FROM takiUsers WHERE UID=?", ps);
	    	
	    	String museums = queryString("SELECT Museums FROM takiUsers WHERE UID="+uid);
	
	    	sql = "select ranking.Rank FROM (select  UID,ROW_NUMBER() OVER(ORDER BY COUNT(AN) DESC) AS Rank "
	    			+"from takiTags GROUP BY UID) as ranking WHERE ranking.UID = ?";	
	
	    	int tagRank = QueryIntPS(sql,ps);
	    	
	    	
	    	sql = "select COUNT(DISTINCT t.PTerm) from takiTags t WHERE t.UID=?";
	    	int uterms = QueryIntPS(sql,ps);
	    	sql = "select count(*) from (SELECT DISTINCT ObjectID, SubjectID from takiTags where UID=?) tt ";
	    	int tagsets = QueryIntPS(sql,ps);
	    	
	    	sql = "select COUNT(*) from takiTags WHERE UID=?";
	    	int all = QueryIntPS(sql,ps);
	    	
	    	// general cratylus stats
	
	    	sql = "select COUNT(DISTINCT AN) from takiTags";
	    	int c_uobjs = queryInt(sql);
	
	    	sql = "select COUNT(DISTINCT SubjectID) from takiTags";
	    	int c_objs = queryInt(sql);
	
	    	sql = "select COUNT(DISTINCT PTerm) from takiTags";
	    	int c_uterms =queryInt(sql);
	
	    	// this is total number of OIDs that have been tagged
	    	sql = "select count(*) from (SELECT DISTINCT ObjectID, SubjectID from takiTags) tt ";
	    	int c_tagsets = queryInt(sql);
	
	    	sql = "select count(*) from takiTags";
	    	int c_all = queryInt(sql);
	
	    	
	    	sql = "select * from takiUsers WHERE UID=?";
	    	
	
	    	rtn = xmlQueryPreparedStatement(sql,"User",ps);
	
	    	Element cray = new Element("cratylus");
	    	
	    	rtn.addContent(MakeElement("logins", ""+logins));
	    	rtn.addContent(MakeElement("tag_ranking", ""+tagRank));
	    	rtn.addContent(MakeElement("unique_objects_tagged", ""+uobjs));
	    	rtn.addContent(MakeElement("unique_terms_applied", ""+uterms));
	    	rtn.addContent(MakeElement("total_objects_tagged", ""+tagsets));
	    	rtn.addContent(MakeElement("total_tags_applied", ""+all));
	    	cray.addContent(MakeElement("unique_objects_tagged", ""+c_uobjs));
	    	cray.addContent(MakeElement("unique_terms_applied", ""+c_uterms));
	    	cray.addContent(MakeElement("total_objects_tagged", ""+c_tagsets));
	    	cray.addContent(MakeElement("total_tags_applied", ""+c_all));
	    	
	    	
	    	rtn.addContent(cray.detach());
    	
    	} catch(Exception e) {
    		logger.error("GetUserData: "+e);
    	}
    	
    	return rtn;
    	
    }
    
    
    public int GetUidFromMAC(String mi) {
    	int rtn = -1;
    	try {
	    	String sql = "select t.UID from takiUsers t WHERE t.PTorque=?";
	    	Vector<Object> ps = new Vector<Object>(1);
	    	ps.add(mi);
	    	
	    	rtn = QueryIntPS(sql,ps);
	    	
	    	
    	
    	} catch(Exception e) {
    		logger.error("GetUidFromMac: "+e);
    	}
    	
    	return rtn;
    	
    }
    
    
    
    private Element MakeElement(String name, String value) {
    	
    	Element e = new Element(name);
    	e.addContent(value);
    	
    	return e.detach();
    	
    }

}
