

import java.util.Arrays;

class MostBasicClass {

    public void baseMethod() {
        System.out.println("- PARENT OVERLOAD 'void baseMethod()'");
        return;
    }

    public Object baseMethod(String s) {
        System.out.println("- PARENT OVERLOAD " +
                "'Object baseMethod(String s)'");
        return s;
    }

    public int baseMethod(int... intArray)
            throws ArrayIndexOutOfBoundsException {

        System.out.println("- PARENT OVERLOAD " +
                "'int baseMethod(int... intArray)'");

        return intArray[intArray.length + 1];
    }
}

public class OverrideOverload extends MostBasicClass {

    public void baseMethod() {
        super.baseMethod();
        System.out.println("- CHILD OVERRODE 'void baseMethod()'");
    }

    public Object baseMethod(String[] s) {
        System.out.println("- CHILD OVERLOADED " +
                " 'Object baseMethod(String[] s)'");
        return Arrays.toString(s);
    }


    public Integer baseMethod(String s) {
        System.out.println("- CHILD OVERRODE " +
                " 'Object baseMethod(String s)' with "
                + "'Integer baseMethod(String s)'");
        return Integer.valueOf(s);
    }

    public int baseMethod(int[] intArray) {
        System.out.println("- CHILD OVERRODE 'int baseMethod(int[] intArray)'");
        return intArray[intArray.length - 1];

    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        OverrideOverload oo = new OverrideOverload();
        int i = 0;
        oo.baseMethod();
        oo.baseMethod("10");
        oo.baseMethod(new String[] {"10"});

        try {
            i = oo.baseMethod(intArray);

        } catch (Exception e) {
            System.out.println("Uh oh, error occurred in call to" +
                    " oo.baseMethod(intArray)");
        }
        System.out.println("local variable i = " + i);
    }
}