
public class ForWhile {
    public static void main(String args[]){
        var c = 0;
        var flag = true;
        for(var i = 0; i < 3; i++){
            while(flag){
                c++;
                if(i>c || c>5) flag = false;
            }
        }
        System.out.println(c);
    }

}
