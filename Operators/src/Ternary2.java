

public class Ternary2 {
	public static void main(String args[]) {
		boolean hasArguments = (args.length == 0)?false:true;
		boolean b=true;
		int result = (b && (hasArguments && args[0].equals("10")))?10:0;
		System.out.println("Result of result1 "+result);
	}

}
