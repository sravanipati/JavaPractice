
public class ForLoop4 {
	public static void main(String[] args) {
		   int[] values = { 10, 30, 50 };
		   for( var val : values ){
		       var x = 0;
		       while(x<values.length){
		            System.out.println(x+" "+val);
		             x++;
		        }
		   }
		   int INT1=3,INT2=4;
		    for(var i=INT1; i<INT2; i++){
		        System.out.println(i);
		    }
		    for(int i=INT1; i<INT2; System.out.println(++i));
		    for(int i=INT1; i++<INT2; System.out.println(i));
		    int i=INT1; while(i++<INT2) { System.out.println(i); }
		    i=INT1; do { System.out.println(i); }while(i++<INT2);

		}

}
