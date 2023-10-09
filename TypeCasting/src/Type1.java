class X{
int val = 10;
}

class Y extends X{
Y val = null; //1
}

public class Type1 extends X{

  public static void main(String[] args){
    Y y = new Y();
 //   int k = (X) y.val ; //2
  //  System.out.println(k);

  }
}