/*
Q2). Employee Class Design
Design a Java class named Employee.
Attributes :
-----------------
empName : String
empId : int
salary : double
Access Modifier: private (for all variables)
Constructor: Initialize all properties.
Methods:
-----------
- displayEmployee(): Print employee details.
Input Validation:
- empName should not be empty.
- empId should be greater than 0.
- salary should be positive.
Test Cases:
Case - 1 (Valid Input)
----------------------
empName : John
empId : 1001
salary : 45000
Expected Output:
Valid input. Display employee details.
Case - 2 (Invalid empName)
--------------------------
empName : """"
empId : 1001
salary : 45000
Expected Output:
Error message indicating invalid employee name."
*/
import java.util.Scanner;


public class Company
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Name");
		String empName = sc.nextLine();
		System.out.println("Enter the Employee Id");
		int empId = sc.nextInt();
		
		System.out.println("Enter the Employee Salary");
		double salary = sc.nextDouble();
		
		Employee e1 = new Employee(empName, empId, salary);
		System.out.println(e1.displayDetails());
	}
}

class Employee{
	
	String empName;
	int empId;
	double salary;
	
	Employee(String empName , int empId, double salary){
		if(!empName.isEmpty()){
			this.empName = empName;
		}else{
			System.out.println("Enter the Valid Employee Name");
			System.exit(1);
		}
		
		if(empId > 0){
			this.empId = empId;
		}
		else{
			System.out.println("Enter the Valid Employee Id");
			System.exit(1);
		}
		
		if(salary > 0 ){
			this.salary = salary;
		}
		else{
			System.out.println("Enter the Valid Salary ");
			System.exit(1);
		}
	}
	
	public String displayDetails(){
		return " Employee Name :"+empName+
				"\n Employee Id : "+ empId +
				"\n Employee Salary : "+ salary;
	}
}
	