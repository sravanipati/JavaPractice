public class Operators2{

    public static int operators(){
        int x1 = -4;  //-4
        int x2 = x1--; //-4
        System.out.println(x2);
        int x3 = ++x2; //-3
        System.out.println(x3);
        if(x2 > x3){
            --x3;
        }else{
            x1++;  //-4
        }
        return x1 + x2 + x3;  //-3-4-3 = -10
    }
    public static void main(String[] args) {
        System.out.println(operators());
    }
}