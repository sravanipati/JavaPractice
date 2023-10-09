
 
class OnlyClass {
 
    private OnlyClass() {
    }
 
    private int classVariable;
 
    private static final OnlyClass instance = new OnlyClass();
 
    public static OnlyClass getInstance() {
        return instance;
    }
 
    public static void doSomething() {
        instance.doSomethingRestricted();
    }
 
    private void doSomethingRestricted() {
        this.classVariable++;
        System.out.println("Only one instance of this class exists" +
                " or will ever exist");
    }
}
 
public class RestrictedObjects {
    public static void main(String[] args) {
        OnlyClass.doSomething();
    }
}