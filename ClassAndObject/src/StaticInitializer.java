

class staticInitExample {
	static int statementOrder;
	static int firstVariable = clarifyOrder("assigning firstVariable");

	static {
		clarifyOrder("executing initializer 1");
	}

	static int secondVariable = clarifyOrder("assigning secondVariable");

	static {
		clarifyOrder("executing initializer 2");
	}

	static int clarifyOrder(String message) {
		statementOrder++;
		System.out.println(statementOrder + " " + message);
		return statementOrder;
	}
}

public class StaticInitializer {
	public static void main(String[] args) {
		System.out.println("statements made so far = " + staticInitExample.statementOrder);
	}
}