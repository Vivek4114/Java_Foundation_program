class Vehicle 
{
	public void showType(){
		System.out.println("Generic Vehicle");
	}
 
}

class Car extends Vehicle
{
	@Override
		public void showType(){
			System.out.println(" Vehicle Type : Car ");
		}
}
interface ElectricVehicle
{
	public void showHybridFeature();
}

class Truck extends Vehicle implements ElectricVehicle
{
	@Override
		public void showType(){
			System.out.println("Veicle Type : Truck " );
		}
		
	@Override
		public void showHybridFeature(){
			System.out.println("Hybrid Feature: Electric Assist Enabled");
			
		}
	
}

class VehicleCompany
{
	public static void main(String []args){
		Car car = new Car();
		Truck truck = new Truck();
		//car.showType();
		//truck.showType();
		//truck.showHybridFeature();
		
		Vehicle []vehicles = { car, truck};
		
		for(Vehicle v : vehicles ){
			
			v.showType();
			
			if(v instanceof Truck){
				System.out.println("Hello");
				Truck t = (Truck)v;
				t.showHybridFeature();
			}
			
		}
		
	}
}


