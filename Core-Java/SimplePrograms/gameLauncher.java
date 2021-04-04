package SimplePrograms;
import java.util.Scanner;

class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int p1guess = 0;
		int p2guess = 0;
		int p3guess = 0;
		
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
		
		int target = (int)(Math.random() * 10);
		System.out.println("The target is set..Let's see who wins!!");
		
		int round = 0;
		
		while(true) {
			round = round+1;
			System.out.println();
			System.out.println("Round "+round+" has started:");
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			p1guess = p1.number;
			p2guess = p2.number;
			p3guess = p3.number;
			
			System.out.println("Player 1 has guessed: "+p1guess);
			System.out.println("Player 2 has guessed: "+p2guess);
			System.out.println("Player 3 has guessed: "+p3guess);
			
			if(p1guess==target) {
				p1IsRight = true;
			}
			if(p2guess==target) {
				p2IsRight = true;
			}
			if(p3guess==target) {
				p3IsRight = true;
			}
			
			if(p1IsRight) {
				System.out.println("P1 has guessed correctly...The winner is P1...Congratulations!!!");
				break;
			}
			
			if(p2IsRight) {
				System.out.println("P2 has guessed correctly...The winner is P2...Congratulations!!!");
				break;
			}
			
			if(p3IsRight) {
				System.out.println("P3 has guessed correctly...The winner is P3...Congratulations!!!");
				break;
			}
		}
	}
}

class Player {
	int number = 0;
	void guess() {
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter the number between 0 and 9 :");
	number = myObj.nextInt();
	}
}

class gameLauncher{
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
