package day5.yield;



public class YieldDemo {

	public static void main(String[] args) {
		
		// --- Thread Conf----
		Thread.currentThread().setName("Main-Thread");
		Thread.currentThread().setPriority(8);
		
		
		ThreadA runnableObjA = new ThreadA();
		Thread tA = new Thread(runnableObjA,"Thread-A");
		tA.setPriority(8);
		
			
		ThreadB runnableObjB = new ThreadB();
		Thread tB = new Thread(runnableObjB,"Thread-B");
		tB.setPriority(3);
		
		ThreadC runnableObjC = new ThreadC();
		Thread tC = new Thread(runnableObjC,"Thread-C");
		tC.setPriority(8);
		
		
		
		// --------  Thread Execution 
		
		tA.start();
		tB.start();
		tC.start();
		
		String threadName = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName + " - " + i);
			
			
		}
	}
}
