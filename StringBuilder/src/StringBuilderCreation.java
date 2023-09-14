

public class StringBuilderCreation {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        System.out.println("sb.length =" + sb.length());
        System.out.println("sb.capacity = " + sb.capacity());

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2.length = " + sb2.length());

        System.out.println("sb2.capacity = " + sb2.capacity());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb3.length = " + sb3.length());
        System.out.println("sb3.capacity = " + sb3.capacity());

        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb4.length = " + sb4.length());
        System.out.println("sb4.capacity = " + sb4.capacity());
    }
}