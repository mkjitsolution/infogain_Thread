package day5.pc;

public class PCProblem {

	public static void main(String[] args) {
		
		Product p = new Product();
		
		Producer producerThread = new Producer(p);
		Consumer consumerThread = new Consumer(p);
		
	}
}
