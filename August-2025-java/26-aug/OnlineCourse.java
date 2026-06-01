import java.util.*;
class OnlineCourse{
	
	String stuName;
	String courseName;
	float rating;
	String feedBack;
	
	
	
	
	public void collectFeedback(){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Student Name :" );
		String stuName = sc.nextLine();
		this.stuName = stuName;
		
		
		
		System.out.println("Enter Your CourseName " );
		String courseName = sc.nextLine();
		this.courseName = courseName;
		
		System.out.println("Enter Your rating");
		float rating = sc.nextFloat();
		
		this.rating = rating;
		sc.nextLine();
		System.out.println("Enter your FeedBack");
		String feedBack = sc.nextLine();
		
		this.feedBack = feedBack;
				
		 
		displayFeedback(stuName, courseName, rating, feedBack);
		
	}
	
	public void displayFeedback(String stuName, String courseName,float rating, String feedBack){
		
		System.out.println("Student Name is : " + stuName );
		System.out.println("Course Name is : " + courseName );
		System.out.println("rating is : " + rating );
		System.out.println("Feed Back is : " + feedBack);
		
	
	}
	
	public static void main(String args[]){
		OnlineCourse obj = new OnlineCourse();
		
		obj.collectFeedback();
	}
}
	
	