package day5.pc;

public class Consumer implements Runnable
{
	Product p;
	
	public Consumer(Product p) {
		this.p = p;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			startConsumption();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	public void startConsumption()
	{
		p.consumptionState();
	}
	


	
}
