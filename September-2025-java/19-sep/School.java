/*
Scenario 3:

Imagine you manage student records. Each student has these details:
Name
Age
Grade level
School name

Now, a student is promoted to the next grade. All details remain the same
except the grade level, which increases by 1.

Your Task
Create a class called Student with the following fields:
String name
int age
int gradeLevel
String schoolName

Write two constructors in the Student class:
A regular constructor to create a student record.
A copy constructor that copies all fields from another Student object but
automatically increments the gradeLevel by 1.

In your main method:

Create an original student record with any values you like.
Create a promoted student record using the copy constructor.
Print both student records to show that:

All fields are the same except the grade level, which is incremented in the
copied record.

Learning Goals

Practice copy constructors with automatic modification of a field.
Reinforce object duplication with transformation.

Expected Output Example
Original Student:  
Name: Sachin  
Age: 15  
Grade Level: 9  
School: Green Valley High  
------------------------------  
Promoted Student (Copied):  
Name: Sachin  
Age: 15  
Grade Level: 10  
School: Green Valley High 
*/ 

import java.util.Scanner;

class Student{
	String name;
	int age;
	static int gradeLevel;
	String schoolName;

	Student(String name , int age , int gradeLevel ,String schoolName){

		this.name = name;
		this.age = age;
		Student.gradeLevel = gradeLevel;
		this.schoolName = schoolName;
		//Student.gradeLevel++;
	}

	Student(Student s){
		Student.gradeLevel++;
		this.name = s.name;
		this.age = s.age;
		Student.gradeLevel = Student.gradeLevel;
		this.schoolName = s.schoolName;
	}
	

	public String displayStudentDetails(){
	return  " Name : "+name+
		"\n Age : "+age+
		"\n Grade level : "+gradeLevel +
		"\n School name : "+schoolName + "\n";
	}
}

public class School{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Student age : ");
		int age = sc.nextInt();
		System.out.println("Enter the Grade Level : ");
		int gradeLevel = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the School Name : ");
		String schoolName =  sc.nextLine();

		Student s1 = new Student(name, age, gradeLevel, schoolName );
		System.out.println(s1.displayStudentDetails());
		Student s2 = new Student(s1);
		System.out.println(s2.displayStudentDetails());
	}
}
	
		


	
