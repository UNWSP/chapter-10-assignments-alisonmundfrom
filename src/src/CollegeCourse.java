package src; 

public class CollegeCourse {

	protected String department; 
	protected int courseNumber;
	protected int credits; 
	protected int fee; 
	
	public CollegeCourse(String department, int courseNumber, int credits)
	{
		this.department = department; 
		this.courseNumber = courseNumber; 
		this.credits = credits; 
		this.fee = credits * 120;
	}
	
	public void displayData()
	{
		System.out.println("College course: \nDepartment: " + 
		this.department + "\nCourse number: " + this.courseNumber + "\nCredit: "
		+ this.credits + "\nFee: " + this.fee);
	}
}
