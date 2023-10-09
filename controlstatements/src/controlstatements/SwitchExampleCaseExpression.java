package controlstatements;

public class SwitchExampleCaseExpression {
	 
    public static void main(String[] args) {
        String str = "";
        String test = "12";
        switch (test) {
            case ("1"):
                System.out.println("Output is 1");
                break;
            case ("1" + "2"):  // concatenation operator in expression.
                System.out.println("Output is 12");
                break;
            case ("2"):
                System.out.println("Output is 2");
                break;
            default:
                System.out.println("Output is default");
        }
    }

}
