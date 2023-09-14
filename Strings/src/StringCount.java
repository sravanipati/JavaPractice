

public class StringCount {
    public static void main(String[] args) {

        String stringOriginal = "aaabbb";

        String stringReplaced = stringOriginal.replace('C', 'a');
        System.out.println("1.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replace("CC", "aa");
        System.out.println("2.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceAll("CC", "aa");
        System.out.println("3.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceFirst("CC", "aa");
        System.out.println("4.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replace('a', 'a');
        System.out.println("5.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replace("a", "a");
        System.out.println("6.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceAll("a", "a");
        System.out.println("7.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceFirst("a", "a");
        System.out.println("8.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.substring(0, stringOriginal.length());
        System.out.println("9.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        String s1 = "abc" + ":" + "def";

        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";

        String s5 = s4 + s3 + s2 + s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
}