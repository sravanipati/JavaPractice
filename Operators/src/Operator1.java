
public class Operator1 {
	public static void main(String[] args) {
		float foo = 2, bar = 3, baz = 4;    //1
		float mod1 = foo % baz, mod2 = baz % foo;  //2
		System.out.println(mod1);
		System.out.println(mod2);
		float val = mod1>mod2? bar : baz; //3
		System.out.println(val);
	}

}
