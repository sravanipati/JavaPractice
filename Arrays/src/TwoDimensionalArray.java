
import java.util.Arrays;

public class TwoDimensionalArray {

    public static void printArray(String arrayName, int[][] inputArray) {
        System.out.println("------------------------------------------");
        System.out.println(arrayName + " Reference: " + inputArray);
        for (int row = 0; row < inputArray.length; row++) {
            printRow(arrayName, inputArray[row], row);
        }
    }

    public static void printRow(String arrayName, int[] inputArray, int row) {
        System.out.println(arrayName + " : " + inputArray + " : Row "
                + (row + 1) + " :  " + Arrays.toString(inputArray));

    }

    public static void main(String[] args) {

        int[][] intArray = new int[2][10];

        printArray("intArray", intArray);

        System.out.println("Printing a multi-dimensional array using " +
                "Arrays.deepToString()");
        System.out.println(Arrays.deepToString(intArray));


        int[][] variableCols = {
                {1, 2, 3},
                {5, 6, 7, 8},
                {0, 3, 4, 6},
                {1}
        };
        printArray("variableCols", variableCols);

        int[][] clonedArray = variableCols.clone();
        printArray("clonedArray", (int[][]) clonedArray);

        int[][] copiedCopy = (int[][]) Arrays.copyOf(variableCols,
                variableCols.length);
        printArray("copiedCopy", copiedCopy);

        System.out.println("-------------------------------------------");
        printRow("variableCols", variableCols[2], 2);
        printRow("copiedCopy", ((int[][]) copiedCopy)[2], 2);
        printRow("clonedArray", ((int[][]) clonedArray)[2], 2);

        System.out.println("-------------------------------------------");
        for (int i = 0; i < clonedArray.length; i++) {
            clonedArray[i] = clonedArray[i].clone(); 
        }
        variableCols[2][3] = 10000;

        printRow("variableCols", variableCols[2], 2);
        printRow("clonedArray", clonedArray[2], 2);
        System.out.println("-------------------------------------------");

    }
}