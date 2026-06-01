/*
Multilevel Inheritance
A university management system needs to store academic details of students.
Every Person has basic personal details. A Student inherits from Person, and a GraduateStudent
inherits from Student and adds degree-specific information.

Requirements:
Create three classes: Person, Student, and GraduateStudent.

The Person class should contain:
Instance variables: name, age
A method displayPersonDetails() to print the details.

The Student class should:
Inherit from Person
Contain: studentId, course
A method displayStudentDetails() to print all student details along with personal details
by calling displayPersonDetails().

The GraduateStudent class should:
Inherit from Student
Contain: degreeType, yearOfPassing
A method displayGraduateDetails() to print all graduate student details, including inherited
details.

In the Main class:
Create an object of GraduateStudent.
Call displayGraduateDetails().

Test Case (Hardcoded):
Name: "Adya"  
Age: 23  
Student ID: "C13001"  
Course: "Artificial Intelligence"  
Degree Type: "M.Tech"  
Year of Passing: 2024  

Expected Output:
Degree Type: M.Tech  
Year of Passing: 2024  
Student ID: C13001
Course: Artificial Intelligence
Name: Adya  
Age: 23  
*/

import java.util.Scanner;
class Person
{
	String name;
	int age;
		
	Person(String name, int age){
		this.name = name ;
		this.age = age;
	}
	
	public void displayPersonDetails(){
		System.out.println(" name : " + name);
		System.out.println(" Age  : " + age);
	}
	
}

class Student extends Person
{
	String studentId;
	String course;
	
	Student(String name, int age, String studentId, String course ){
		super(name, age);
		this.studentId = studentId;
		this.course = course;
	}
	
	public void displayStudentDetails(){
		
		System.out.println("String student Id : " + studentId);
		System.out.println("Course Id : " + course );
		displayPersonDetails();
	}
	
	
}

class GraduateStudent extends Student
{
	String degreeType;
	int yearOfPassing;
	
	GraduateStudent(String name, int age, String studentId, String course, String degreeType, int yearOfPassing){
		super(name, age, studentId, course);
		this.degreeType = degreeType;
		this.yearOfPassing = yearOfPassing;
	}
	
	public void displayGraduateDetails(){
		
		System.out.println("Degree Type : " + degreeType );
		System.out.println(" Year of Passing " + yearOfPassing);
		displayStudentDetails();
	}
		
	
	
}


public class University{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : " );
		String name = sc.nextLine();
		System.out.println("Enter the Age : " );
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Id :  " );
		String studentId = sc.nextLine();
		
		System.out.println("Enter the Course : " );
		String course = sc.nextLine();
	
		System.out.println("Enter the Degree Type : " );
		String degreeType = sc.nextLine();
		
		System.out.println("Enter the  Year of Passing : " );
		int yearOfPassing = sc.nextInt();
		sc.nextLine();
		
		GraduateStudent graduateStudent1 = new GraduateStudent(name, age, studentId, course, degreeType, yearOfPassing );
		graduateStudent1.displayGraduateDetails();
		
		
	}
	
}



