
abstract class ConceptualClass {
 
    protected ConceptualClass() {
 
    }
 
    public abstract void printSomething(String s1);
}
 
class RealClass extends ConceptualClass {
 
    public void printSomething(String s1) {
        System.out.println(s1);
    }
}
 
public class AbstractClassExample2 {
    public static void main(String[] args) {
 
        RealClass c = new RealClass();
 
        c.printSomething("Hello World");
 
    }
}