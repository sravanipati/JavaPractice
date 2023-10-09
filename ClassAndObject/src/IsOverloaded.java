
 
class Load {
    public void bestMethod(int i) {
        System.out.println("bestMethod for int");
    }
 
    public void bestMethod(Integer i) {
        System.out.println("bestMethod for Integer");
    }
 
    public void bestMethod(Number i) {
        System.out.println("bestMethod for Number");
    }
 
    public void bestMethod(Comparable i) {
        System.out.println("bestMethod for Comparable");
    }
 
    public void bestMethod(Object i) {
        System.out.println("bestMethod for Object");
    }
 
    public void bestMethod(int... i) {
        System.out.println("bestMethod for var args (int)");
    }
 
    public void bestMethod(Integer... i) {
        System.out.println("bestMethod for var args (Integer)");
    }
}
 
public class IsOverloaded {
    public static void main(String[] args) {
        Load n = new Load();
        int myInt = 1;
        Integer myInteger = Integer.valueOf(1);
        n.bestMethod(myInt);
        n.bestMethod(myInteger);
        n.bestMethod((Number) myInteger);
        n.bestMethod((Comparable) myInteger);
        n.bestMethod((Object) myInteger);
 
    }
}