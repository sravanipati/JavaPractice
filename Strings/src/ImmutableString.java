
public class ImmutableString {
	public static void main(String[] args) {
		String s1="Hello";
		s1=s1+"World";
		System.out.println(s1);
		s1="Hello";
		s1.concat("World");
		System.out.println(s1);
	}

}
