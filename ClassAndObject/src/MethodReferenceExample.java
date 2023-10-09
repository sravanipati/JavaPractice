import java.util.function.BiFunction;

public class MethodReferenceExample {
    
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    
    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
    	MethodReferenceExample myApp = new MethodReferenceExample();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodReferenceExample.
            mergeThings("Hello ", "World!", (a, b) -> a + b));
        
        // Reference to a static method
        System.out.println(MethodReferenceExample.
            mergeThings("Hello ", "World!", MethodReferenceExample::appendStrings));

        // Reference to an instance method of a particular object        
        System.out.println(MethodReferenceExample.
            mergeThings("Hello ", "World!", myApp::appendStrings2));
        
        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodReferenceExample.
            mergeThings("Hello ", "World!", String::concat));
    }
}