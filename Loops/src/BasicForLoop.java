
public class BasicForLoop {
	public static void main(String[] args) {
		String[] str = {"one","two","three"};
		System.out.println("-----------  TRADITIONAL FOR LOOP -----------");
		for (int i = 0; i < str.length; i++) {
			System.out.println("Argument " + (i + 1) + " = " + str[i]);
		}

		System.out.println("-----------  ENHANCED FOR LOOP -----------");
		int i = 0;
		for (String s: str) {
			System.out.println("Argument " + (++i) + " = " + s);
		}
	}
}