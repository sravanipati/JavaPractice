
public class NarrowExample {
	public static void main(String[] args) {
		System.out.println("a byte has a range of "+Byte.MIN_VALUE+ " to "+Byte.MAX_VALUE);
//		System.out.println("a char has a range of "+ String.format("\\u0%4 to \\u04x",(int) Character.MIN_VALUE+ " to "+(int) Character.MAX_VALUE);
		System.out.println("a char has a range of "+(int) Character.MIN_VALUE+ " to "+(int) Character.MAX_VALUE);
		System.out.println("a short has a range of "+Short.MIN_VALUE+ " to "+Short.MAX_VALUE);
		System.out.println("a int has a range of "+Integer.MIN_VALUE+ " to "+Integer.MAX_VALUE);
		System.out.println("a long has a range of "+Long.MIN_VALUE+ " to "+Long.MAX_VALUE);
		System.out.println("a float has a range of "+Float.MIN_VALUE+ " to "+Float.MAX_VALUE);
		System.out.println("a double has a range of "+Double.MIN_VALUE+ " to "+Double.MAX_VALUE);
	}

}
