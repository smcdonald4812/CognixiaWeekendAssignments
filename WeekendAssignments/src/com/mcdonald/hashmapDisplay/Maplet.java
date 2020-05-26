package com.mcdonald.hashmapDisplay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Maplet
 * This servlet prints out the HashMap from the utility helper class
 */
@WebServlet("/Maplet")
public class Maplet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//utility helper object, contains the HashMap to be printed
    private HashmapUtility displayMap = new HashmapUtility();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Maplet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Sends the HTML page data to the browser upon request.
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
				"	<div class=\"cover-container d-flex h-100 p-3 mx-auto flex-column\">\r\n" + 
				"		<main role=\"main\" class=\"container\">\r\n" + 
				"							<div class=\"starter-template\">\r\n" + 
				"								<h1>HashMap Output</h1>\r\n" + 
				"								<p class=\"lead\">" +
				"                               <ul class=\"list-group\">"
				);
		//retrieves the HashMap from the utility helper class object and streams it into a list
		displayMap.getMap().keySet().forEach(x -> out.println(
				"<li class=\"list-group-item disabled d-flex justify-content-between align-items-center\"> \r\n" + 
				x +"\r\n" + 
				"<span class=\"badge badge-primary badge-pill\">"
				+ displayMap.getMap().get(x) + "</span> \r\n" + 
				"</li>"
				));
		out.println("</ul></p></div></main></div></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
