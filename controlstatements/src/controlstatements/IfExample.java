package controlstatements;

public class IfExample {
	public static int transformNumber(int n){
		   var radix = 2;
		   var output = 0;
		   output += radix*n;
		   radix = output/radix;
		   if(output<14){
		       return output;
		   }
		   else{
		       output = output*radix/2;
		       return output;
		   }
		}
	public static void main(String[] args) {
		transformNumber(7);
	}
	
	

}
