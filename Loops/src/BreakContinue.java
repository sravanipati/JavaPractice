
class BreakContinue{
   public static void main(String args[]){
      int k = 0;
      int m = 0;
      for ( var i = 0; i <= 3; i++){
         k++;
         if ( i == 2){
            i=3;
         }
         m++;
      }
      System.out.println( k + ", " + m );
   }
}
