

public class TestValueOf {

    public static void main(String[] args) {

        String george = "FredGeorgeSmith";

        String shortGeorge1 = new String(george.toCharArray(), 4, 6);
        System.out.println("shortGeorge1 = " + shortGeorge1);

        String shortGeorge2 = String.valueOf(george.toCharArray(), 4, 6);
        System.out.println("shortGeorge2 = " + shortGeorge2);

        String shortGeorge3 = george.substring(4, 6);
        System.out.println("shortGeorge3 = " + shortGeorge3);

        String shortGeorge4 = george.substring(4, 10);
        System.out.println("shortGeorge4 = " + shortGeorge4);

        System.out.println("george = " + george);
    }
}