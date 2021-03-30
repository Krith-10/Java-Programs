package Battleship;

public class SimpleBattleShipTest{
	
	public static void main(String[] args) {
	
	int noOfGuesses = 0;
	SimpleBattleShip game= new SimpleBattleShip(); 
	GameInputer getInput = new GameInputer();
	
	int number = (int) (Math.random()*8);
	int[] arr = {number,number+1,number+2};
	game.setLocation(arr);
	boolean isAlive = true;
	
	while(isAlive) {
		String guess = getInput.getUserInput("Enter a number: ");
		String result = game.checkYourself(guess);
		System.out.println(result);
		noOfGuesses++;
		if(result.equals("kill"))
			isAlive = false;
	}
	
		System.out.println("Congratulations");
		System.out.println("You took "+noOfGuesses+" guess");
	}
}