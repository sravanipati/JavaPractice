
public class BinaryOperator {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		
		int result = a + e * b - f / c % b;
		System.out.println("result for (a + e * b - f / c % b) = "+result);
		System.out.println("result for (11%10) ="+(11%10));
		for(int i=0;i<=9;i+=3) {
			for(int j=10;j<=100;j+=30) {
				System.out.println("i (" + i +") % j ("+j+") ="+(i%j));
			}
		}
		for(double i=0.5;i<=0.55;i+=0.025) {
			for(double j=10;j<=100;j+=30.57) {
				System.out.println("i (" + i +") % j ("+j+") ="+(i%j));
			}
		}
		try {
		System.out.println("Moduilus with zero divisor (10/0) = "+(10/0));
		}
		catch(Exception e1) {
			e1.printStackTrace(System.out);
		}
		try {
		System.out.println("Moduilus with zero divisor (10.0/0.0) = "+(10.0/0.0));
		}
		catch(Exception e1) {
			e1.printStackTrace(System.out);
		}
	} 

}
