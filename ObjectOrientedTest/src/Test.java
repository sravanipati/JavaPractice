class A{
   public A() { }
   public A(int i) {   System.out.println(i );    }
}
class Test extends A{
   static A s1 = new A(1);
   A a = new A(2);
   public static void main(String[] args){
      var b = new Test();
      var a = new A(3);
   }
   static A s2 = new A(4);
}