

public class TextTransform {
    public static void main(String[] args) {

        String repeatString = "Repeat After Me ";

        repeatString = repeatString.repeat(3);
        System.out.println("repeatString = " + repeatString);

        repeatString = repeatString.repeat(0);
        System.out.println("repeatString = " + repeatString);

        String charsToString = String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e'});

        String charsToStringPartial = String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3);
        String subString = charsToString.substring(1, 3);

        System.out.println("charsToString = " + charsToString);
        System.out.println("charsToStringPartial = " + charsToStringPartial
                + ", subString = " + subString);

    }
}