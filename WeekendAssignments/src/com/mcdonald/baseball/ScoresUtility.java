package com.mcdonald.baseball;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author steven
 * Utility helper class for the baseball bar graph example. This utility class has
 * 2019 MLB game data from the Red Sox games in arrays. This data is stored in Game
 * objects in a HashMap for easy retrieval.
 */
public class ScoresUtility {
	private int[] redSox = {8, 8, 3, 4, 6, 13, 3, 1, 9, 9, 8, 1, 1, 2, 2, 1, 4, 5, 4, 1, 6, 1, 3, 
			1, 6, 8, 10, 12, 2, 7, 4, 7, 5, 8, 0, 0, 6, 3, 8, 4, 1, 5, 7, 6, 5, 4, 1, 0, 3, 6, 6, 
			4, 4, 2, 11, 7, 1, 2, 9, 5, 7, 4, 6, 15, 9, 1, 8, 2, 14, 9, 11, 4, 6, 1, 3};
    private int[] otherTeam = {5, 5, 4, 5, 7, 5, 4, 9, 7, 3, 4, 6, 12, 4, 10, 8, 4, 9, 4, 14, 1, 
    		8, 2, 4, 4, 0, 6, 3, 3, 16, 12, 6, 6, 10, 7, 1, 3, 7, 15, 5, 0, 7, 6, 4, 9, 0, 8, 8, 
    		5, 4, 5, 3, 7, 4, 4, 3, 2, 5, 4, 1, 3, 6, 1, 2, 2, 4, 5, 1, 1, 5, 2, 5, 5, 3, 7};
	private Map<Integer, Game> scoreMap;
    
	/**
	 * Constructor for this class, loads scoreMap
	 * with test data for use in the example bar graphs.
	 * 
	 */
    public ScoresUtility() {
    	this.scoreMap = new HashMap<>();
    	loadMap();
    }
    
    /**
     * Retrieve's this object's Map.
     * @return Map<Integer, Game>
     */
    public Map<Integer, Game> getMap() {
    	return this.scoreMap;
    }
    
    /**
     * Loads Map during instantiation.
     */
	private void loadMap() {
		for (int i = 0; i < otherTeam.length; i++) {
			scoreMap.put(i, new Game(redSox[i], otherTeam[i]));
		}
	}
}
