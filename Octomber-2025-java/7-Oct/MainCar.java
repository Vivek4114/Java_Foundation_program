
/* HAS A Relation with car And Engine "*/
public class MainCar{
	public static void main(String [] args){
		Engine e1 = new Engine("Tata");
		e1.displayEngineDetails();
		Car c1 = new Car("2021","BS6",e1);
		System.out.println(c1.displayCarDetails());
		
		
		
	}
	
	
}

class Engine
{
	private String model;
	
	public Engine(String model){
		this.model = model;
	}
	
	public String displayEngineDetails(){
		
		return " Engine Details : " + this.model;
		
	}
}

class Car
{
	private String make; 
	private String model;
	private Engine engine;

public Car(String make, String model, Engine engine){
	this.make = make;
	this.model = model; 
	this.engine = engine;
	
}


public String displayCarDetails(){
	return "---Car Details---"+
			"\n Car Make : " + this.make +
			"\n car Model : " + this.model + 
			"\n" + this.engine.displayEngineDetails() ;
	}

}