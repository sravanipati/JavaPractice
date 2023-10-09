
public class OperatorOddities2 {
	public static void main(String[] args) {
		int number=10;
		int result =0;
		
		System.out.println("------First case-------------");
		for(int i =10;i<=50;i+=10) {
			number =i;
			result = --number - number--;
			System.out.println("i = "+i+", number = "+number+", result = "+result);
		}
		
		System.out.println("------Second case-------------");
		for(int i =10;i<=50;i+=10) {
			number =i;
			result = number-- - --number;
			System.out.println("i = "+i+", number = "+number+", result = "+result);
		}
		System.out.println("------Third case-------------");
		for(int i =10;i<=20;i+=10) {
			number =i;
			result = number-- - number++ * --number;
			System.out.println("i = "+i+", number = "+number+", result = "+result);
		}
		System.out.println("------Fourth case-------------");
			number =10;
			boolean isEqual = (number--) == (number+=1);
			System.out.println("isEqual "+isEqual+" and number is = "+number);
			
		System.out.println("----------Final Testr---------");
		    number =10;
		    number = number--;
		    System.out.println("number ="+number);
	}

}
