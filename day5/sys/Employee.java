package day5.sys;

// Thread
public class Employee implements Runnable{

	String empName;
	HPPrinter printer;
	Thread t;
	String file;
	
	public Employee(String empName, HPPrinter printer,String file) {
		this.empName = empName;
		this.printer = printer;
		this.file = file;
		
		t = new Thread(this);
		t.start();
	}




	@Override
	public void run() {
		printer.doPrint(empName,file);
	}
	
	

}
