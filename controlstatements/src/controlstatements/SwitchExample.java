package controlstatements;

public class SwitchExample {

	public static void main(String[] args) {
		String[] strs = { "A", "B", "C", "D" };
		int iteration = 0;
		for (String s : strs) {
			System.out.println("-----------iteration " + (++iteration) + ", s=" + s + " -------------------");
			switch (s) {
			case "A":
				System.out.println("DO A");
			default:
				System.out.println("DOING THIS");
			case "B":
				System.out.println("DO B");
			case "C":
				System.out.println("DO C");
			}

		}
	}
}
