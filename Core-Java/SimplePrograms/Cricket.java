package SimplePrograms;

public class Cricket {
	private int score;
  
	public void four() {
		score = score + 4;
	}

	public void six() {
		score = score + 6;
	}

	public int getScore() {
		return score;
	}

	public static void main(String[] args) {
		Cricket scorer = new Cricket();
		scorer.six();
		scorer.four();
		System.out.println(scorer.getScore());
	}
}
