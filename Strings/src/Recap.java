
public class Recap {
	public static void main(String[] args) {
		EqualLiteralReference();
		StringConstructors();
		StringConstructorsInterned();
	}

	private static void StringConstructorsInterned() {
		//interns checks the string pool.
		String s1= new String("Hello").intern();
		String s2=new String("Hello").intern();
		System.out.println("s1 and s2 are Interned String Objects"+
		" assigned to String variables:(s1==s2) = "+
				((s1==s2)?"True":"False"));
		
	}

	private static void StringConstructors() {
		String s1= new String("Hello");
		String s2=new String("Hello");
		System.out.println("s1 and s2 are Constructor String Objects"+
		" assigned to String variables:(s1==s2) = "+
				((s1==s2)?"True":"False"));
		
	}

	private static void EqualLiteralReference() {
		String s1= "Hello";
		String s2="Hello";
		System.out.println("s1 and s2 are String literals"+
		" assigned to String variables:(s1==s2) = "+
				((s1==s2)?"True":"False"));
	}
	

}
