package day5.sys;

// Resource 
public class HPPrinter {
	
	public void doPrint(String empDetails,String file)
	{
		System.out.println(" Check Auth for User "+empDetails);
			
		synchronized (this) {
			System.out.println("[");
			try {
				System.out.println(""+file);
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("]");
		}
	
		
		System.out.println("Task B");
		
	}

}
