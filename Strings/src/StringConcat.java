
public class StringConcat {
	public static void main(String[] args) {
		String helloString = "Hello";
		String worldString ="World";
		
		String firstString = helloString+" "+worldString;
		System.out.println("FirstString = "+firstString);
		
		Object nullObject=null;
		String secondString = nullObject+" "+helloString;
		System.out.println("SecondString = "+secondString);
		
		int i=10;
		String thirdString = i+" "+helloString;
		System.out.println("ThirdString = "+thirdString);
		
		Object ourObject = new OurSimpleClass();
		String fourthString = helloString+" "+ourObject;
		System.out.println("FourthString = "+fourthString);
		
		int j=10;
		String resultString = i+j+"="+i+j;
		System.out.println("ResultString is "+resultString);
		
		String resultStringCorrectedForIntegerMath = i+j+"="+(i+j);
		String resultStringCorrectedForStringConcate = ""+i+j+"="+i+j;
		
		System.out.println("resultStringCorrectedForIntegerMath is "+resultStringCorrectedForIntegerMath);
		System.out.println("resultStringCorrectedForStringConcate is "+resultStringCorrectedForStringConcate);
		
	}

}

class OurSimpleClass{
	public String toString() {
		return "Our Simple Class";
	}
}
