public class Test {
    static int i; //this is instance/class variable.
    public static void main(String[] args) {
 
        int i, j, k= 10; // Line 1 // this are local variable
        i = Test.i+k; // Line 2 i=0+10;
        System.out.println("loacl i is "+i);
        k = i+++k;  // Line 3 k=10+10;
        System.out.println("loacl k is "+k);        
//        Test.i = j+i; // Line 4
        System.out.println(i+" " +k);
    }
 
}