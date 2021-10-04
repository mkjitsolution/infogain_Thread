package day5.yield;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();

		for (int i = 0; i < 5; i++) {
			System.out.println(threadName + " - " + i);
			Thread.yield();
		}

	}

}
