/*
wap to declare a method which is used to register a student for college event the method must be used to initilise the student details and after regisration is 
done it must return the name of that student who is registered recently. 
take BLC : Business Logic Class
and ELC  : Execution Logic Class

*/

import java.util.Scanner;
class RegistestedStudent{

	String studentName;
	String studentId;
	int standard;
	
	public String setStudentDetails( ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		this.stuentName = sc.nextLine();
		
		System.out.println("Enter the Student Name : ");
		this.studentId = sc.nextLine();
		
		System.out.println("Enter the Student Class : ");
		this.standard = sc.nextInt();
		
	}
	
	public String checkStudentRegister(String name);
		 
		 if(studentName.equals(name)){
			 return name + " student is Register for the Event " ;
		 }
		 else {
			 return name + " student is Not Register for the Event " ;
		 }
			 
	}
	
	
	public  void displayStudentDetails(){
	System.out.println("Student Name : " + this.studentName);
	System.out.println("Student id : " + this.studentId);
	System.out.println("Student Name : " + this.standard);
	
	
	}
	
}


public class Student{
	
	public static void main(String [] args){
		
		RegistestedStudent r1 = new RegistestedStudent();
		r1.setStudentDetails();
		r1.checkStudentRegister("vinay");
		r1.displayStudentDetails();
		
	}
	
}
	
	