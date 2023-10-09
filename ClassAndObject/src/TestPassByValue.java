
public class TestPassByValue {
    public static void main(String[] args) {
 
        int a = 1;
        int b = 2;
 
        String aString = new String("123");
        String bString = new String("456");
 
        StringBuilder abc = new StringBuilder("abc");
        StringBuilder def = new StringBuilder("def");
 
        System.out.println("-------- Before method call --------");
 
        System.out.println("abc.hashCode() = " + abc.hashCode()
                + ", value = " + abc);
        System.out.println("def.hashCode() = " + def.hashCode()
                + ", value = " + def);
 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("aString.hashCode() = " + aString.hashCode() +
                ", value = " + aString);
        System.out.println("bString.hashCode() = " + bString.hashCode() +
                ", value = " + bString);
 
        changeValue(a, b);
        changeValue(aString, bString);
        changeValue(abc, def);
 
        System.out.println("-------- After method call --------");
 
        System.out.println("abc.hashCode() = " + abc.hashCode() +
                ", value = " + abc);
        System.out.println("def.hashCode() = " + def.hashCode() +
                ", value = " + def);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("aString.hashCode() = " + aString.hashCode() +
                ", value = " + aString);
        System.out.println("bString.hashCode() = " + bString.hashCode() +
                ", value = " + bString);
 
    }
 
    public static void changeValue(Object o1, Object o2) {
 
        switch (o1.getClass().getName()) {
            case ("java.lang.Integer"):
                o1 = 10;
                o2 = 20;
                break;
            case ("java.lang.String"):
                o1 = "aaaa";
                o2 = "bbbb";
                break;
            case ("java.lang.StringBuilder"):
                o1 = ((StringBuilder) o1).append("xyz");
                o2 = ((StringBuilder) o2).append("zzz");
 
                break;
        }
    }
 
}