
import java.util.Scanner;

public class fuelEffieciencyCalculator
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args){
		Car c1 = new Car();
		
		System.out.print("Enter the FuelConsumed (liters): ");
		double fuelConsumed = sc.nextDouble();
		System.out.print("Enter the Distance : ");
		double distanceTravelled = sc.nextDouble();
		 c1.setFuelConsumed(fuelConsumed);
		 c1.setDistanceTravelled(distanceTravelled);
		
		System.out.println(c1.getFuelConsumed());
		System.out.println(c1.getDistanceTravelled());
		System.out.println(c1.calculateMileage());
		System.out.println(c1.calculateFuelEfficiency());
	
	}
	
	 
		
}