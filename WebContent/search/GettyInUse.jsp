<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="edu.getty.vocabsservices.*,java.net.*,org.apache.axis.message.MessageElement,
    	org.jdom2.*,org.jdom2.input.*,org.jdom2.output.*,edu.bowdoin.volva.*,java.io.*,java.util.*,
    	javax.naming.*,javax.sql.DataSource,org.apache.logging.log4j.*,java.sql.*,edu.bowdoin.cratylus.*,java.nio.charset.StandardCharsets"
    %><%
    
    /*
    	Accepts a string value and performs two searches:
    		1. Searches this value via the AAT Web service for matches
    		2. Searches the Cratylus tagging datasource for matches
    		
    	Returns matched entries as an HTML block unordered listing
    
    */
    
    response.setHeader("Access-Control-Allow-Origin","*");
	String s = (String) request.getParameter("s");    

	// operate only if value exists    				
    if( s != null) {   
    	s = URLDecoder.decode(s, StandardCharsets.UTF_8.toString());
		out.write("<fieldset><legend>Similar Terms</legend>");

		boolean matches = false;

		// connects to  datasource via Tomcat's environment context and calls the Searching class
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/cratylus");
		org.apache.logging.log4j.Logger logger = LogManager.getLogger("edu.bowdoin.cratylus");
		Searching srch = new Searching(ds,logger);

		// Use AAT web service to search for similar terms
		try {
			AATWebServicesLocator aat = new AATWebServicesLocator();
			AATWebServicesSoap soap = aat.getAATWebServicesSoap(new URL("http://vocabsservices.getty.edu/AATService.asmx?WSDL"));
			AATGetTermMatchResponseAATGetTermMatchResult rsl = soap.AATGetTermMatch(s, "", "");
			MessageElement[] responseObjectArray = rsl.get_any();
			MessageElement responseObject =responseObjectArray[0];
			String doc = responseObject.getAsString();
			SAXBuilder sb = new SAXBuilder();
			Document d = sb.build(new StringReader(doc));
				
			Element root = d.detachRootElement();
		
			// parse XML and generate HTML
			List<Element> subjects = root.getChildren("Subject");
			Iterator<Element> sit = subjects.iterator();

			// found entries
			while( sit.hasNext()) {
				Element subj = sit.next();
				String term = subj.getChildText("Preferred_Term");
		
				// ignore non-Terms and terms too dissimilar
				if( (null !=subj.getChild("Term")) && (subj.getChildText("Term").startsWith(s) 
					|| term.equals(s) )) {
		
					String ppar = subj.getChildText("Preferred_Parent");
			
					try {
						// parse AAT's vocabulary
						ppar = ppar.split(",")[0];
						ppar = ppar.split("\\[")[1];
						ppar = ppar.substring(0, ppar.length()-1);
						String id = subj.getChildText("Subject_ID");
			
						// AAT term found in Cratylus and not same as original search
						if( srch.SearchTermExists(term) && !(term.equals(s))) {
							out.write("<li><span class=\"choo\" data=\""+id+"\">"+term+"</span>");
							AATGetChildrenResponseAATGetChildrenResult rsl2 = soap.AATGetChildren(id);
							MessageElement[] responseObjectArray2 = rsl2.get_any();
							MessageElement responseObject2 =responseObjectArray2[0];
							String doc2 = responseObject2.getAsString();
	
							Document d2 = sb.build(new StringReader(doc2));
							Element croot = d2.detachRootElement();
	
							matches = true;
							out.write("</li>");
						}
			
					} catch(Exception e) {
						logger.error("GettyInUse AAT Entry parsing: "+e);
					}
			
				}				
			}
	
			Element simi = srch.GetSimilarCratylusTerms(s);
	 		
			// XML testing display
			//Transformations t = new Transformations();
	 		//System.out.println(s);
	 		//t.displayXML(simi, new PrintWriter(System.out));
	
	 		// perform a similar search on Cratylus for similar terms
	 		if(simi.getChildren("record") != null) {
				List<Element> lst = simi.getChildren("record");
				Iterator<Element> terms = lst.iterator();

				while( terms.hasNext()) {
					Element aterm = terms.next();
					out.write("<li><span class=\"choo\">"+aterm.getChildText("PTerm")+"</span></li>");
					matches = true;
				}
	 		}
	
	
			if(! matches) {
				out.write("<em>no other suggested terms</em>");
			}
		} catch(Exception e) {
			logger.error("GettyInUse: "+e);
		}

		out.write("</fieldset>");

    }
%>