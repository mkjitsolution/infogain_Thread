package p2;

public class Exam {

	private int javaMarks;
	private int springMarks;
	private int uiMarks;
	private String participantName;
	
	Exam()
	{
		System.out.println("-------->> Inside default constructor....");
	}
	
	Exam(int java,int spring,int ui,String name)
	{
		javaMarks = java;
		springMarks = spring;
		uiMarks = ui;
		participantName = name;
	}
	
	// same act like as constructor but have to be called manually
	public void setInformation(int java,int spring,int ui,String name)
	{
		javaMarks = java;
		springMarks = spring;
		uiMarks = ui;
		participantName = name;
	}
	
	public int getTotalMarks()
	{
		// responsible to return total marks
		return (javaMarks+springMarks+uiMarks);
	}
	
	public float getAverageMarks()
	{
		// responsible to return avg marks
		return getTotalMarks()/3;
	}
	
	public void displayDetails()
	{
		System.out.println(" Details of :- "+participantName);
		System.out.println(" Java Marks "+javaMarks);
		System.out.println(" Spring Marks "+springMarks);
		System.out.println(" UI Marks "+uiMarks);
		System.out.println(" Total Marks :- "+getTotalMarks());
		System.out.println(" Avg Marks "+getAverageMarks());
		System.out.println(" Participant Status : "+(getAverageMarks()>=6.0?"Pass":"Fail"));
		System.out.println("\n---------------------------------\n");
	}
	
	
}











