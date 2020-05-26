package com.mcdonald.mockSite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Aboutlet
 * Is the about page servlet for the mock site 
 */
@WebServlet("/Aboutlet")
public class Aboutlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aboutlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Sends HTML data for the about page to the browser upon request
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Home</title>\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\"\r\n" + 
				"	integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\"\r\n" + 
				"	crossorigin=\"anonymous\">\r\n" + 
				"</head>\r\n" + 
				"<body class=\"text-center\">\r\n" + 
				"\r\n" + 
				"	<div class=\"cover-container d-flex h-100 p-3 mx-auto flex-column\">\r\n" + 
				"\r\n" + 
				"		<header class=\"masthead\">\r\n" + 
				"			<div class=\"inner\">\r\n" + 
				"				<h3 class=\"masthead-brand\">Cover</h3>\r\n" + 
				"				<nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\r\n" + 
				"					<a class=\"navbar-brand\" href=\"./Homelet\">Home</a>\r\n" + 
				"					<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
				"						data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\"\r\n" + 
				"						aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"						<span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"					</button>\r\n" + 
				"					<a class=\"navbar-brand\" href=\"./Aboutlet\">About Us</a>\r\n" + 
				"					<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
				"						data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\"\r\n" + 
				"						aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"						<span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"					</button>\r\n" + 
				"					<a class=\"navbar-brand\" href=\"./Contactlet\">Contact Us</a>\r\n" + 
				"					<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
				"						data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\"\r\n" + 
				"						aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"						<span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"					</button>\r\n" + 
				"					<a class=\"navbar-brand\" href=\"./Projectlet\">Projects</a>\r\n" + 
				"					<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
				"						data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\"\r\n" + 
				"						aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"						<span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"					</button>\r\n" + 
				"					<a class=\"navbar-brand\" href=\"./Locatelet\">Locations</a>\r\n" + 
				"					<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
				"						data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\"\r\n" + 
				"						aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"						<span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"					</button>\r\n" + 
				"				</nav>\r\n" + 
				"		</header>\r\n" + 
				"\r\n" + 
				"		<main role=\"main\" class=\"inner cover\">\r\n" + 
				"			<h1 class=\"cover-heading\">About Us</h1>\r\n" + 
				"			<p class=\"lead\">This site is an example of what bootstrap and servlets\r\n" + 
				"			can quickly do. This site's page templates are a mixture of a few other\r\n" + 
				"			quick-start bootstrap templates for navigation bars and home pages.</p>\r\n" + 
				"			<p class=\"lead\">\r\n" + 
				"				<a href=\"./Homelet\" class=\"btn btn-lg btn-secondary\">Back Home</a>\r\n" + 
				"			</p>\r\n" + 
				"		</main>\r\n" + 
				"\r\n" + 
				"		<footer\r\n" + 
				"			class=\"navbar fixed-bottom navbar-expand-sm navbar-dark bg-dark\">\r\n" + 
				"			<div class=\"inner\">\r\n" + 
				"				<p class=\"navbar-brand\">\r\n" + 
				"					This was made from templates found at: \r\n" + 
				"					<a href=\"https://getbootstrap.com/\">Bootstrap</a>.\r\n" + 
				"				</p>\r\n" + 
				"			</div>\r\n" + 
				"		</footer>\r\n" + 
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
