//Class for the player of the game
public class UserInfo {
	
	private int playerScore;
	private String playerName;
	
	//Constructor
	UserInfo(String name){
		this.playerScore = 0;
		this.playerName = name;
	}
	
	//Returns the current players name
	String getName() {
		return this.playerName;
	}
	
	//Returns the current players score
	int getScore() {
		return this.playerScore;
	}
	
	//Adds 1 to score
	void incrementScore() {
		this.playerScore++;
	}
	
	//Subtracts 1 from score
	void decrementScore() {
		this.playerScore--;
	}
	
}
