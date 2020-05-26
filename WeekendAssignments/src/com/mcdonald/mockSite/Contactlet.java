package com.mcdonald.mockSite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contactlet
 * Is the contact page servlet for the mock site 
 */
@WebServlet("/Contactlet")
public class Contactlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contactlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Sends HTML data for the project page to the browser upon request.
	 * Also redirects to ContactDataServlet via the contact form submit button.
	 * This servlet uses the session to get and set a session attribute flag,
	 * which is used by both the servlet and ContactDataServlet to confirm the form
	 * was sent after submission.  
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
				"			<h1 class=\"cover-heading\">Contact Us</h1>\r\n" + 
				"			<form action=\"./ContactDataServelet\">\r\n" + 
				"  <div class=\"form-group\">\r\n" + 
				"    <label for=\"emailInput\">Email address</label>\r\n" + 
				"    <input type=\"email\" class=\"form-control\" id=\"emailInput\" name=\"emailInput\" placeholder=\"name@email.com\" required>\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"form-group\">\r\n" + 
				"    <label for=\"textInput\">Message</label>\r\n" + 
				"    <textarea class=\"form-control\" id=\"textInput\" name=\"textInput\" rows=\"3\"></textarea>\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"form-group\">\r\n" + 
				"    <button class=\"btn\" type=\"submit\" value=\"Submit\">Submit</button>\r\n" + 
				"    <button class=\"btn\" type=\"reset\" value=\"Reset\">Clear</button>\r\n" + 
				"  </div>\r\n" + 
				"</form>\r\n");
				//checks session attribute to determine whether the h3 tag should be added to the page
				if(request.getSession().getAttribute("flag")=="TRUE") {
					out.println("<h3>Message has been Sent<h3>");
				}
				//sets the flag attribute in the session
				request.getSession().setAttribute("flag", "FALSE");
				out.println("			<p class=\"lead\">\r\n" + 
				"				<a href=\"./Homelet\" class=\"btn btn-lg btn-secondary\">Back Home</a>\r\n" + 
				"			</p>\r\n" + 
				"		</main>\r\n" + 
				"\r\n" + 
				"		<footer\r\n" + 
				"			class=\"navbar fixed-bottom navbar-expand-sm navbar-dark bg-dark\">\r\n" + 
				"			<div class=\"inner\">\r\n" + 
				"				<p class=\"navbar-brand\">\r\n" + 
				"					This was made from templates found at: <a\r\n" + 
				"						href=\"https://getbootstrap.com/\">Bootstrap</a>.\r\n" + 
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
