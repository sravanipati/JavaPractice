
abstract class AbstractExample {
 
    public static final String ABSTRACT_CONSTANT = "Abstract/*\n" + 
    		"Learn Programming Academy's Java 1Z0-815 Certification Exam Course\n" + 
    		"Section 9: Reusing Implementations Through Inheritance\n" + 
    		"Topic: Abstract classes\n" + 
    		"*/\n" + 
    		" ";
 
    public static final void doThisAndOnlyThis() {
        System.out.println("static final method is ok abstract class");
        System.out.println("My constant is " + ABSTRACT_CONSTANT);
    }
 
    public final void doThisAndThat() {
        System.out.println("My method may be final, " +
                "but it can still support polymorphism");
        System.out.println(doThis() + " and " + doThat());
    }
 
    abstract String doThis();
 
    abstract String doThat();
}
 
class ConcreteExample extends AbstractExample {
 
    String doThis() {
        return "I do this";
    }
 
    String doThat() {
        return "I do that";
    }
}
 
public class AbstractClassExample {
 
    public static void main(String[] args) {
        ConcreteExample.doThisAndOnlyThis();
 
        ConcreteExample c = new ConcreteExample();
        c.doThisAndThat();
    }
}