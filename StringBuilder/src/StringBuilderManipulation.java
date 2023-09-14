

public class StringBuilderManipulation {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("World Hello, How are you?");
        System.out.println("Original Value in sb = " + sb);

        System.out.println("sb.deleteCharAt(sb.indexOf(\",\") = " +
                sb.deleteCharAt(sb.indexOf(",")));

        System.out.println("sb.delete(11,sb.length()) = " +
                sb.delete(11, sb.length()));

        sb.reverse();
        System.out.println("sb after reverse() method called = " + sb);

        StringBuilder rb = sb.reverse();
        System.out.println("(rb == ss) = " + (rb == sb));

        sb.append(" How are you?");
        System.out.println("sb = " + sb);
        System.out.println("rb = " + rb);

        String subString = sb.substring(0, 5);
        System.out.println("subString = " + subString);
        System.out.println(sb);

    }
}