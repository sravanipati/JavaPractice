class MyThread5 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class DaemonThread {
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.setDaemon(true); // -->1
		t.start();
		System.out.println("end of main Thread");
	}
}