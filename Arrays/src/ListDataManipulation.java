import java.util.Arrays;
import java.util.List;

public class ListDataManipulation {
    public static void main(String[] args) {

        String[] primaryColors = {"red", "blue", "yellow"};
        String[] secondaryColors = {"green", "orange", "purple"};

        System.out.println("--- Manipulating array data using a List," +
                " backed by an array");

        List<String> colorList = Arrays.asList(primaryColors);
        System.out.println("colorList: " + colorList.toString());

        String firstColor = colorList.get(0);
        System.out.println("firstColor is " + firstColor);

        colorList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("\ncolorList after sort: "
                + colorList.toString());

        System.out.println("primaryColors "
                + Arrays.toString(primaryColors));

        colorList.set(0, "cyan");
        System.out.println("\ncolorList after after changing 1st value : "
                + colorList.toString());

        System.out.println("primaryColors "
                + Arrays.toString(primaryColors));

        colorList.replaceAll((s) -> s + "ish");
        System.out.println("\ncolorList  after replacing all values: "
                + colorList.toString());

        System.out.println("primaryColors " + Arrays.toString(primaryColors));

        primaryColors[0] = "blueish";
        System.out.println("\ncolorList after array changed: "
                + colorList.toString());

        System.out.println("primaryColors "
                + Arrays.toString(primaryColors));

        System.out.println("\n--- List.of and List.copyOf Examples");

        List secondColorList = List.of(primaryColors);

        List thirdColorList = List.copyOf(Arrays.asList(primaryColors));

        System.out.println("\nsecondColorList : "
                + secondColorList.toString());

        System.out.println("thirdColorList : "
                + thirdColorList.toString());

        primaryColors[0] = "blue";

        System.out.println("\nprimaryColors after making first element blue: "
                + Arrays.toString(primaryColors));

        System.out.println("secondColorList after array changed : "
                + secondColorList.toString());

        System.out.println("thirdColorList after array changed : "
                + thirdColorList.toString());

        try {
            secondColorList.set(0, "cyan");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            thirdColorList.set(0, "cyan");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}