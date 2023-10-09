
public class UnaryOperatorMore {
	public static void main(String[] args) {
		int a=1,b=-a;
		System.out.println(" a = "+a+" b = "+b);
		a=-1;
		b=-a;
		System.out.println(" a = "+a+" b = "+b);
		a=1;
		b=+a;
		System.out.println(" a = "+a+" b = "+b);
		a=-1;
		b=+a;
		System.out.println(" a = "+a+" b = "+b);
		
		
		
		
		int bin1= 0b00000000_00000000_00000000_00000000;
		int bin2 = ~bin1;
		System.out.println("bin1 = "+bin1+ "( "+Integer.toBinaryString(bin1)+" )"
		+" bin2 = "+bin2+ "( "+Integer.toBinaryString(bin2)+" )");
		
		boolean myBoolean = false;
		boolean myBoolean2 = !myBoolean;
		
		System.out.println("myBoolean "+myBoolean+" the opposite is "+myBoolean2);
		
		
	}

}
