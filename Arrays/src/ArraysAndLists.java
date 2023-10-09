
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAndLists {
    public static void main(String[] args) {

        String[] firstString = {
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"
        };

        List firstList = List.copyOf(Arrays.asList(firstString));
        List secondList = List.of(firstList);

        System.out.println("firstList = " + firstList.toString());
        System.out.println("secondList = " + secondList.toString());

        Object o = firstList.get(0);
        System.out.println(o.getClass().getName());

        o = secondList.get(0);
        System.out.println(o.getClass().getName());

        System.out.println("\n--------  subList example ---------");
        List subList = Arrays.asList(firstString).subList(0, 5);
        System.out.println("subList = " + subList.toString());

        subList.sort(Collections.reverseOrder());
        System.out.println("subList after reverse = "
                + subList.toString());

        System.out.println("firstString array  = "
                + Arrays.toString(firstString));
        System.out.println("firstList = " + firstList.toString());

        System.out.println("\n--------  toArray examples ---------");
        int arrayLength = firstList.size(); // arrayLength changes results

        String[] aArray = new String[arrayLength];

        firstList.toArray(aArray);
        System.out.println("aArray array  = " + Arrays.toString(aArray));

        String[] bArray = new String[arrayLength];

        String[] nextArray = (String[]) firstList.toArray(bArray);
        System.out.println("bArray array  = "
                + Arrays.toString(bArray));

        System.out.println("nextArray array  = "
                + Arrays.toString(nextArray));

        System.out.println("nextArray.equals(bArray) = "
                + nextArray.equals(bArray));

        System.out.println("\n------- Final toArray examples --------");
        String[] arrayRepresentation =
                (String[]) firstList.toArray(new String[0]);

        System.out.println("arrayRepresentation array  = " +
                Arrays.toString(arrayRepresentation));

        Object[] objectArray = firstList.toArray();
        System.out.println("objectArray array  = " +
                Arrays.toString(objectArray));

        String[] newRepresentation = (String[]) objectArray;
        System.out.println("newRepresentation array  = " +
                Arrays.toString(newRepresentation));
    }
}