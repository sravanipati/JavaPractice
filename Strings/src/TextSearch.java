

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearch {
    public static void main(String[] args) {

        String fullText = "testwordtestwordtestword";
        String showIndx = "012345678901234567890123";

        String searchString = "word";

        int lastIndex = fullText.lastIndexOf(searchString);
        System.out.println("lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 19);
        System.out.println("And now the lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 15);
        System.out.println("And now the lastIndex = " + lastIndex);

        String mississippi = "mississippi";
        boolean matches = mississippi.matches("miss");
        boolean indexMatch = (mississippi.indexOf("miss") > -1);
        System.out.println("matches method returns " + matches +
                " on 'miss' BUT indexOf>-1 on 'miss' = " + indexMatch);

        matches = mississippi.matches("mississippi");
        System.out.println("matches method matches on the entire string = " + matches);

        matches = mississippi.matches("^miss(.*)");
        System.out.println("matches method returns " + matches + " on '^miss(.*)'");

        matches = mississippi.matches("(.*)iss(.*)");
        System.out.println("matches method returns " + matches + " on '(.*)miss(.*)'");

        Pattern p = Pattern.compile("(.*)miss(.*)");
        Matcher m = p.matcher("mississippi");
        System.out.println("Pattern & Matcher give same result, matches on '(.*)miss(.*)' = "
                + m.matches());

        System.out.println(mississippi.regionMatches(0, "miss", 0, 4));


        System.out.println(mississippi.regionMatches(true, 0, "MISS", 0, 4));

        System.out.println(mississippi.regionMatches(1, "miss", 0, 4));

        System.out.println(mississippi.regionMatches(2, "miss", 1, 3));

        System.out.println(mississippi.regionMatches(4, "miss", 1, 3));
    }
}