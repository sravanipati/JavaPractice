class MyThread extends Thread{
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println("child Tread");
		}
	}
}


public class ThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start(); //t.run();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		
	}

}
