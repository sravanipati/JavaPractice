
public class ForLoop5 {
	public static void main(String[] args) {
        var ca = new char[]{'a', 'b', 'c', 'd'};
        var i = 0;
        for(var c : ca){
            switch(c){
                case 'a' : i++;
                case 'b' : ++i;
                case 'c'|'d' : i++;
            }
        }
        System.out.println("i = "+i);
	}

}
