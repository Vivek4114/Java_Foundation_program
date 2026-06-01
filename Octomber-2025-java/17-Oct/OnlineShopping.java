

class  Product
{
	 protected String name;
	 protected double price;
	 
	 Product(String name, double price){
		 if(price > 0){
			this.price = price;
		 }
		 else{
			 System.out.println("Please Provide valid Value");
			 System.exit(0);
		 }
		 this.name = name;
	 }
	 
	 public void displayInfo(){
		 System.out.println("Producet Name  : " + name );
		 System.out.println("Producet Price : " + price );
	 }
	 
	 public double calculateTotalCost(int quantity){
		 
		 return quantity * price;
	 }
		 
}

class Electronics extends Product
{
	private String brand;
	Electronics(String name, double price, String brand ){
		super(  name,   price);
		this.brand = brand;
	}
	
	
	@Override
	public void displayInfo(){
		System.out.println("\nEletronics Products : ");
		super.displayInfo();
		System.out.println("Brand : " + brand );
	}
	
	
}

class Clothing extends Product
{
	private String size;
	Clothing(String name, double price, String size ){
		super(  name,   price);
		this.size =size;
		
	}
	
	@Override
		public void displayInfo(){
		System.out.println("\n Clothing Products : ");
			super.displayInfo();
			System.out.println("Size : " + size );
	}
	
	
}

public class OnlineShopping
{
	public static void main(String [] args){
		Electronics electronics1 = new Electronics("Mixer", 2000, "Mango");
		Clothing clothing1 = new Clothing("T-shit", 250, "M");
		electronics1.displayInfo();
		clothing1.displayInfo();
		
		
	}
}
