package com.mcdonald.mockSite;

/**
 * 
 * @author steven
 * This class is used to store the data of the contact form
 * in the utility helper classes Map.
 */
public class ContactEmail {
	private String email, message;
	
	/**
	 * default constructor for a new ContactEmail object.
	 */
	public ContactEmail() {
		this.email = new String("");
		this.message = new String("");
	}
	
	/**
	 * constructor for a new ContactEmail object with both
	 * the email and message from the contact form as Strings.
	 */
	public ContactEmail(String email, String message) {
		this.email = email;
		this.message = message;
	}
	
	/**
	 * Sets this object's email
	 * @return String email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets this object's email String.
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets this object's message String.
	 * @return String message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets this object's message String.
	 * @param String message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
