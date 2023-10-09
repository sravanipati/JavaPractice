
class OrderedClass {
	static int statementOrder;

	int a = clarify("assigning a");

	{
		clarify("initializer 1");
	}

	int b = clarify("assigning b");

	{
		clarify("initializer 2");
	}

	OrderedClass() {
		clarify("constructor");
	}

	int c = clarify("assigning c");

	{
		clarify("initializer 3");
	}

	int clarify(String message) {
		statementOrder++;
		System.out.println(statementOrder + " " + message);
		return statementOrder;
	}
}

public class IntializeOrder {
	public static void main(String[] args) {
		OrderedClass o = new OrderedClass();
	}
}