package com.mcdonald.hashmapDisplay;

import java.util.HashMap;
import java.util.stream.Stream;

/**
 * 
 * @author steven
 * Utility helper class for the Maplet servlet. This class holds the test data for the
 * HashMap that is to be printed, and the HashMap itself
 */
public class HashmapUtility {
	private HashMap<Integer, String> displayMap;
	private Integer[] mapKeys = {0, 1, 2, 3, 4};
	private String[] mapValues= {"first value","second value","third value","fourth value","fifth value"};
	
	/**
	 * default constructor for this class
	 */
	public HashmapUtility() {
		this.displayMap = new HashMap<>();
		//loads data into displayMap
		loadMap();
	}
	
	/**
	 * Streams data into the new HashMap during instantiation 
	 */
	private void loadMap() {
		Stream.of(this.mapKeys).forEach(x -> displayMap.put(mapKeys[x], mapValues[x]));
	}
	
	/**
	 * The method for getting the HashMap in this helper utility class
	 * @return HashMap<Integer, String>
	 */
	public HashMap<Integer, String> getMap() {
		return this.displayMap;
	}
}
