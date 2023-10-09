
class ATest {
}

class BTest extends ATest {
	private String name;

	BTest(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}

public class ConstructorExample {
	public static void main(String[] args) {

		BTest btest = new BTest("Jeff");
		System.out.println(btest.getName());
	}
}