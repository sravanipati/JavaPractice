public class Test {
    static int testVariable;
 
    public static void main(String[] args) {
        byte i, j;
        for (i = 100, j = 0; i <= 300; i += 90, j++) { 
            testVariable = i % 50;   
            System.out.println(testVariable + " "); 
        }
        System.out.println(j); 
    }
}