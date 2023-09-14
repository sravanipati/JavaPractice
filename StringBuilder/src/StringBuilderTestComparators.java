

public class StringBuilderTestComparators {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("This is a test");
        StringBuilder sb2 = new StringBuilder("This is a test");

        System.out.println("(sb == sb2) = " + (sb == sb2));

        System.out.println("(sb.equals(sb2)) = " + (sb.equals(sb2)));

        System.out.println("(sb.compareTo(sb2)) = " + (sb.compareTo(sb2)));

        System.out.println("sb.toString().equals(sb2.toString()) = " +
                sb.toString().equals(sb2.toString()));

        System.out.println("sb.toString() == sb2.toString()) = " +
                (sb.toString() == sb2.toString()));

    }
}