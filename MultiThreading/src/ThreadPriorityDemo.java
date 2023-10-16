class MyThread4 extends Thread {
}

class ThreadPriorityDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());// 5
		Thread.currentThread().setPriority(9);
		MyThread4 t = new MyThread4();
		System.out.println(t.getPriority());// 9
	}
}