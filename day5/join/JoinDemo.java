package day5.join;

public class JoinDemo {

	public static void main(String[] args) {
		// --- Thread Conf=----
		Thread.currentThread().setName("Main-Thread");
		

		ThreadA runnableObjA = new ThreadA();
		Thread tA = new Thread(runnableObjA, "Thread-A");
		

		ThreadB runnableObjB = new ThreadB();
		Thread tB = new Thread(runnableObjB, "Thread-B");
		

		ThreadC runnableObjC = new ThreadC();
		Thread tC = new Thread(runnableObjC, "Thread-C");
		

		// -------- Thread Execution

		tA.start();
		try {
			tA.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		tB.start();
		tC.start();

		String threadName = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName + " - " + i);

		}
	}

}
