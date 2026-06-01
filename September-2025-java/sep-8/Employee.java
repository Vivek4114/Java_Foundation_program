/*
Question 2: Employee Salary Calculator
Create an Employee class (BLC Class)
Attributes:
basicSalary (private, double)
hra (private, double)
da (private, double)
taxPercentage (private, double)

Methods:
Setters & Getters for all attributes.
calculateGrossSalary() Method:
Formula: grossSalary = basicSalary + hra + da
Return Type: double

calculateNetSalary() Method:
Formula: netSalary = grossSalary
(grossSalary * taxPercentage / 100)
Return Type: double
Tester Class:
Test Case 1:
Input: basic = 20000, hra = 5000, da = 3000, tax = 10%
Expected Output: Gross Salary = 28000

Test Case 2:
Input: same as above
Expected Output: Net Salary = 25200

*/

class Employee{
	
private double basicSalary ;
private double hra;
private double da;
private double taxPercentage;



public void setBasicSalary( double basicSalary){
	this.basicSalary = basicSalary;
}

public void setHra( double hra){
	this.hra = hra;
}

public void setDa( double da){
	this.da = da;
}

public void setTaxPercentage( double taxPercentage){
	this.taxPercentage = taxPercentage;
}


public double getBasicSalary(){
	System.out.print(" Basic Salary is : ");
	return basicSalary;
}

public double getHra(){
	System.out.print("  HRA : ");
	return hra;
}

public double getDa(){
	System.out.print("  DA : ");
	return da;
}

public double getTaxPercentage(){
	System.out.print(" Tax Percentage (%): ");
	return taxPercentage;
}

public double calculateGrossSalary(){
	double grossSalary  = basicSalary + hra + da;
	System.out.print("Gross Salary is : ");
	return grossSalary;
	
}

public double calculateNetSalary(){
	double grossSalary = calculateGrossSalary();
	double netSalary = grossSalary - (grossSalary * taxPercentage / 100);
	System.out.print("Net Salary is : ");
	return netSalary;
}

}