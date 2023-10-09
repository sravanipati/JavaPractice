 
import java.util.Arrays;
 
public class ArrayTransforms {
    public static void main(String[] args) {
 
        System.out.println("-----------Using Arrays.copyOf ----------");
 
        Integer[] originalArray = new Integer[10];
 
        Arrays.setAll(originalArray, (index) -> index + 1);
        System.out.println("integerArray values = "
                + Arrays.toString(originalArray));
 
        Integer[] copiedArray =
                Arrays.copyOf(originalArray, originalArray.length);
 
        System.out.println("copiedArray values = "
                + Arrays.toString(copiedArray));
 
        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);
 
        Integer[] widenedArray = Arrays.copyOf(originalArray, 15);
 
        System.out.println("trimmedArray values = "
                + Arrays.toString(trimmedArray));
 
        System.out.println("widenedArray values = "
                + Arrays.toString(widenedArray));
 
        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println("croppedArray values = "
                + Arrays.toString(croppedArray));
 
        croppedArray[0] = 5;
        System.out.println("croppedArray values after a change = "
                + Arrays.toString(croppedArray));
 
    }
}