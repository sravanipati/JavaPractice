
public class Bar {
	static byte staticBarByte;
	static char staticBarChar;
	static short staticBarShort;
	static int staticBarInt;
	static long staticBarLong;
	static float staticBarFloat;
	static double staticBarDouble;
	
	static boolean staticBarBoolean;
	
	
	byte barByte;
	char barChar;
	short barShort;
	int barInt;
	long barLong;
	float barFloat;
	double barDouble;
	
	boolean barBoolean;
	
	public static void main(String[] args) {
		Bar bar = new Bar();
		
		System.out.println("----------Class Variable----");
		
		System.out.println("Bar.staticByte = "+Bar.staticBarByte);
		System.out.println("Bar.staticChar = "+Bar.staticBarChar);
		System.out.println("Bar.staticShort = "+Bar.staticBarShort);
		System.out.println("Bar.staticInt = "+Bar.staticBarInt);
		System.out.println("Bar.staticLong = "+Bar.staticBarLong);
		System.out.println("Bar.staticFloat = "+Bar.staticBarFloat);
		System.out.println("Bar.staticDouble = "+Bar.staticBarDouble);
		System.out.println("Bar.staticBoolean = "+Bar.staticBarBoolean);
		
		
		

		System.out.println("----------static Variable----");
		
		System.out.println("barByte = "+bar.barByte);
		System.out.println("barChar = "+bar.barChar);
		System.out.println("barShort = "+bar.barShort);
		System.out.println("barInt = "+bar.barInt);
		System.out.println("barLong = "+bar.barLong);
		System.out.println("barFloat = "+bar.barFloat);
		System.out.println("barDouble = "+bar.barDouble);
		System.out.println("barBoolean = "+bar.barBoolean);
	}

}
