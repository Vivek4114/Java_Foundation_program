import java.util.*;


class SalaryBonusCalculator{
public static void main(String args[]){

	double salary , yearsOfService , bonus, finalSalary ;


	System.out.println("Enter your   Salary and Year of Experience  : ");
	Scanner sc = new Scanner(System.in);
	
	salary = sc.nextInt();
	yearsOfService = sc.nextInt();


	 bonus = (yearsOfService >=5 ) ?  (salary *0.15) : (salary*0.05);

	finalSalary = bonus + salary;

	System.out.println("Final Salary : RS. "+ finalSalary);

	}
}
