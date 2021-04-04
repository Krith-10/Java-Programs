package Battleshipmain;

import java.util.*;

public class BattleShipBlast{
	private int noOfGuesses = 0;
	private GetInput inputer = new GetInput();
	private ArrayList<BattleShipSet> dotComList = new ArrayList<BattleShipSet>();
	
	private void setUpGame() {
		BattleShipSet one = new BattleShipSet();
		one.setName("Google");
		BattleShipSet two = new BattleShipSet();
		two.setName("Facebook");
		BattleShipSet three = new BattleShipSet();
		three.setName("Tesla");
		
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink the three giants");
		System.out.println("Bassed upon the minimum number of guesses you would win");
		
		for(BattleShipSet x : dotComList) {
			ArrayList<String> newLocation = inputer.placeDotCom(3);
			x.setLocation(newLocation);
		}
	}
	
	private void startPlaying() {
		while(!dotComList.isEmpty()) {
			String userGuess = inputer.getUserInput("Enter the guess: ");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String guess) {
		noOfGuesses++;
		String result = "miss";
		for(int i=0; i<dotComList.size(); i++) {
			result = dotComList.get(i).checkYourself(guess);
			
			if (result == "hit") {
				break;
			}
			
			if (result == "sink") {
				dotComList.remove(i);
				break;
			}
		}
		if(result!="sink") {
			System.out.println(result);
		}
	}
	
	private void finishGame() {
		System.out.println("You took "+noOfGuesses+" guesses to sink them all");
		System.out.println("Game over");
	}
	
	public static void main(String[] args) {
		System.out.println("Game begins!!!");
		BattleShipBlast obj = new BattleShipBlast();
		obj.setUpGame();
		obj.startPlaying();
	}
}