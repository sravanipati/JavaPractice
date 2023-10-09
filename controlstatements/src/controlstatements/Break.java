package controlstatements;

public class Break {
	public static void main(String[] args) {
		final int score1 = 8, score2 = 3;
		char myScore = 7;
		switch (myScore) {
		default:
			score1: System.out.print("great-");
			System.out.print("good-");
			break;
//			score2: System.out.print("not good-");
		}
	}
}
