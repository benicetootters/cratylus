<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="edu.getty.vocabsservices.*,java.net.*,org.apache.axis.message.MessageElement,
    	org.jdom2.*,org.jdom2.input.*,org.jdom2.output.*,edu.bowdoin.volva.*,java.io.*,java.util.*,
    	javax.naming.*,javax.sql.DataSource,org.apache.logging.log4j.*,java.sql.*,edu.bowdoin.cratylus.*,java.nio.charset.StandardCharsets"
    %><%
    /*
		Accepts a string value and returns matching results from Cratylus in table-formated HTML block
	*/
    
    
    response.setHeader("Access-Control-Allow-Origin","*");
	String s = (String) request.getParameter("s");    
	
	// operate only if value exists 
    if( s != null) {   
    	org.apache.logging.log4j.Logger logger = null;
    	
		try {
			// connects to  datasource via Tomcat's environment context and calls the Searching class
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/cratylus");
			logger = LogManager.getLogger("edu.bowdoin.cratylus");
			Searching srch = new Searching(ds,logger);

			// XML set of matching return values
			Element results = srch.SearchTermValue(s);
			s = URLDecoder.decode(s, StandardCharsets.UTF_8.toString());
%>
<h3>Search Results for tags like <em><%=s %></em></h3>
<table id="rslts">
	<thead>
		<tr>
			<td>&nbsp;</td><td>Title</td><td>Maker</td><td>Weight</td><td>Tags</td>
		</tr>
	</thead>
	<tbody>
<%	
if( null != results.getChildren("record")) {
	
	List<Element> recs = results.getChildren("record");
	Iterator<Element> it = recs.iterator();
	
	while(it.hasNext()) {
		Element rec = it.next();
		String oid = rec.getChildText("ObjectID");
		String tc = rec.getChildText("tcount");
		
		Element tags = rec.getChild("Tags");
		List<Element> trecs = tags.getChildren("record");
		Iterator<Element> tit = trecs.iterator();
		
		String tlist = " ";
		
		while(tit.hasNext()) {
			Element trec = tit.next();
			String pt = trec.getChildText("PTerm");
			// let's not display this as a general search term
			if(! pt.equals("not a portrait")) {
				tlist += "<span class='choo'>"+pt+"</span>, ";
			}
		}
		
		tlist = tlist.substring(0, tlist.length()-1);
		tlist = "<em>"+tlist+"</tlist>";
		
		
		// Retrieve EmbARK record to get images and meta data for object by searching via unique object id
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build(new URL("https://artmuseum.bowdoin.edu/results.html?layout=tagging-item&format=xml&maximumRecords=1&recordType=objects_1&query=_ID="+oid));
		Element root = doc.detachRootElement();
		
		if(null != root.getChild("work")) {	
			String ti = root.getChild("work").getChildText("title");
			String mkr = root.getChild("work").getChildText("maker");
			String an = root.getChild("work").getChildText("AN");
			String img = root.getChild("work").getChildText("image");
			String url = root.getChild("work").getChildText("url");
		
			out.write("<tr><td><img style='max-width:100px' src=\""+img+"\" /></td><td><a href='"+url+"' target='_kiosk'>"+ti+"</a></td><td>"+mkr+"</td><td>"+tc+"</td><td>"+tlist+"</tr>");
		} else {
			out.write("<tr><td colspan='3'><em>No matches found</em></td></tr>");
		}
		
	}
} else {
	out.write("<tr><td colspan='3'><em>No matches found</em></td></tr>");
}
%>
	</tbody>
</table>
<%

	} catch(Exception e) { // send error to browser
		out.write("<h3>E: "+e+"</h3>");
	}

}
%>