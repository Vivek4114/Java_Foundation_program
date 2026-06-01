/*write a program to use of Single level inheritence in the following application
in a fotware company, evety employee has basic details such as name, employeId, Salary;
a Manager is also Employee but has additional responsibilities such as managing a department and approving leaves of the
team Memeber

Write a java program to implement this scenario useing single level inheirteance ;
where 
- the employee class stores ggeneral employee details and method;
- the manager class inherits from the employee class and adds extra functionality specific to manager.


rules: 
*/

class Employee
{
	String empName;
	int empId;
	double sal;
	
	Employee(String empName, int empId, double sal){
		this.empName = empName;
		this.empId = empId;
		this.sal = sal;
	}
	
	public void displayDetails(){
		System.out.println("Employee name : " + this.empName + "\n Emp Id : " + this.empId + "\nEmployee Salary : "+ this.sal);
	}
	
	public void work(){
		System.out.println("Employee Working on Assigned task");
	}
	
	 
}

class Manager extends Employee
{
	
	String department;
	
	Manager(String department,String empName, int empId, double sal){
		super(empName, empId, sal);
		this.department = department;
		 
	}
	
	public void approveLeave(String employeeName){
		System.out.println(employeeName + " want to leave Some days ");	
	}
	
	public void displayManagerDetails(){
		displayDetails();
		System.out.println("Deaprtment : "+this.department );
		
	}
	 
}

class Company
{
	
	public static void main(String []args){
		
		Manager manager = new Manager("java Developer", "Rahul", 001, 50000);
		manager.approveLeave("Vivek");
		manager.displayManagerDetails();	
		
	}
}
