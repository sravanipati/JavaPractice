
public class UnaryOperators {
	public static void main(String[] args) {
		int a=0;
		
		System.out.println("-----Test 1-------------");
		a=1;
		a++;
		System.out.println(" a after a++ = "+a);
		a=1;
		++a;
		System.out.println("a after ++a = "+a);
		
		
		System.out.println("-----Test 2-------------");
		a=1;
		System.out.println("a after a++ = "+ ++a);
		a=1;
		System.out.println("a after ++a = "+ a++);
		System.out.println("after a value is "+a);
		
		System.out.println("--------Test 3--------");
		a=1;
		int a2=a++;
		System.out.println("The value of a is "+a);
		System.out.println("The value of a2 is "+a2);
		
		a=1;
		if(++a == 1) {
			System.out.println("If Statement ,now the value of a is"+a);
		}
		System.out.println("-------End 3 -----------");
		
		System.out.println("-------------Test 4-----------");
		int b=5;
		int loopiterations =0;
		while(--b>0) {
			loopiterations++;
		}
		System.out.println("Prefix Decrementg Iterations used, loopiterations "+loopiterations+" ,b = "+b);
		b=5;
		loopiterations =0;
		while(b-->0) {
			loopiterations++;
		}
		System.out.println("Postfix Decrementg Iterations used, loopiterations "+loopiterations+" ,b = "+b);
		

	}

}
