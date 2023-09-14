

public class StringBuilderAppendInsert {
    public static void main(String[] args) {
 
      
        StringBuilder sb = new StringBuilder(100);
        sb.append("Hello ")
                .append(new char[]{'W', 'o', 'r', 'l', 'd'})
                .append(',')
                .append((Object) " My ")
                .append("NewNumber ", 3, 9)
                .append(" is ")
                .appendCodePoint(97)
                .append(" float with the value of: ")
                .append(204.50f);
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());



        StringBuilder sb2 = new StringBuilder(100);
        sb2.insert(0, "Hello , is a float with the value of ")
                .insert(6, new char[]{'W', 'o', 'r', 'l', 'd'})
                .insert(13, (Object) "My ")
                .insert(16, "NewNumber ", 3, 10)
                .insert(sb2.length(), 204.5f);

        System.out.println("sb2 = " + sb);
        System.out.println("sb2.length() = " + sb.length());
        System.out.println("sb2.capacity() = " + sb.capacity());
    }
}