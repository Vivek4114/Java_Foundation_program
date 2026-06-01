/*Question 1: Fuel Efficiency Calculator

Create a Car class (BLC Class)

Attributes:
fuelConsumed (in liters, private, double)
distanceTravelled (in kilometers, private, double)

Methods:
Setters:
public void setFuelConsumed(double fuelConsumed)
public void setDistanceTravelled(double distanceTravelled)

Getters:
public double getFuelConsumed()
public double getDistanceTravelled()

calculateMileage() Method:
Purpose: Calculate and return mileage (km per liter).
Formula: mileage = distanceTravelled / fuelConsumed
Return Type: double

calculateFuelEfficiency() Method:
Purpose: Calculate and return fuel efficiency in liters per 100km.
Formula: fuelEfficiency = (fuelConsumed / distanceTravelled) * 100
Return Type: double

Tester Class:
Test Case 1:
Input: fuelConsumed = 10, distanceTravelled = 150
Expected Output: Mileage = 15.0 km/l
Test Case 2:
Input: fuelConsumed = 10, distanceTravelled = 150
Expected Output: Fuel Efficiency = 6.67 L/100km
*/
class Car{
	
	private double fuelConsumed;
	private double distanceTravelled;
	
	public void setFuelConsumed(double fuelConsumed){
		this.fuelConsumed = fuelConsumed;
	}
	
	public void setDistanceTravelled(double distanceTravelled){
		
		this.distanceTravelled = distanceTravelled;
	}
	
	public double getFuelConsumed(){
		return fuelConsumed;
	}
	
	public double getDistanceTravelled(){
		return distanceTravelled;
	}
	
	public double calculateMileage(){
		double mileage = distanceTravelled / fuelConsumed;
		System.out.print("Mileage is :");
		return mileage;
	}
	
	public double calculateFuelEfficiency(){
		double fuelEfficiency = (fuelConsumed / distanceTravelled) * 100;
		System.out.print("Fuel Effeciency is :");
		return fuelEfficiency;
	}
}


	

	
	
