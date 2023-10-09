
public class Operator3 {
	public static void main(String[] args) {
		var x=5;
		var j=0;
		for(var i=0;i<3;) {
			do {
				i++;
				x++;
				if(x>10)
					break;
				x+=4;
				j++;
			}while(j<=2);
		}
		System.out.println(x);
	}

}
