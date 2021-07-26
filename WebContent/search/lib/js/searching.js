/**
	jQuery-based helper library for online search interface for Cratylus tags
 */

/**
	Page initialization
 */
$(document).ready( function() {
	$("#sidebar").height( $(window).height()*.9); // set the sidebar to be nearly height of page
	
	/*
		Event handlers
	 */
	
	// Enable search submission on Enter click
	$('#sget').keypress(function(event) {
		if (event.keyCode == 13 || event.which == 13) {
			$("#cget").click();
		}
	});
	
	// trigger search for similar term vocabularies that were suggested			
	$("li.choo").click( function() {
		var d= $(this).attr("data");
		var t= $(this).html();
		$("#sget").val(t);
		$("#cget").click(); // submit search
				
	});
			
	// Perform search		
	$("#cget").click( function() {
		// Display loading message and clear previous suggested terms DIV			
		$("#loading").html("<p class='blink'>loading other suggestions...</p>");
		$("#gres").html("");
				
		var s = $("#sget").val(); // submitted value
		$("#results").html("");	 // clear previous search results
		
		if(s.length > 2) { // search request must be at least three characters
			s = encodeURI(s);
			$("#pre").show(); // show loading message
			
			
			// load findings into #results DIV
			$("#results").load("SearchCratylus.jsp?s="+s, function() {
				$("#pre").hide(); // hide loading message
				$('#rslts').DataTable(); //set results to be DataTable results
			
				// Objects inserted into the DOM must have handling set after insertion. 
				// make tag results searchable
				$("span.choo").click( function() {
					var d= $(this).attr("data");
					var t= $(this).html();
					$("#sget").val(t);
					$("#cget").click();			
				});
			});
			
			
			// search for similar terms and display			
			$("#gres").load("GettyInUse.jsp?s="+s, function() {
				$("#loading").html("");
				
				// Objects inserted into the DOM must have handling set after insertion. 
				// make tag results searchable
				$("span.choo").click( function() {
					var d= $(this).attr("data");
					var t= $(this).html();
					$("#sget").val(t);
					$("#cget").click();
				});
			});
					
		}
	});		
});