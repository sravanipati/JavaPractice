class InnerClass {
	int i = 10;
	static int j = 20;

	public void methodOne() {
		int k = 30;
		final int l = 40;
		class Inner {
			public void methodTwo() {
				System.out.println(i);
				System.out.println(j); // -->line 1
				System.out.println(k);
				System.out.println(l);
			}
		}
		Inner i = new Inner();
		i.methodTwo();
	}

	public static void main(String[] args) {
		new InnerClass().methodOne();

	}
}