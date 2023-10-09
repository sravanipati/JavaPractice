public class TestClass{
   public static void main(String args[ ] ){
      StringBuilder sb = new StringBuilder("12345678");
      sb.setLength(5);
      System.out.println(sb.toString());
      sb.setLength(10);
      System.out.println(sb.length());
   }
}