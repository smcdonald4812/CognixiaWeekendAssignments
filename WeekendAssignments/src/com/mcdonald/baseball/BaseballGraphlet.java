package com.mcdonald.baseball;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseballGraphlet
 * Servlet for sending the HTML data and bar graph data. 
 */
@WebServlet("/BaseballGraphlet")
public class BaseballGraphlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Utility helper class object with a Map of test game data. 
    private ScoresUtility games = new ScoresUtility();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BaseballGraphlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Sends HTML and bar graph data upon request.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println(
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Baseball Bar Graphs</title>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n" + 
				"</head>\r\n" + 
				"<body><table class=\"table tabel-striped\">"
				);
				//Streams the Map from the utility helper class, and constructs a table with game data in bar graphs.
				games.getMap().values().stream().forEach(x -> {
					//floats for percentage of style width, starts with a base of 1f to avoid division by zero.
					float widthRed = ((1.0f+x.getRedSox())/20.0f)*100.0f, widthOther = ((1.0f+x.getOtherTeam())/20.0f)*100.0f;
					out.println(
							"<tr><td><h2>Game "+x.getGameNumber()+"</h2></td></tr><tr><td><h4>RedSox<h4></td><td><h4>Other Team<h4></td></tr><tr><td><div class=\"progress\">\r\n" + 
							"  <div class=\"progress-bar progress-bar-striped bg-danger active\" role=\"progressbar\"\r\n" + 
							"  aria-valuenow=\""+ x.getRedSox() +"\" aria-valuemin=\"0\" aria-valuemax=\"20\" style=\"width:"+ (int)widthRed + "%\"" +
							">\r\n" + 
							"    "+x.getRedSox()+"\r\n" + 
							"  </div></div></td>\r\n" +
							"  <td><div class=\"progress\"><div class=\"progress-bar progress-bar-striped active\" role=\"progressbar\"\r\n" + 
							"  aria-valuenow=\""+ x.getOtherTeam() +"\" aria-valuemin=\"0\" aria-valuemax=\"20\" style=\"width:"+ (int)widthOther + "%\"" +
							">\r\n" + 
							"    "+x.getOtherTeam()+"\r\n" + 
							"  </div>" +
							"</div></td></tr>"
							);
				});
				out.println("</table></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
