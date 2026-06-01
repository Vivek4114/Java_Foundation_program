/*
Q1) .Student Class Design
Design a Java class named Student.
Attributes :
-----------------
name : String
rollNo : int
course : String
Access Modifier: private (for all variables)
Constructor: Initialize all properties.
Methods:
-----------
[Return type: void, Access Modifier: public]
- displayDetails(): This method should print all the student details.
[Return type: non-void, Access Modifier: public]
- getName(), getRollNo(), getCourse(): These methods should return corresponding property values.
Input Validation:
- name should not be empty.
- rollNo should be greater than 0.
- course should not be empty.
Test Cases:
Case - 1 (Valid Input)
----------------------
Name : Swati
RollNo : 101
Course : Computer Science
Expected Output:
Valid input. Display all details.
Case - 2 (Invalid Name)
-----------------------
Name : """"
RollNo : 101
Course : Computer Science
Expected Output:
Error message indicating invalid name.
Case - 3 (Invalid RollNo)
-------------------------
Name : Swati
RollNo : -5
Course : Computer Science
Expected Output:
Error message indicating invalid roll number.
Case - 4 (Invalid Course)
-------------------------
Name : Swati
RollNo : 101
Course : """"
Expected Output:
Error message indicating invalid course."
*/

import java.util.Scanner;

class Student{
	
	private String name ; 
	private   int rollNo ;
	private String course;

	Student(String name, int rollNo, String course ){
	if(!(name.isEmpty())){
	this.name = name;
	}
	else{
		System.out.println("Enter the Valid Name");
		System.exit(9);
	}
	
	if(rollNo > 0 ){
	this.rollNo = rollNo;
	}
	else{
		System.out.println("Enter the Valid Roll No ");
		System.exit(9);
	}
	
	if(!(course.isEmpty())){
	this.course  = course ;
	} 
	else{
		System.out.println("Course Name is not Empty");
		System.exit(9);
	}
	
}


public String getName(){
	return name;
} 
public int getRollNo(){
	return rollNo;
}
public String getCourse(){
	return course;
}

public String displayDetails(){
	return "Student Name : "+name +
			"\nRoll No : "+rollNo+
			"\nCourse : "+course;
}
	
}

public class School
{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Roll No : ");
		int rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Course Name : ");
		String course = sc.nextLine();
		Student s1 = new Student(name,rollNo,course);
		System.out.println(s1.displayDetails());
	}
}
	