

import java.util.Arrays;

public class CastExtras {

    static class BaseClass {
        String name = "Base Case";

        public String toString() {
            return getClass().getName();
        }
    }

    static class NextClass extends BaseClass {
        String name = "Next Best Case";
    }

    public static void main(String[] args) {

        Object[] myObjectArray = new Object[10];

        Arrays.fill(myObjectArray, new NextClass());

        myObjectArray[5] = new StringBuilder("test");

        System.out.println(myObjectArray.getClass().getTypeName());
        System.out.println(Arrays.toString(myObjectArray));

        try {
            for (Object o : myObjectArray) {
                NextClass n = (NextClass) o;
                System.out.println(n.name);

                BaseClass b = (BaseClass) o;
                System.out.println(b.name);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        BaseClass mixedArray[] = new BaseClass[6];
        Arrays.fill(mixedArray,0, 3, new NextClass());
        Arrays.fill(mixedArray,3, 6, new BaseClass());

        System.out.println(Arrays.toString(mixedArray));
        for (BaseClass n : mixedArray) {
            System.out.println(n + ":" +
                    ((n instanceof NextClass) ? ((NextClass) n).name : n.name)
            );
        }

    }
}