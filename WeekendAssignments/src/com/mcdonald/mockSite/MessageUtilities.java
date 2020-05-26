package com.mcdonald.mockSite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author steven
 * A utility helper class for the ContactDataServlet servlet.
 * This is used in place of routing messages to an actual email address,
 * as this is a mockup site. Messages are instead stored in a Map, that 
 * has a String key and a ContactEmail object as a value.
 *
 */
public class MessageUtilities {
	private Map<String, ContactEmail> messagesMap;
	private List<String> keys;
	
	/**
	 * MessageUtilities constructor
	 */
	public MessageUtilities() {
		this.messagesMap = new HashMap<>();
		this.keys = new ArrayList<>();
	}
	
	/**
	 * returns a List of the keys for the Map
	 * @return List<String> keys
	 */
	public List<String> getKeys() {
		return keys;
	}
	
	/**
	 * Retrieves the message from a specific ContactEmail object
	 * @param String key
	 * @return String message or "No results were found." if the object isn't found.
	 */
	public String getMessage(String key) {
		if(this.messagesMap.containsKey(key)) return this.messagesMap.get(key).getMessage();
		return new String("No results were found.");
	}
	
	/**
	 * Retrieves the email from a specific ContactEmail object
	 * @param String key
	 * @return String email or "No results were found." if the object isn't found.
	 */
	public String getEmail(String key) {
		if(this.messagesMap.containsKey(key)) return this.messagesMap.get(key).getEmail();
		return new String("No results were found.");
	}
	
	/**
	 * Stores the contact form data object ContactEmail and adds the
	 * key to the List of keys
	 * @param String key
	 * @param ContactEmail siteMessage
	 */
	public void storeMessage(String key, ContactEmail siteMessage) {
		this.keys.add(key);
		this.messagesMap.put(key, siteMessage);
	}
}
