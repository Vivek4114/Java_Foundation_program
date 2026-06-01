class Vehicle{
	String brandName;
	String color;
	String model;
	int wheels;


	Vehicle(String brandName, String color, String model, int wheels){
	this.brandName = brandName;
	this.color = color;
	this.model = model;
	this.wheels = wheels;

	}

	public void accelerate(){
		System.out.println(brandName + " has been Accelerate ");
	}

	public void applyBreak(){
		System.out.println(brandName + " Car Has applied Break ");

	}
	 
	public void displayDetails(){
		System.out.println("Brand Name : " + brandName);
		System.out.println("Color : "+color);
		System.out.println("model : "+model);
		System.out.println("Wheels : " + wheels);
		
	}
}

class Car extends Vehicle{
	 

	Car(String brandName, String color, String model, int wheels){
		super(brandName, color, model, wheels);
		 
	}
	 
	public void displayCarDetails(){
		displayDetails();
		 
	}

}

class ElectricCar extends Car{
	int batteryCapasity;
	ElectricCar(String brandName, String color, String model, int wheels, int batteryCapasity){
		super(brandName, color, model, wheels);
		this.batteryCapasity= batteryCapasity;
	}
		
	public void displayElectricCarDetails(){
		displayCarDetails();
		System.out.println("Battery Capasity : " + batteryCapasity );
		 
	}
	
	
	public void charge(){ 
		System.out.println( brandName+" are kept on Charge Now");
	}
}
	
public class CarCompany{

	public static void main(String [] args){
		Car car1 = new Car("Tata", "black ", "OD420", 4 );
		ElectricCar  electricCar1 = new ElectricCar("TATA - T1 " , "grey", "SUV0119",4, 10000);
		car1.accelerate();
		car1.applyBreak();
		car1.displayCarDetails();
		electricCar1.displayElectricCarDetails();
		electricCar1.charge();
		electricCar1.applyBreak();
		electricCar1.accelerate();
		electricCar1.displayCarDetails();
		
		
	}
}