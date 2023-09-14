

public class StringComparison {
    public static void main(String[] args) {

        String nullString = null;
        String stringHello1 = "Hello"; 
        String stringhEllo = "hEllo";  
        String stringHello2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        StringBuilder helloStringBuilder = new StringBuilder("Hello");

        String firstString = stringhEllo;   
        String secondString = stringHello1;     
        Object secondObject = secondString; 
        CharSequence secondSequence = secondString; 

        TestEqualsOperand(firstString, secondString);

        TestEqualsMethod(firstString, secondObject);

        TestEqualsIgnoreCaseMethod(firstString, secondString);

        TestContentEqualsMethod(firstString, secondSequence);

        TestCompareToMethod(firstString, secondString);

        TestCompareToIgnoreCaseMethod(firstString, secondString);

    }

    public static void TestEqualsOperand(String firstString, Object secondObject) {
        System.out.println(String.format("(%s == %s) = " +
                (firstString == secondObject), firstString, secondObject));

    }

    public static void TestEqualsMethod(String firstString, Object secondObject) {
        try {
            System.out.println(String.format("%s.equals(%s) = " +
                    (firstString.equals(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    public static void TestEqualsIgnoreCaseMethod(String firstString, String secondObject) {
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " +
                    (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    public static void TestContentEqualsMethod(String firstString, CharSequence secondSequence) {
        try {
            System.out.println(String.format("%s.contentEquals(%s) = " +
                    (firstString.contentEquals(secondSequence)), firstString, secondSequence));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondSequence, e.getClass().getName()));

        }
    }

    public static void TestCompareToMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareTo(%s) = " +
                    (firstString.compareTo(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }

    public static void TestCompareToIgnoreCaseMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareToIgnoreCase(%s) = " +
                    (firstString.compareToIgnoreCase(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }
}