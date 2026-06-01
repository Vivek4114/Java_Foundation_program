import java.util.Scanner;

class EmployeeSalary{
    String name ;
    double salary;

    public static void main(String args[]){
        EmployeeSalary E1 = new EmployeeSalary();
        EmployeeSalary E2 = new EmployeeSalary();

        E1.setInput();
        E1.displayDetails();
		
		E2.setInput();
        E2.displayDetails();


    }

    public void setInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String empName = sc.nextLine();

        System.out.println("Enter your Salary: ");
        double sal = sc.nextDouble();

        this.name = empName;
        this.salary = sal;

        System.out.println("Enter your Salary Persentage : ");

        double per = sc.nextDouble();
        raiseSalry(per);


    }

    void raiseSalry(double percent){

         double CalPer = (double)(this.salary * percent/100.0) + this.salary;

        this.salary = CalPer;

    }

    void displayDetails(){
		System.out.println();
        System.out.println("Updated Employee Details : ");
		
        System.out.println("Employee Name : "+ this.name);
        System.out.println ("Salary : "+ this.salary);

    }

    
}