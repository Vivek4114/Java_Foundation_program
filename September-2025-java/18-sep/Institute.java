/*
. "Create a class Course with data members: courseId, courseName, and duration.
Overload constructors to allow:
Default course creation.
Initializing only courseId and courseName.
Initializing all three values.

Demonstrate constructor overloading by creating multiple course objects and display their details.
Design a user defined method 'displayDetails()' to return the details of this object.

Input Validation:
courseId must be a positive integer.
courseName should not be null or empty.
duration must be positive.

Test Cases and Expected Output:
Course c1 = new Course();
Course c2 = new Course(101, ""Java"");
Course c3 = new Course(102, ""Python"", 3);

System.out.println(c1.displayDetails());
System.out.println(c2.displayDetails());
System.out.println(c3.displayDetails());

Expected Output:
Course ID: 0, Course Name: N/A, Duration: 0 months
Course ID: 101, Course Name: Java, Duration: 0 months
Course ID: 102, Course Name: Python, Duration: 3 months
*/
import java.util.Scanner;

public class Institute{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Course Id : ");
		int courseId = sc.nextInt(); 
			sc.nextLine();
		System.out.print("Enter the Course Name : ");
		String courseName = sc.nextLine();
		System.out.print("Enter the Course Duration : ");
		int courseDuration = sc.nextInt();
		
		Course c1 = new Course(courseId, courseName, courseDuration);
		
		System.out.print("Enter the Course Id : ");
		int courseId2 = sc.nextInt(); 
			sc.nextLine();
		System.out.print("Enter the Course Name : ");
		String courseName2 = sc.nextLine();
		Course c2 = new Course(courseId2, courseName2);
		
		Course c3 = new Course();
		System.out.println(c3.displayDetails());
		System.out.println(c1.displayDetails());
		System.out.println(c2.displayDetails()); 
	}
}

class Course{
	int courseId;
	String courseName;
	int courseDuration;
	
	Course(){
		courseId = 0;
		courseName = "N/A";
		courseDuration = 0;
	}
	
	Course(int courseId, String courseName){
		if(courseId > 0 || !(courseName.isEmpty())){
	this.courseId = courseId;
	this.courseName = courseName;
	}	
	else{
		System.out.println("Provide Some Valid Input");
		System.exit(0);
	}		
	}

	Course(int courseId, String courseName, int courseDuration){
	if(courseId > 0 || !(courseName.isEmpty()) || courseDuration > 0 ){
	this.courseId = courseId;
	this.courseName = courseName;
	this.courseDuration = courseDuration;
	}	
	else{
		System.out.println("Provide Some Valid Input");
		System.exit(0);
	}
	}
	public String displayDetails(){
		return "Course id : " + courseId + " Course Name : " + courseName + " Course Duration : " + courseDuration ;
	}
}

