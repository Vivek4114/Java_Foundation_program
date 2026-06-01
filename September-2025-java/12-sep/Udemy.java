/*
.  Online Course Enrollment (Udemy/Coursera-like)
Build a system to manage student course enrollments.
Class: CourseEnrollment
Fields:
String courseName
String studentName
double fees
Tasks:
Initialize using setters.
Retrieve details using getters.
Create three enrollments and display them

*/
import java.util.Scanner;
class CourseEnrollment{
	private String courseName;
	private String studentName;
	private double fees;
	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	
	public void setFees(double fees){
		this.fees = fees;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public double fees(){
		return fees;
	}
	
	public String displayDetails(){
		return " Student Name : " + studentName +
				"\n Course Name : " + courseName +
				"\n Fees : " + fees ;
	} 
}

public class Udemy
{
	 static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		
		CourseEnrollment c1 = new CourseEnrollment();
		CourseEnrollment c2 = new CourseEnrollment();
		CourseEnrollment c3 = new CourseEnrollment();
		
		System.out.println("Enter the Student Name : ");
		String studentName = sc.nextLine();
		c1.setStudentName(studentName);
		
		System.out.println("Enter the Course Name : ");
		String courseName = sc.nextLine();
		c1.setCourseName(courseName);
		
		System.out.println("Enter the Fees of Course : ");
		double fees = sc.nextDouble();
		c1.setFees(fees);
		
		System.out.println(c1.displayDetails());
		
		
	}
}

	