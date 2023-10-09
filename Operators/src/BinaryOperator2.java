
public class BinaryOperator2 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=1;
		
		if(a==c) {
			System.out.println("a and c primitive values are same.");
		}
		if(a!=b) {
			System.out.println("a and b primitive values are not same so both are notequal");
		}
		String s1="hello";
		String s2 = new String(s1);
		String s3 = s2.intern();
		
		if(s1==s3) {
			System.out.println("String are equal if they interned or are string literals.");
		}
		if(s1!=s2) {
			System.out.println("Otherwise String objects are not equal");
		}
		
		Object o1=s1;
		Object o2=s1;
		Object o3 = new String(s1);
		
		if(o1 == o2) {
			System.out.println("Objects are equal if they have same reference value.");
		}
		if(o1!=o3) {
			System.out.println("Otherwise objects are not equal.");
		}
	}

}
