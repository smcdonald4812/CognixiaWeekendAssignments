package com.mcdonald.scroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Scrollet
 * Creates a reponsive bootstrap HTML page to scroll images.
 */
@WebServlet("/Scrollet")
public class Scrollet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ImageUtility images = new ImageUtility();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Scrollet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Prints out a responsive HTML bootstrap page using ImageUtility to store img src strings,
	 * and a for loop to load them into a scrollable div.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Scrollable Image Container</title>\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\"\r\n" + 
				"	integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\"\r\n" + 
				"	crossorigin=\"anonymous\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark d-block\">\r\n" + 
				"		<div class=\"inner\">\r\n" + 
				"			<p class=\"text-light\">Scrollable Images</p>\r\n" + 
				"		</div>\r\n" + 
				"	</nav>\r\n" + 
				"	<div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable d-block\">\r\n"); 
				//loops through a String[] of image url links and places them in HTML img tags.
				for(String s: images.imageLinks()) {
					out.println("<img class=\"img-fluid\" src=\""+s+"\">"); 
				}
				out.println("</div>\r\n" + 
				"	<nav class=\"navbar navbar-expand-md navbar-dark fixed-bottom bg-dark d-block\">\r\n" + 
				"		<div class=\"inner\">\r\n" + 
				"			<p class=\"text-light\">\r\n" + 
				"				Templates can be found at <a href=\"https://getbootstrap.com/\">Bootstrap</a>\r\n" + 
				"			</p>\r\n" + 
				"		</div>\r\n" + 
				"	</nav>\r\n" + 
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
