package com.mcdonald.mockSite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ContactDataServelet
 * This servlet collects data from the contact form, and
 * places it in the MessageUtilities HashMap for this example site in place of
 * routing it to a real email address. This servlet also sets the flag attribute
 * in the session for the Contactlet servlet to determine whether to add an h3
 * tag.
 */
@WebServlet("/ContactDataServelet")
public class ContactDataServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//adds an int to the email name to create a key for each message
	private int messageCounter = 0;
	//the utility helper object for this part of the mockup site
    private MessageUtilities messageStorage = new MessageUtilities();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactDataServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Recieves and stores data from the contact form from the Contactlet servlet. This
	 * doGet method also sets the flag attribute in the session for use in Contactlet.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//the session and the created flag attribute
		HttpSession session = request.getSession();
		session.setAttribute("flag", "TRUE");
		//checks message for null or is empty
		if(request.getParameter("textInput")!=null & request.getParameter("textInput").length() > 0) {
			//checks if email is null (mail is required and therefore cannot be empty)
			if(request.getParameter("emailInput")!=null) {
				//stores the email and message in a ContactEmail object and uses part of the email and a count as the key
				messageStorage.storeMessage(
						request.getParameter("emailInput").substring(0, request.getParameter("emailInput").indexOf("@"))+(messageCounter++),
						new ContactEmail(request.getParameter("emailInput"), request.getParameter("textInput")));
			}
		}
		//adds header and redirects
		response.addHeader("confirmation", "confirm");
		response.sendRedirect("./Contactlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
