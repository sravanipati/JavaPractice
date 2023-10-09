
class SuperClass {
    static String name;
    String instanceName;
 
    SuperClass(String name, String instanceName) {
        SuperClass.name = name;
 
        this.instanceName = instanceName;
    }
 
    public String toString() {
        return "name: " + SuperClass.name + ", instanceName: " +
                this.instanceName;
    }
}
 
public class StaticFieldSamples {
 
    public static void main(String[] args) {
        SuperClass a, b, c;
 
        System.out.println(a = new SuperClass("A", "One"));
        System.out.println(b = new SuperClass("B", "Two"));
        System.out.println(c = new SuperClass("C", "Three"));
        System.out.println("-------------------------------");
 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}