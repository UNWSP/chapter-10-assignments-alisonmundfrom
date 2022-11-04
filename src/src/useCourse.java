package src;

import java.util.Scanner;

public class useCourse {

	public static void main(String[] args)
	{
		Scanner departmentInput = new Scanner(System.in);
		Scanner courseNumberInput = new Scanner(System.in);
		
		System.out.println("New course!\nPlease enter course information! \n" + 
		"Enter name of the department: ");
		
		String department = departmentInput.nextLine();
		
		System.out.println("Please enter the course number: ");
		
		int courseNumber = courseNumberInput.nextInt();
		
		System.out.println("Please enter the number of credit hours: ");
		
		int credits = courseNumberInput.nextInt();
		if(department.equals("BIO") || department.equals("CHM") || 
				department.equals("CIS") || department.equals("PHY"))
		{
			LabCourse labCourse = new LabCourse(department, courseNumber, credits);
			labCourse.displayData();
		}
		else
		{
			CollegeCourse collegeCourse = new CollegeCourse(department, courseNumber, credits);
			collegeCourse.displayData();
		}
	}
}
