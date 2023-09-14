
public class StringCompoundConcat {
	public static void main(String[] args) {
		String helloString = "Hello";
		String worldString = "World";
		
		String comppundString = "hello";
		comppundString+="world";
		System.out.println("comppundString = "+comppundString);
		
		String comppundString2 = helloString;
		comppundString2+=worldString;
		System.out.println("comppundString2 = "+comppundString2);
		
		String nullString = null;
		nullString+=helloString;
		System.out.println("nullString = "+nullString);
		
		nullString = null;
		String compoundStringWithNull = helloString;
		compoundStringWithNull += nullString;
		System.out.println("compoundStringWithNull = "+compoundStringWithNull);
		
		
		Object charSequenceObject = new StringBuilder("testing");
		String compoundString3 = "charSequenceObject ";
		compoundString3+=charSequenceObject;
		System.out.println("compoundString3 = "+compoundString3);

		charSequenceObject = new StringBuilder("testing");
		charSequenceObject += helloString;
		System.out.println("charSequenceObject = "+charSequenceObject);
		
		Object someOtherObject = new ImmutableString();
		String compoundString4 = "object";
		compoundString4 += someOtherObject;
		System.out.println("compoundString4 = "+compoundString4);
		
		someOtherObject = new ImmutableString();
		someOtherObject+= helloString;
		System.out.println("someOtherObject = "+someOtherObject);
		System.out.println("someOtherObject.toString = "+someOtherObject.toString());
		
		
		int anInt=100;
		
		String compoundString5 = helloString;
		compoundString5 += anInt;
		System.out.println("compoundString5 = "+compoundString5);
		
		String mathString1 = "The Value is ";
		mathString1 +=5+7;
		System.out.println("mathString1 = "+mathString1);
		
		String mathString2 = "The Value is ";
		mathString2 = mathString2+5+7;
		System.out.println("mathString2 = "+mathString2);
		
		String mathString3 = "The Value is ";
		mathString3 = mathString3+(5+7);
		System.out.println("mathString3 = "+mathString3);
		
	}

}
