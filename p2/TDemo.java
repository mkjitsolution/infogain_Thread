package p2;

class ABC extends Thread
{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}

public class TDemo {

	
	public static void main(String[] args) {
		
		ABC t2 = new ABC();
		t2.start();
		
		try {
			// It ensures that main(Current Thread) will join t2
			// write after 2500 milli sec
			t2.join(2500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread "+i);
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
