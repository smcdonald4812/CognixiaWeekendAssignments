package com.mcdonald.baseball;

/**
 * 
 * @author steven
 * Object that holds the game data for the helper utility class.
 * Also contains a static count to hold the each game objects game number.
 *
 */
public class Game {
	private int redSox, otherTeam, gameNumber;
	private static int count = 1;
	
	/**
	 * Instantiates a Game object with the two teams scores
	 * @param int redSox
	 * @param int otherTeam
	 */
	public Game(int redSox, int otherTeam) {
		this.redSox = redSox;
		this.otherTeam = otherTeam;
		//static count for easy retrieval of the games number within the 2019 MLB season  
		this.gameNumber = count++;
	}
	
	/**
	 * Gets this object's int redSox
	 * @return int redSox
	 */
	public int getRedSox() {
		return redSox;
	}
	
	/**
	 * Sets the object's int redSox.
	 * @param int redSox
	 */
	public void setRedSox(int redSox) {
		this.redSox = redSox;
	}
	
	/**
	 * Gets this object's int otherTeam
	 * @return int otherTeam
	 */
	public int getOtherTeam() {
		return otherTeam;
	}
	
	/**
	 * Sets the object's int otherTeam.
	 * @param int otherTeam
	 */
	public void setOtherTeam(int otherTeam) {
		this.otherTeam = otherTeam;
	}
	
	/**
	 * Gets the object count from this class.
	 * @return int gameNumber
	 */
	public int getGameNumber() {
		return this.gameNumber;
	}
}
