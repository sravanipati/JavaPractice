class MyThread6 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread6 t = new MyThread6();
		t.start();
		 t.join(); //--->1
		for (int i = 0; i < 5; i++) {
			System.out.println("Rama Thread");
		}
	}

}
