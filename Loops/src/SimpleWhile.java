
public class SimpleWhile {
    public static void main(String[] args) {
        int i=0, j=10;
        var count = 0;
        while (i<j) {            
            i++;
            j--;
            count++;
        }
        System.out.println(i+" "+j+" "+count);
    }

}
