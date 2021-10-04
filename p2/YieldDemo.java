package p2;

class ThreadA extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " " + i);
			Thread.yield();
		}
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " " + i);
		}
	}
}

public class YieldDemo {
	public static void main(String[] args) {
		
		// -------- Thread conf -----------
		Thread.currentThread().setName("Main-Thread");
		Thread.currentThread().setPriority(5);
		
		ThreadA tA = new ThreadA();
		tA.setName("Thread-A");
		tA.setPriority(5);

		ThreadB tB = new ThreadB();
		tB.setName("Thread-B");
		tB.setPriority(3);

		// -------- Thread Execution -----
		tA.start();
		tB.start();
		
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " " + i);
		}
	}
}
