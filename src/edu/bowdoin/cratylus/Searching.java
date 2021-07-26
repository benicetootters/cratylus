package edu.bowdoin.cratylus;

import java.util.*;

import javax.sql.DataSource;

import org.apache.logging.log4j.Logger;
import org.jdom2.Element;

import edu.bowdoin.volva.DataUtilities;

public class Searching extends DataUtilities {

	
    /** 
     * Constructor initiates the data source and logger
     * @param ds data source
     * @param log4j Apache log4j2 logger
     */
    public Searching(DataSource ds, Logger log4j) {
		this.logger = log4j;
    	this.ds = ds;
	}
    
    public Element SearchTaggedSubjects(String val) {
    	Element rtn = null;
    	 
    	try {
    		String sql = "select PTerm,SubjectID FROM takiTags WHERE PTerm LIKE ? GROUP BY PTerm,SubjectID " + 
    			"ORDER BY PTerm ASC";
    		Vector<Object> ps = new Vector<Object>(1);
	    	ps.add("%"+val+"%");
	    	rtn = xmlQueryPreparedStatement(sql,"QuickTerms",ps);
    	} catch(Exception e) {
    		logger.error("SearchTaggedSubjects: "+e);
    	}
    	
    	return rtn;
    }
    
    public Element SearchTermValue(String val) {
    	Element rtn = null;
 
    	try {
	    	String sql = "select ObjectID, COUNT(ObjectID) AS 'tcount' from takiTags WHERE PTerm LIKE ? AND PTerm <> 'not a portrait' GROUP BY ObjectID ORDER BY COUNT(ObjectID) DESC";
	    	Vector<Object> ps = new Vector<Object>(1);
	    	ps.add("%"+val+"%");
	    	

	    	rtn = xmlQueryPreparedStatement(sql,"Terms",ps);
	
	    	if( null != rtn.getChildren("record")) {
	    		
	    		List<Element> recs = rtn.getChildren("record");
	    		Iterator<Element> it = recs.iterator();
	    		
	    		while(it.hasNext()) {
	    			Element rec = it.next();
	    			String oid = rec.getChildText("ObjectID");
	    			Element tags = GetObjectTags(oid);
	    			rec.addContent(tags.detach());
	    		}
	    	}
	    	
    	
    	} catch(Exception e) {
    		logger.error("SearchTermValue: "+e);
    	}
    	
    	return rtn;
    	
    }
    
    
    public Element GetObjectTags(String oid) {
    	Element rtn = null;
 
    	try {
	    	String sql = "select PTerm from takiTags WHERE ObjectID=? ORDER BY PTerm ASC";
	    	Vector<Object> ps = new Vector<Object>(1);
	    	ps.add(new Integer(oid));
	    	

	    	rtn = xmlQueryPreparedStatement(sql,"Tags",ps);
	
	    	
    	
    	} catch(Exception e) {
    		logger.error("SearchTermValue: "+e);
    	}
    	
    	return rtn;
    	
    }
    
    public Element GetObjectsByTag(String pterm) {
    	Element rtn = null;
    	 
    	try {
	    	String sql = "select ObjectID, COUNT(ObjectID) AS 'tcount' from takiTags WHERE PTerm=?  GROUP BY ObjectID ORDER BY COUNT(ObjectID) DESC";
	    	Vector<Object> ps = new Vector<Object>(1);
	    	ps.add(pterm);
	    	

	    	rtn = xmlQueryPreparedStatement(sql,"Terms",ps);
	
	    	
    	
    	} catch(Exception e) {
    		logger.error("SearchTermValue: "+e);
    	}
    	
    	return rtn;
    	
    }
    
    public Element GetMostUsedTags(int count) {
    	
    	String sql = "select TOP "+count+" PTerm,COUNT(PTerm) as 'howmany' from takiTags  WHERE PTerm <> 'not a portrait' AND PTerm <> 'portrait' GROUP BY PTerm ORDER BY COUNT(PTerm) DESC";

    	return xmlQueryData(sql, "Terms");
    	
    }
    
    public Element GetMostTaggedObjects(int count) {
    	
    	String sql = "select TOP "+count+" ObjectID,COUNT(AN) as 'howmany' from takiTags GROUP BY ObjectID ORDER BY COUNT(AN) DESC";

    	return xmlQueryData(sql, "Objects");
    	
    }
    
    
    public boolean SearchTermExists(String val) {
    	boolean rtn = false;
    	try {
	    	String sql = "select COUNT(TID) from takiTags WHERE PTerm=?";
	    	Vector<Object> ps = new Vector<Object>(1);
	    	ps.add(val);
	    	

	    	rtn = (QueryIntPS(sql,ps) > 0);
	
	    	
    	
    	} catch(Exception e) {
    		logger.error("SearchTermValue: "+e);
    	}
    	
    	return rtn;
    	
    }
    
    public Element GetSimilarCratylusTerms(String val) {
    	Element rtn = null;
    	String sql = "select PTerm,COUNT(PTerm) AS 'tc' from takiTags WHERE PTerm LIKE ? AND PTerm <> ? GROUP BY PTerm ORDER BY PTerm ASC";
    	Vector<Object> ps = new Vector<Object>(2);
    	ps.add("%"+val+"%");
    	ps.add(val);

    	rtn = xmlQueryPreparedStatement(sql,"Terms",ps);
    	
    	return rtn;
    	
    }

}
