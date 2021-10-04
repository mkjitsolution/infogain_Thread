package day5.pc;

public class Producer implements Runnable {

	Product p;

	public Producer(Product p) {
		this.p = p;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			startProduction();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public void startProduction() {
		p.productionState();
	}

}
