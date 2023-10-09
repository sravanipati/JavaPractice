

class MixItUpClass {
	static int statementOrder;

	int a = clarify("assigning a", statementOrder);

	{
		clarify("initializer 1", this.a);
	}

	int b = clarify("assigning b", this.a);

	{
		clarify("initializer 2", this.b);
	}

	MixItUpClass() {
		d = clarify("constructor", this.d);
	}

	int c = clarify("assigning c", this.b);

	{
		clarify("initializer 3", this.c);
	}

	int clarify(String message, int passedVariable) {
		statementOrder++;
		System.out.println(statementOrder + " " + message);
		return statementOrder;
	}

	int d;

	public String toString() {
		return this.a + ", " + this.b + ", " + this.c + ", " + this.d;
	}
}

public class InitializerOrderMore {
	public static void main(String[] args) {
		System.out.println(new MixItUpClass());
	}
}