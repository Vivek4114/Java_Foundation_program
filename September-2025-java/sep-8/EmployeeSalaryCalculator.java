import java.util.Scanner;

class EmployeeSalaryCalculator{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args){
		
		Employee e1 = new Employee();
		
		System.out.print("Enter the Basic Salary : ");
		double basicSalary = sc.nextDouble();
		
		System.out.print("Enter the Hra : ");
		double hra = sc.nextDouble();
		
		
		System.out.print("Enter the DA : ");
		double da = sc.nextDouble();
		 
		System.out.print("Enter the tax Percentage (%) : ");
		double taxPercentage  = sc.nextDouble();
		
		e1.setBasicSalary(basicSalary);
		e1.setHra(hra);
		e1.setDa(da);
		e1.setTaxPercentage(taxPercentage);
		
		System.out.println(e1.getBasicSalary());
		System.out.println(e1.getHra());
		System.out.println(e1.getDa());
		System.out.println(e1.getTaxPercentage());
		
		System.out.println(e1.calculateGrossSalary());
		System.out.println(e1.calculateNetSalary());
		
	}
	
	 
	
	
}
