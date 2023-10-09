class SuperTest {
	public SuperTest() {
	}
	
	public SuperTest(int a) {
		
	}
    
}
 
public class TestConstructor extends SuperTest {
    int first, second, third;
 
    public TestConstructor(int x, int y) {
        first = x;
        second = y;
    }
 
    public TestConstructor(int x) {
        super(x);
    }
}