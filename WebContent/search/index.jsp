<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" session="true" 
    import="javax.naming.*,javax.sql.DataSource,org.apache.logging.log4j.*,java.sql.*,edu.bowdoin.cratylus.*,java.util.*,
    edu.bowdoin.volva.Transformations,org.jdom2.*,java.io.*,org.jdom2.input.*,org.jdom2.output.*"
    %><%
    /*
    	This block of code connects to a datasource via Tomcat's environment context and calls the Searching
    	class in edu.bowdoin.cratylus to retrieve tagging statistics about most popular tags
    */

    String popularTagsBlock = "";
	org.apache.logging.log4j.Logger logger = null;
	try {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/cratylus"); // connect to datasource
		logger = LogManager.getLogger("edu.bowdoin.cratylus"); // connect to logger
		Searching srch = new Searching(ds,logger); // instantiate Searching

		Element results = srch.GetMostUsedTags(10); // Top 10 tags returned as XML

		// Simple XML parsing to return HTML block
		if( null != results.getChildren("record")) {
			List<Element> recs = results.getChildren("record");
			Iterator<Element> it = recs.iterator();
			popularTagsBlock = "<h4>Most Popular Tags</h4><ol>";
			while(it.hasNext()) {
				Element rec = it.next();
				String pt = rec.getChildText("PTerm");
				popularTagsBlock += "<li class='choo'>"+pt+"</li>";
			}
			
			popularTagsBlock += "</ol>";
		}
		
	} catch(Exception e) {
		logger.error("some: "+e);
	}
%><!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cratylus: Search tags</title>
		<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
		<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.min.js"></script>
		<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css" />
		<link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet"></link>
		<script src="lib/js/searching.js"></script>
    
    	<style type="text/css">
    		@import "lib/css/searching.css";
    	</style>
	</head>
	<body>
		<header>
			<div id="crat"><em>Cratylus</em>: Art Tagging</div>
		</header>
		<article>
			<div class="home-quote">&ldquo;the knowledge of names is a great part of knowledge&rdquo;<br />
				<span>&mdash; Socrates, commentary in Cratylus</span>
			</div>
	
			<div>
				<div id="sidebar">
					<p>Search for words that may have been assigned to objects in the BCMA collections. </p>
					<input type="text" id="sget" />
					<input type="button" value="Search" id="cget" /> 
					<div id="loading">&nbsp;</div>
					<div id="gres">&nbsp;</div>
					<%=popularTagsBlock %>		
				</div>
				<div id="results" >
				
				</div>
				<div id="pre">
					<h1 class="blink">Loading results..</h1>
				</div>
		
		</div>
		</article>
	</body>
</html>