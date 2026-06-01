/*
 "Design a class Vehicle with attributes: registrationNumber, ownerName, model, and year.
Overload constructors for:
Registering only with registrationNumber.
Registering with registrationNumber and ownerName.
Full registration.

Design a user defined method 'displayDetails()' to return the details of this object.

Input Validation:
registrationNumber should not be empty.
year must be between 1990 and the current year.

Test Cases and Expected Output:
Vehicle v1 = new Vehicle(""KA01AB1234"");
Vehicle v2 = new Vehicle(""MH12XY7890"", ""John"");
Vehicle v3 = new Vehicle(""DL04GH4567"", ""Jane"", ""Honda City"", 2020);

System.out.println(v1.displayDetails());
System.out.println(v2.displayDetails());
System.out.println(v3.displayDetails());
Expected Output:
Reg#: KA01AB1234, Owner: Unknown, Model: Unknown, Year: 0
Reg#: MH12XY7890, Owner: John, Model: Unknown, Year: 0
Reg#: DL04GH4567, Owner: Jane, Model: Honda City, Year: 2020"
*/

import java.util.Scanner;

public class VehicleShop{

	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the  Vehicle Registration Number : ");
		String registrationNumber = sc.nextLine();
		
		if(registrationNumber.isEmpty() || registrationNumber.equals(" ")){
			System.out.println("Enter the Valid Registration Number ");
			System.exit(0);
		}
			
		
		System.out.print("Enter the  Vehicle Owner : ");
		String ownerName  = sc.nextLine();
		if(ownerName.isEmpty() || ownerName.equals(" ")){
			System.out.println("Enter the Valid Owner Name  ");
			System.exit(0);
		}
		
		System.out.print("Enter the  Vehicle Model : ");
		String model  = sc.nextLine();
		if(model.isEmpty() || model.equals(" ")){
			System.out.println("Enter the Valid Model Name  ");
			System.exit(0);
		}
		
		System.out.print("Enter the  Vehicle purchase Year : ");
		int  year  = sc.nextInt();
		if(year <= 0){
			System.out.println("Enter the Valid Year  ");
			System.exit(0);
		}
		
		
		Vehicle v1 = new Vehicle(registrationNumber);
		Vehicle v2 = new  Vehicle(registrationNumber, ownerName);
		Vehicle v3 = new Vehicle(  registrationNumber, ownerName, model, year);
		Vehicle v4 = new Vehicle();
		System.out.println(v1.displayDetails());
		System.out.println(v2.displayDetails());
		System.out.println(v3.displayDetails());
		System.out.println("Default : \n "+ v4.displayDetails());
		 
		}
}

class Vehicle{
	String registrationNumber;
	String ownerName;
	String model;
	int  year;
	
	Vehicle(){ 
	registrationNumber =  "N/A";
	ownerName = "N/A";
	model = "N/A";
	year =  0;
	}
	
	Vehicle(String registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	Vehicle(String registrationNumber, String ownerName){
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
	}
	Vehicle(String registrationNumber, String ownerName, String model, int year){ 
	this.registrationNumber = registrationNumber;
	this.ownerName = ownerName;
	this.model = model;
	this.year = year;
	}
	
	public String displayDetails(){
		return "Registration Number : "+ registrationNumber +
			" Owner Name : "+ ownerName +
			" Model : "+ model +
			" Year : "+year;
	}
	
}

	