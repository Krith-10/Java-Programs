package Battleship;

public class SimpleBattleShip{
	int[] locationCells;
	int numOfHits=0;
	
	public void setLocation(int[] locations) {
		locationCells = locations;
	}
	
	public String checkYourself(String stringGuess) {
		String result = "miss";
		int guess = Integer.parseInt(stringGuess);
		
		for(int cell:locationCells) {
			if(guess==cell) {
				numOfHits += 1;
				result="hit";		
				break;
			}
		}
		if(numOfHits == locationCells.length) {
			result="kill";
		}
		return result;
	}
}