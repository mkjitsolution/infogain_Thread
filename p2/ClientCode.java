package p2;

public class ClientCode {
	
	public static void main(String[] args) {
		
		// ------- Provided from Various Input , XLS (CSV) file , PDF , mannual entry
		Exam examDetails1 = new Exam();
		examDetails1.setInformation(6, 4, 8, "Ramesh");
		
		Exam examDetails2 = new Exam();
		examDetails2.setInformation(8, 9, 10, "Amit");
		
		Exam examDetails3 = new Exam();
		examDetails2.setInformation(4, 4, 3, "Suresh");
		
		Exam examDetails4 = new Exam(7, 3, 7, "Pooja");
		
		//------------ Perform Business operation on each object -----
		//  executed on Button click 
		examDetails1.displayDetails();
		examDetails2.displayDetails();
		examDetails3.displayDetails();
		examDetails4.displayDetails();
		
		
	}

}
