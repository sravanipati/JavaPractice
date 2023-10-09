import java.util.Arrays;
import java.util.Collections;

public class ArrayDataManipulation {
    public static void main(String[] args) {
 
        System.out.println("--- Manipulating data with Arrays static methods");
 
        Integer[] intArray = new Integer[10];
        System.out.println("Array values initially: "
                + Arrays.toString(intArray));
 
        Arrays.fill(intArray, 5);
        System.out.println("Array values after fill: "
                + Arrays.toString(intArray));
        
 
        int partialFillValue = 9;
        Arrays.fill(intArray, 5, 10, partialFillValue);
        System.out.println("Array values after partial fill: "
                + Arrays.toString(intArray));
 
        Arrays.setAll(intArray, (index) -> index + 1);
        System.out.println("Array values after setAll: "
                + Arrays.toString(intArray));
 
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Array values after reverse sort: "
                + Arrays.toString(intArray));
 
        Arrays.parallelPrefix(intArray, (left, right) -> left + right);
        System.out.println("Array values after parallelPrefix: "
                + Arrays.toString(intArray));
 
    }
}
