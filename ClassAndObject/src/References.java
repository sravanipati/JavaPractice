
class TestClass {
 
    private String a = "a";
    private String b = "b";
 
    // Constructor
    TestClass(String a, String b) {
        this.a = a;
        this.b = b;
    }
 
    public String toString() {
        return a + "-" + b;
    }
}
 
public class References {
    public static void main(String[] args) {
 
        TestClass aref = new TestClass("a", "z");
 
        TestClass bref = new TestClass("first", "last");
 
        TestClass cref = new TestClass("start", "end");
 
        TestClass dref = null;
        TestClass eref = null;
 
        aref = bref;
        System.out.println("aref has a reference to object : " + aref);
 
        dref = bref;
        System.out.println("dref has a reference to object : " + dref);
 
        eref = bref = cref;
        System.out.println("eref has a reference to object : " + eref);

        aref = dref = null;
        System.out.println("---------Finally-------------");
        System.out.println("aref has a reference to object : " + aref);
        System.out.println("bref has a reference to object : " + bref);
        System.out.println("dref has a reference to object : " + cref);
        System.out.println("dref has a reference to object : " + dref);
        System.out.println("eref has a reference to object : " + eref);
 
    }
}