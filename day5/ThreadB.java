package day5;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();

		for (int i = 0; i < 5; i++) {
			System.out.println(threadName + " - " + i);
			try {
					Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}

	}

}
