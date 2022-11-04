package src;

public class LabCourse extends CollegeCourse {

	public LabCourse(String department, int courseNumber, int credits)
	{
		super(department, courseNumber, credits);
		this.fee = fee + 50; 
	}
	
	@Override 
	public void displayData()
	{
		super.displayData();
		System.out.println("This course is a lab course.");
	}
}
