package com.mcdonald.accordion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Accordlet
 * This servlet has HTML and JQuery data for the accordion example
 */
@WebServlet("/Accordlet")
public class Accordlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accordlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Sends HTML and JQuery data upon request for the accordion example assignment
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"<title>Accordion Assignment</title>\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n" + 
				"<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n" + 
				"<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n" + 
				"<script>\r\n" + 
				"	$(function() {\r\n" + 
				"		$(\"#accordion\").accordion({\r\n" + 
				"			collapsible : true\r\n" + 
				"		});\r\n" + 
				"	});\r\n" + 
				"</script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<div id=\"accordion\" class=\"ui-accordion ui-widget ui-helper-reset\"\r\n" + 
				"		role=\"tablist\">\r\n" + 
				"		<h3\r\n" + 
				"			class=\"ui-accordion-header ui-corner-top ui-state-default ui-accordion-icons ui-accordion-header-collapsed ui-corner-all\"\r\n" + 
				"			role=\"tab\" id=\"ui-id-1\" aria-controls=\"ui-id-2\" aria-selected=\"false\"\r\n" + 
				"			aria-expanded=\"false\" tabindex=\"0\">\r\n" + 
				"			<span class=\"ui-icon-triangle-1-e\"></span>Servlet\r\n" + 
				"		</h3>\r\n" + 
				"		<div\r\n" + 
				"			class=\"ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content\"\r\n" + 
				"			id=\"ui-id-2\" aria-labelledby=\"ui-id-1\" role=\"tabpanel\"\r\n" + 
				"			aria-hidden=\"true\" style=\"display: none; height: 213px;\">\r\n" + 
				"			<p>Servlets allow java to be used to dynamically manipulate HTML documents. Servlets can\r\n" + 
				"			also be used as middleware and to connect to larger java programs running in the background. </p>\r\n" + 
				"		</div>\r\n" + 
				"		<h3\r\n" + 
				"			class=\"ui-accordion-header ui-corner-top ui-accordion-header-collapsed ui-corner-all ui-state-default ui-accordion-icons\"\r\n" + 
				"			role=\"tab\" id=\"ui-id-3\" aria-controls=\"ui-id-4\" aria-selected=\"false\"\r\n" + 
				"			aria-expanded=\"false\" tabindex=\"-1\">\r\n" + 
				"			<span class=\"ui-icon-triangle-1-e\"></span>Bootstrap\r\n" + 
				"		</h3>\r\n" + 
				"		<div\r\n" + 
				"			class=\"ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content\"\r\n" + 
				"			id=\"ui-id-4\" aria-labelledby=\"ui-id-3\" role=\"tabpanel\"\r\n" + 
				"			aria-hidden=\"true\" style=\"display: none; height: 213px;\">\r\n" + 
				"			<p>Bootstrap allows developers to quickly set up HTML documents without the need for creating custom\r\n" + 
				"			CSS files to handle common designs. Bootstrap makes their styling capabilities available via a CDN,\r\n" + 
				"			and many pre-built templates can also be found online.</p>\r\n" + 
				"		</div>\r\n" + 
				"		<h3\r\n" + 
				"			class=\"ui-accordion-header ui-corner-top ui-accordion-header-collapsed ui-corner-all ui-state-default ui-accordion-icons\"\r\n" + 
				"			role=\"tab\" id=\"ui-id-5\" aria-controls=\"ui-id-6\" aria-selected=\"false\"\r\n" + 
				"			aria-expanded=\"false\" tabindex=\"-1\">\r\n" + 
				"			<span class=\"ui-icon-triangle-1-e\"></span>JQuery\r\n" + 
				"		</h3>\r\n" + 
				"		<div\r\n" + 
				"			class=\"ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content\"\r\n" + 
				"			id=\"ui-id-6\" aria-labelledby=\"ui-id-5\" role=\"tabpanel\"\r\n" + 
				"			aria-hidden=\"true\" style=\"display: none; height: 213px;\">\r\n" + 
				"			<p>JQuery is a simple yet powerful JavaScript library. It helps with quick manipulation of the \r\n" + 
				"			DOM, and adds features to JavaScipt such as functionality for waiting for a document to load\r\n" + 
				"			before execution.</p>\r\n" + 
				"		</div>\r\n" + 
				"		<h3\r\n" + 
				"			class=\"ui-accordion-header ui-corner-top ui-accordion-header-collapsed ui-corner-all ui-state-default ui-accordion-icons\"\r\n" + 
				"			role=\"tab\" id=\"ui-id-7\" aria-controls=\"ui-id-8\" aria-selected=\"false\"\r\n" + 
				"			aria-expanded=\"false\" tabindex=\"-1\">\r\n" + 
				"			<span class=\"ui-icon-triangle-1-e\"></span>HTML\r\n" + 
				"		</h3>\r\n" + 
				"		<div\r\n" + 
				"			class=\"ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content\"\r\n" + 
				"			id=\"ui-id-8\" aria-labelledby=\"ui-id-7\" role=\"tabpanel\"\r\n" + 
				"			aria-hidden=\"true\" style=\"display: none; height: 213px;\">\r\n" + 
				"			<p>HTML is a unified markup language like XML that is quiet popular and can be run on all\r\n" + 
				"			major browser. HTML uses tags to structure documents for display in a browser. This markup\r\n" + 
				"			language allows for easy manipulation by languages such as JavaScript to allow developers to\r\n" + 
				"			make useful and visually appealing web pages.</p>\r\n" + 
				"		</div>\r\n" + 
				"		<h3\r\n" + 
				"			class=\"ui-accordion-header ui-corner-top ui-state-default ui-accordion-icons ui-accordion-header-collapsed ui-corner-all\"\r\n" + 
				"			role=\"tab\" id=\"ui-id-1\" aria-controls=\"ui-id-2\" aria-selected=\"false\"\r\n" + 
				"			aria-expanded=\"false\" tabindex=\"0\">\r\n" + 
				"			<span class=\"ui-icon-triangle-1-e\"></span>CSS\r\n" + 
				"		</h3>\r\n" + 
				"		<div\r\n" + 
				"			class=\"ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content\"\r\n" + 
				"			id=\"ui-id-2\" aria-labelledby=\"ui-id-1\" role=\"tabpanel\"\r\n" + 
				"			aria-hidden=\"true\" style=\"display: none; height: 213px;\">\r\n" + 
				"			<p>CSS helps to format documents displayed on web pages. This style sheet language is \r\n" + 
				"			particularly useful for creating separate documents for web sites that can help format\r\n" + 
				"			multiple web pages without having to repeat the same lines of code on seperate pages.</p>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
