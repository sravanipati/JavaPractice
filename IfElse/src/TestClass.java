public class TestClass {
   public static void main(String[] args) {
      int i = 0;
      String s = "";

      //s = null;
      if ((s != null) | ( i==s.length())) {}
      System.out.println("A");

      //s = null;
      if ((s == null) | ( i==s.length())) {}
      System.out.println("B");

      //s = null;
      if ((s != null) || (i==s.length())) {}
      System.out.println("C");

      s = null;
      if ((s == null) || (i==s.length())) {}
      System.out.println("D");
   }
}