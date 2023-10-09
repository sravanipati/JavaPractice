package controlstatements;

public class IfElseExample {
    public static void main(String[] args) {
        boolean flag = false;
        boolean subflag = true;
        if (flag) ; 
        else System.out.println("1. flag is false");

        if (flag)
            if (subflag) System.out.println("2. subflag is true");
            else
                System.out.println("2. subflag is false"); // Dangling else
        else System.out.println("2. flag is false");

        if (flag)
            if (subflag) System.out.println("3. subflag is true");
        else System.out.println("3. flag is false"); // Dangling else

        subflag = false;
        if (flag)
            if (subflag) System.out.println("4. subflag is true");
        else System.out.println("4. subflag is false");
        else System.out.println("4. flag is false"); // Is this an extra else?

        flag = false;
        if (flag = true) {
            System.out.println("5. flag is true");
        } else System.out.println("5. flag is false");

        boolean a = false;
        boolean b = false;
        boolean c = false;

        if ((a = true) || (b = true) && (c = true)) ;
        System.out.println(a + " " + b + " " + c);

        a = false;
        b = false;
        c = false;
        if ((a = true) && (b = true) || (c = true)) ;
        System.out.println(a + " " + b + " " + c);

    }
}