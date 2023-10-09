
final class FinalEntity {
 
    private String name;
 
    FinalEntity(String name) {
        this.name = name;
    }
 
    void doSomething() {
        System.out.println("doing something for " + this.name);
    }
}
 
public class FinalClassExample {
    public static void main(String[] args) {
 
        FinalEntity f1 = new FinalEntity("a");
        FinalEntity f2 = new FinalEntity("b");
        f1.doSomething();
        f2.doSomething();
    }
}