import java.util.Arrays;

public class ArrayExtras {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        long myLong = a;
        System.out.println("myLong = " + myLong);

        long[] longArray = {0, 1, 2, 3, 4};
        System.out.println("longArray = " +
                Arrays.toString(longArray));

        long[] myLongArray = new long[2];
        myLongArray[0] = a;
        myLongArray[1] = b;
        System.out.println("myLongArray = " +
                Arrays.toString(myLongArray));

        Integer aInteger = a;
        Integer bInteger = b;
        System.out.println("aInteger = " + aInteger);

        Integer[] integerArray = {0, 1, 2, 3, 4};
        System.out.println("integerArray = " +
                Arrays.toString(integerArray));

        Integer[] myIntegerArray = new Integer[2];
        myIntegerArray[0] = aInteger;
        myIntegerArray[1] = b;
        System.out.println("myIntegerArray = " +
                Arrays.toString(myIntegerArray));



        System.out.println("\n---- Test methods with common super class");
        Number[] myNumberArray = {0, 1, 2, 4, 5};
        System.out.println("Arrays.mismatch(myNumberArray, integerArray) = "
                + Arrays.mismatch(myNumberArray, integerArray));
        System.out.println("Arrays.equals(myNumberArray, integerArray) = "
                + Arrays.equals(myNumberArray, integerArray));
    }
}