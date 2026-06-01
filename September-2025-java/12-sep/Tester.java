/*
Q2. Create an Employee class (BLC Class)

Attributes :

names        Return Type
--------        ---------------        
 firstName       :String  
 lastName          :String  
 employeeId     :int  
 salary          :double  
 NoOfProject     :int

Access Modifier : private (for all variables)  

Implement setter methods to initialize these properties.

implement calculateSalary() method that will add extra amount in salary based on
NoOfProject.

Return Type       : void
Access modifier :public

NoOfProject is more than 5 and less than or equals to 10 then add 5000
NoOfProject is more than 10 and

less than or equals to  20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate
the Employee object and execute the methods.


Test Case 1:
----------------
Valid Input with Projects Between 6 and 10
Input:

firstName: John
lastName: Doe
employeeId: 101
salary: 50000.00
NoOfProject: 7

Expected Output:

After executing calculateSalary(), the salary should be updated to 55000.00.
Print output showing the updated salary: 55000.00.

Test Case 2:
---------------
 Invalid Number of Projects (Negative Value)
Sample Input:

firstName: Michael
lastName: Johnson
employeeId: 105
salary: 45000.00
NoOfProject: -5

Expected Output:
Print an error message indicating invalid number of projects
(e.g., "Number of projects cannot be negative").Salary remains 45000.00.
*/
import java.util.Scanner;
public class Tester{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter the First Name : ");
		String firstName = sc.nextLine();
		e1.setFirstName(firstName);
		
		System.out.println("Enter the Last Name : " );
		String lastName = sc.nextLine();
		e1.setLastName(lastName);
		
		System.out.println("Enter the Employee id : ");
		int empId = sc.nextInt();
		e1.setEmpid(empId);
		
		System.out.println("Enter the Salary : ");
		double salary = sc.nextDouble();
		e1.setSalary(salary);
		
		System.out.println("Enter the No of Project : ");
		int noOfProject = sc.nextInt();
		e1.setNoOfProject(noOfProject);
		
		System.out.println("Updated Salary : "+ e1.calculateSalary());
		
		
	}
	
}

 class Employee{
	
private String firstName;
private String lastName;
private int empId;
private double salary;
private int noOfProject;

public void setFirstName(String firstName){
	this.firstName = firstName;
}
public void setLastName(String firstName){
	this.lastName = firstName;
}
public void setSalary(double salary){
	if(salary > 0){
	this.salary = salary;
	} else{
		System.out.println("Invalid Input");
		System.exit(9);
	}
	
	
}
public void setEmpid(int empId){
	if(empId > 0 ){
	this.empId = empId;
	}
	else{
		System.out.println("invalid Input");
		System.exit(9);
	}
	
}
public void setNoOfProject(int noOfProject){
	if(noOfProject > 0){
		
	this.noOfProject = noOfProject;
	}
	else{
		System.out.println("Invalid Project");
		System.out.println(9);
		}
}

public String getFirstName(){
	return firstName;
}
 
public String getLastName(){
	return lastName;
}
 
public int getEmpid(){
	 return empId;
}
 
public double getSalary(){
	return salary;
}
public int getNoOfProject(){
	return noOfProject;
}
	

 public double calculateSalary(){
	 if(noOfProject > 0 && noOfProject <= 5){
		 this.salary += 2500;
		 
	 }
	 else if(noOfProject > 5 && noOfProject <=10){
		 this.salary += 5000;
	 }
	 else if(noOfProject >10 && noOfProject <=20){
		 this.salary +=10000;
	 }
	 else{
		 this.salary +=20000;
	 }
	 
	 return salary;
	 
 }
}

