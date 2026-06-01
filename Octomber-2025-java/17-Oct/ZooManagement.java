class Animal{
	private String name;
	private int age;
	
	Animal(String name, int age){
		if(age > 0 ){	
			this.age = age;
		}else{
			System.out.println("Please Provide Valid Age ");
			System.exit(0);
		}
	
			this.name = name;
	}
	
	public void makeSound(){
		
		System.out.println("The animal makes a generic sound");
	}
	
	public void displayInfo(){
	
		System.out.println("Name : " + name + " \n age  : " + age);
	}
	
	
	

}

class Lion extends Animal{
	private int maneLength;
	
	Lion(String name, int age, int maneLength){
		super(name, age);
		if(maneLength > 0 ){
			this.maneLength = maneLength;	
		}
		else{
			System.out.println("Please Provide some Valid maneLength");
			System.exit(0);
		}
	}
	
	@Override
	public void makeSound(){
		System.out.println("The lion roars loudly.");
	}
	
	public void displayManeLength(){
		System.out.println("\nLion Information : ");
		displayInfo();
		System.out.println(" Mane Length : " + maneLength + " Cm ");
	}
	
		
	
} 

class Elephant extends Animal{
	private float tuskLength;
	Elephant(String name, int age, float tuskLength){
		super(name, age);
		
		if(tuskLength > 0 ){
			this.tuskLength = tuskLength;
		}
		else{
			System.out.println("Please Provide some Valid Tusk length");
			System.exit(0);
		}
		
	}
	
	@Override
	public void makeSound(){
		System.out.println("The elephant trumpets");
	}
	
	public void displayTuskLength(){
		System.out.println("\nElephant Information : ");
		displayInfo();
		System.out.println("Tusk Length : " + tuskLength + " Meter " );
	}
	
}


class ZooManagement{

	public static void main(String [] args){
		Lion lion1 =  new Lion("Simba", 5, 10 );
		Elephant elephant1 = new Elephant("Hatti", 10, 2.5f);

		lion1.displayManeLength();
		lion1.makeSound();
		elephant1.displayTuskLength();
		elephant1.makeSound();
	}
}
		
	
	
