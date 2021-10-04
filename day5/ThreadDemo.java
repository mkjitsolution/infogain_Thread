package day5;



public class ThreadDemo {

	
	public static void main(String[] args) {
		
		/* ----- Thread Configuration code -------*/
		
		MyThread tA = new MyThread();
		
		Thread.currentThread().setName("Main-Thread");
		tA.setName("MyThread");
		tA.start();
		
		// ---- Creation of Thread based on Runnable Interface
		
		ThreadB runnableObj = new ThreadB();
		Thread tB = new Thread(runnableObj,"Thread-B");
		tB.start();
		
		
		
		/* ----------  Main Thread execution -------*/
		String threadName = Thread.currentThread().getName();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" - "+i);
		}
		
	}
}
