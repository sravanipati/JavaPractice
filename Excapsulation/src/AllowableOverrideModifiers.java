
class Employee {
    public void printPublic() {
        System.out.println("An Employee can make a public statement");
    }

    protected void printProtected() {
        System.out.println("An Employee can make a protected statement");
    }

    void printPackage() {
        System.out.println("An Employee can make a package statement");
    }

    private void printPrivate() {
        System.out.println("An Employee can make a private statement, " +
                "but only the employee can make it accessible through" +
                " other means..");
    }

    protected void blog() {
        printPrivate();
    }
}

class Boss extends Employee {

    public void printPrivate() {
        System.out.println("A Boss's private statements can " +
                "be made public now");
    }

    protected void printPackage() {
        System.out.println("A Boss's packaged speech can " +
                "be shared with his children as well now.");
    }

//    private void printPublic() {
//        System.out.println("A Boss's public speech cannot be made private");
//    }
//
//    void printProtected() {
//        System.out.println("A Boss's protected speech cannot be packaged");
//    }
}

public class AllowableOverrideModifiers {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.printPublic();
        e.printProtected();
        e.printPackage();


        e.blog();

        Boss b = new Boss();
        b.printPackage();
        b.printPrivate();
    }
}