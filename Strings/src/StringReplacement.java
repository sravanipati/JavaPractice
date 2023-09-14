

public class StringReplacement {
    public static void main(String[] args) {

        String mississippi = "Mississippi";
        String[] resultArray = new String[4];

        resultArray[0] = "Replace s with S : " + mississippi.replace('s', 'S');

        resultArray[1] = "Replace literal \"iss\" with \"ips\" : " +
                mississippi.replace("iss", "ips");

        resultArray[2] = "Replace regexp [i with 2 characters(s or p)] with literal \"ax\" : " +
                mississippi.replaceAll("(i(s|p){2})", "ax");

        resultArray[3] = "Replace first match of regexp [i with 2 characters(s or p)] " +
                "with literal \"ax\" : " +
                mississippi.replaceFirst("(i(s|p){2})", "ax");

        for (String result : resultArray) {
            System.out.println(result);
        }

        System.out.println("mississippi.substring(7) = "
                + mississippi.substring(7));

        System.out.println("mississippi.substring(3, 7) = "
                + mississippi.substring(3, 7));  // start index = 3, end index = 7

        System.out.println("mississippi.subSequence(3, 7) = "
                + mississippi.subSequence(3, 7));

        System.out.println("mississippi = " + mississippi);

        mississippi = mississippi.substring(0, 4);
        System.out.println("mississippi = " + mississippi);

    }
}