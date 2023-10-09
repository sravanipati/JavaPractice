
interface MyInterface {

    String doSomething(String s);
}

class MyClass implements MyInterface {

    public String doSomething(String s) {
        return "3.  MyClass " + s;
    }
}

public class FunctionalInterfaceArguments {
    public static void main(String[] args) {

        MyInterface i = (s) -> "1.  variable " + s;

        executeInterface(i);

        executeInterface((s) -> "2.  unnamed " + s);

        executeInterface(new MyClass()::doSomething);

        executeInterface(FunctionalInterfaceArguments.returnInterface());

    }

    private static void executeInterface(MyInterface i) {
        System.out.println(i.doSomething("hello"));
    }

    private static MyInterface returnInterface() {
        MyInterface i = (s) -> "4.  method " + s;
        return i;
    }
}