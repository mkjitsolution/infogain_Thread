package day5.pc;


// Resource 
public class Product {

	boolean isAvailable = false;
	int productNumber = 0;
	
	public synchronized void productionState()
	{
		// wait to consumer 
		while(isAvailable)
		{
			try {
				wait();
				
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
		// when done
		productNumber++;
		System.out.println(" Produced :- "+productNumber);
		isAvailable = true;
		
		// notify consumer
		notify();
	}
	
	public synchronized void consumptionState()
	{
		
		// wait to producer 
		while(!isAvailable)
		{
			try {
				wait();
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		// consumption start
		System.out.println("Consumed :- "+productNumber);
		isAvailable = false;
		// notify to producer
		notify();
		
	}
	
}
