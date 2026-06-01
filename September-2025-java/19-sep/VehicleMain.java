/*
Scenario 4:
Imagine you manage vehicle registrations. Each vehicle has the following details:
Owner name
Model
Color
Registration number

When a vehicle is sold to another person, you want to create a new vehicle record
by copying the old vehicle’s details but changing the owner name.

Your Task
Create a class called Vehicle with the following fields:

String ownerName
String model
String color
String registrationNumber

Write two constructors in the Vehicle class:
A regular constructor to create a vehicle record.
A copy constructor that copies all details from another Vehicle object but accepts
a new owner name.

In your main method:
Create an original vehicle record.
Create a transferred vehicle record using the copy constructor with a new owner name.

Print both vehicle records to show that:
All details except the owner name are the same.
Learning Goals
Learn how to clone an object while changing ownership details.
Understand selective field modification in copy constructors.

Expected Output Example

Original Vehicle:  
Owner Name: Amit Reddy  
Model: Honda Civic  
Color: Blue  
Registration Number: TS09K1234  
------------------------------  
Transferred Vehicle (Copied):  
Owner Name: Sabnam Khan
Model: Honda Civic  
Color: Blue  
Registration Number: TS09K1234
*/

import java.util.Scanner;

class Vehicle{
	String ownerName;
	String model;
	String color;
	String registrationNumber;

	Vehicle(String ownerName ,String model ,String color, String registrationNumber){
		if(!ownerName.isEmpty() || !model.isEmpty() || !color.isEmpty() || !registrationNumber.isEmpty() ){
		this.ownerName  = ownerName ;
		this.model = model;  
		this.color = color;   
		this.registrationNumber = registrationNumber;
		}
		else{
			System.out.println("Enter the Valid Details");
			System.exit(0);
		}
	}
	
	Vehicle(Vehicle v){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Owner Name : ");
		String ownerName = sc.nextLine();

		this.ownerName  = ownerName ;
		this.model = v.model;  
		this.color = v.color;   
		this.registrationNumber = v.registrationNumber;
	}

	public String vehicleDetails(){
		return " Owner name: "+ownerName+
		"\n Model : "+model +
		"\n Color : "+color +
		"\n Registration Number : "+registrationNumber + "\n";
	}
	
}

public class VehicleMain{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the owner of vehicle : ");
	String ownerName = sc.nextLine();
	System.out.println("Enter the  Model of Vehicle : ");
	String model = sc.nextLine();
	System.out.println("Enter the  vehicle Color  : ");
	String color = sc.nextLine();
	System.out.println("Enter the  vehicle Registration Number : ");
	String regNumber = sc.nextLine();
	
	Vehicle v1 = new Vehicle(ownerName, model, color, regNumber);
	System.out.println(v1.vehicleDetails());
	Vehicle v2 = new Vehicle(v1);
	System.out.println(v2.vehicleDetails());
	}
}
