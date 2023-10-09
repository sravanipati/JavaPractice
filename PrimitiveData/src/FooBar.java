
public class FooBar {
	public static void main(String[] args) {
	
	int p;
	boolean myBoolean = true;
	
	if(myBoolean)
		p=1;
	else
		p=2;
	
	System.out.println(" P ="+p);
	
	int q;
	if(true) {
		q=2;
	}
	System.out.println("q is "+q);
	
	
	int a=5;
	int r;
	switch(a) {
	case 1:
	case 2:
	case 3:
		r=2;
		break;
	case 4:
	case 5:
		r=5;
		break;
	default:
		r=4;
	
	}
	System.out.println("r is "+r);
	int s,t=0;
	do {
		s=t++;
	}while(t<1);
	System.out.println("s is "+s);
	
	
	int u,v=0;
	while(true) {
		u=v++;
		break;
	}
	System.out.println("u is "+u);
}

}