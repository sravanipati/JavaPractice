public class Trim{
   public static void main(String args[]){
      String blank  = " ";  // one space
      String line = blank + "hello" + blank + blank; // length = 8 string = " hello  "
      line.concat("world"); // 
      System.out.println(line);
      String newLine  =  line.trim(); //length = 5 string ="hello"
      System.out.println(newLine);
      System.out.println((int)(line.length() + newLine.length()));
      System.out.println("12345".charAt(6));
   }
}