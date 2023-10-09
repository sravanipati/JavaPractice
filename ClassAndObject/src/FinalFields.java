
class Constants {
    final static String ONE = "final static field ONE = one";
    final static String TWO = "final static field TWO = two";

    final static String THREE;

    static {
        THREE = "final static field THREE = three";
    }

}

public class FinalFields {


    final String FOUR;

    {
        FOUR = "final field FOUR = four";
//        FIVE = "final field FIVE =  five";
    }

    final String FIVE;

    FinalFields() {
        FIVE = "final field FIVE =  five";
    }

    // new constructor takes an argument
    FinalFields(String value) {
        FIVE = "final field FIVE =  " +value;
    }

    public static void main(String[] args) {

        System.out.println(Constants.ONE);
        System.out.println(Constants.TWO);
        System.out.println(Constants.THREE);

        System.out.println((new FinalFields()));

        System.out.println("----------------------------");
        System.out.println((new FinalFields("six")));
    }

    public String toString() {
        return FOUR + "\n" + FIVE;
    }
}