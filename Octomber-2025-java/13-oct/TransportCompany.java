/*
Single Level Inheritance:
Scenario:
A software company is developing a transport management system. As a part of this system,
you need to manage vehicle-related information. Every car is a type of vehicle,
and it inherits some basic properties from the vehicle class. You need to design
a program using single-level inheritance where a Car class inherits from a Vehicle class.

Requirements:
Create two classes: Vehicle and Car.

The Vehicle class should contain:
Instance variables: brand, speed
A non-static method displayVehicleDetails() to print those details.

The Car class should :
Inherit from Vehicle
Contain instance variables: model, fuelType

Have a non-static method displayCarDetails() that:
Accesses and prints its own variables
Accesses and prints inherited variables
Calls the inherited method displayVehicleDetails()

In the Main class:

Create an object of the Car class
Call the displayCarDetails() method to print all information

Test Case
Input (hardcoded in variables):
Vehicle brand: "Honda"
Vehicle speed: 80
Car model: "City"
Fuel type: "Petrol"

Expected Output:
Car Model: City
Fuel Type: Petrol
Inherited Brand: Honda
Inherited Speed: 80
Vehicle Brand: Honda
Top Speed: 80 km/h
Note:
You are not required to take input from the user. Just focus on demonstrating single-level
inheritance and how subclass can access superclass properties and methods.
*/
import java.util.Scanner;

class Vehicle{
String brand;
int speed;

	Vehicle(String brand , int speed ){
		this.brand  =  brand ;
		this.speed = speed;
	}

	public void displayVehicleDetails(){
		System.out.println("Brand : " + brand );
		System.out.println("Speed : " + speed );

	}
}

class Car extends Vehicle{
	String model;
	String fuelType;
	
	Car(String brand , int speed,String model, String fuelType){
		super(brand ,  speed);
		this.model = model;
		this.fuelType = fuelType;
		
	}
	
	public void displayCarDetails(){
		 
		 displayVehicleDetails();
		System.out.println("Model : " + model );
		System.out.println("Fuel Type : " + fuelType);
		
	}
	
}

class TransportCompany{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vehicle Brand : " );
		String brand = sc.nextLine();
		System.out.println("Enter the  speed : " );
		int speed = sc.nextInt();
					sc.nextLine();
		System.out.println("Enter the  model : " );
		String model = sc.nextLine();
		System.out.println("Enter the Fuel Type : ");
		String fuelType = sc.nextLine();
		
		
		Car car1 = new Car( brand,speed, model, fuelType);
		car1.displayCarDetails();
	}
	
	
}