

import java.util.List;
import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {

        String[] firstString = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};
        String[] copyOfFirstString = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};
        String[] firstStringUnsorted = {"jkl", "mno", "pqr", "stu", "vwx",
                "yz", "abc", "def", "ghi"};
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno"};

        String firstStringReference[] = firstString;

        List firstList = Arrays.asList(firstString);
        List secondList = Arrays.asList(copyOfFirstString);

        System.out.println("------------- Object.equals ------------");
        System.out.println(" (firstString.equals(copyOfFirstString)) = "
                + firstString.equals(copyOfFirstString));
        System.out.println(" (firstString.equals(firstStringReference)) = "
                + firstString.equals(firstStringReference));

        System.out.println("\n------------- Arrays.equals ------------");
        System.out.println(" (Arrays.equals(firstString,copyOfFirstString)) = "
                + Arrays.equals(firstString, copyOfFirstString));
        System.out.println(" (Arrays.equals(firstString,firstStringReference)) = "
                + Arrays.equals(firstString, firstStringReference));
        System.out.println(" (Arrays.equals(firstString,firstStringUnsorted)) = "
                + Arrays.equals(firstString, firstStringUnsorted));

        System.out.println("\n------------- Arrays.compare ------------");
        System.out.println(" (Arrays.compare(firstString,copyOfFirstString)) = "
                + Arrays.compare(firstString, copyOfFirstString));
        System.out.println(" (Arrays.compare(firstString,firstStringReference)) = " +
                "" + Arrays.compare(firstString, firstStringReference));
        System.out.println(" (Arrays.compare(firstString,firstStringUnsorted)) = "
                + Arrays.compare(firstString, firstStringUnsorted));
        System.out.println(" (Arrays.compare(firstStringUnsorted,firstString)) = "
                + Arrays.compare(firstStringUnsorted, firstString));
        System.out.println(" (Arrays.compare(firstString,partialFirstString)) = "
                + Arrays.compare(firstString, partialFirstString));
        System.out.println(" (Arrays.compare(partialFirstString,firstString)) = "
                + Arrays.compare(partialFirstString, firstString));


        System.out.println("\n------------- More Arrays.compare ------------");
        System.out.println(" (Arrays.compare(firstString,firstStringUnsorted)) = "
                + Arrays.compare(firstString, firstStringUnsorted));

        System.out.println("firstString[0].compareTo(firstStringUnsorted[0]  = "
                + firstString[0].compareTo(firstStringUnsorted[0]));

        String[] notFullyPrefixedString = {"abc", "def", "ghi", "yz", "vwx", "stu"};
        System.out.println(" (Arrays.compare(firstString,notFullyPrefixedString)) = "
                + Arrays.compare(firstString, notFullyPrefixedString));

        System.out.println("firstString[3].compareTo(notFullyPrefixedString[3]  = " +
                firstString[3].compareTo(notFullyPrefixedString[3]));


        System.out.println("\n----  Arrays.compare for Element Ranges ----");

        String[] stringArray = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};

        String[] stringUnsortedArray = {"jkl", "mno", "pqr", "stu",
                "vwx", "yz", "abc", "def", "ghi"};

        System.out.println(" (Arrays.compare(stringArray, 0, 3, stringUnsortedArray, 6, 9)) = "
                + Arrays.compare(stringArray, 0, 3, stringUnsortedArray, 6, 9));

        System.out.println(" (Arrays.compare(stringArray, 0, 5, stringUnsortedArray, 6, 9)) = "
                + Arrays.compare(stringArray, 0, 5, stringUnsortedArray, 6, 9));

        System.out.println("\n------------- List.equals ------------");
        System.out.println(" (firstList.equals(secondList)) = "
                + firstList.equals(secondList));
    }
}