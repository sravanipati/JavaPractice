

interface InterfaceExample {

    String interfaceName = "InterfaceExample";

    static String staticInterfaceName = "StaticInterfaceExample";
    public String publicInterfaceName = "PublicInterfaceName";
    final String finalInterfaceName = "FinalInterfaceName";

    public final String publicFinalInterfaceName = "PublicFinalInterfaceName";
    static final String staticFinalInterfaceName = "StaticFinalInterfaceName";

    public static final String publicStaticFinalInterfaceName = "PublicStaticFinalInterfaceName";

    private String privateMethod() {
        return "private";
    }

    private static String privateStaticMethod() {
        return "private static";
    }

    default String defaultMethod() {
        return privateMethod() + " then default";
    }

    static String publicStaticMethod() {
        return InterfaceExample.privateStaticMethod() + " then static";
    }

    abstract void theImportantMethod();
}

public class InterfaceTest implements InterfaceExample {
    public static void main(String[] args) {

        System.out.println("All fields on an interface are" +
                " public static final:");
        System.out.println(InterfaceExample.interfaceName);
        System.out.println(InterfaceExample.staticInterfaceName);
        System.out.println(InterfaceExample.publicInterfaceName);
        System.out.println(InterfaceExample.finalInterfaceName);
        System.out.println(InterfaceExample.publicFinalInterfaceName);
        System.out.println(InterfaceExample.staticFinalInterfaceName);
        System.out.println(InterfaceExample.publicStaticFinalInterfaceName);

        System.out.println("\nExecuting concrete methods on interface");
        System.out.println(InterfaceExample.publicStaticMethod());

        InterfaceTest it = new InterfaceTest();
        System.out.println(it.defaultMethod());

        System.out.println("\nExecuting methods using the interface type");
        InterfaceTest anotherIt = new InterfaceTest();
        it.testInterface(anotherIt);

        Object o = anotherIt;
        it.testInterface(o);

    }

    public void theImportantMethod() {
        System.out.println("This is the important method that all objects " +
                "implementing InterfaceTest must override and implement ");
    }

    public void testInterface(InterfaceExample it) {
        System.out.println("Executing testInterface with InterfaceExample");
        it.theImportantMethod();
    }

    public void testInterface(Object o) {
        System.out.println("Executing testInterface with Object");
        if (o instanceof InterfaceExample) {

            InterfaceExample it = (InterfaceExample) o;
            it.theImportantMethod();
        }

    }

}