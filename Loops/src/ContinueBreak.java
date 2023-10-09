
public class ContinueBreak {
	   public static void main(String[] args){
	        int[] arr = { 1, 2, 3, 4, 5, 6 };
	        int counter = 0;
	        for (var value : arr) {
	           if (counter >= 5) {
	               break; 
	               
	           } 
	           else {
	            continue;    
	            
	           }
//	           if (value > 4) {
//	             arr[counter] = value + 1;    
//	           }    
	           
	        }
	        System.out.println(arr[counter]);
	   }

}
