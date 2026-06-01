import java.util.Scanner;

class RestaurantBilling{
	public static void main(String args[]){
		
		RestaurantCustomer r1 = new RestaurantCustomer();
		r1.setValue();
		
	}

	
}

class RestaurantCustomer
{
	static String RestaurantName = "abc Restaurant";
	String custName;
	String foodItem;
	int qty;
	double price ;
	
	
	public void setValue(){
		 
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Customer Name : " );
		String name = sc.nextLine();
		this.custName = name;
		
		System.out.println("Enter the FoodItem:");
		String foodItem = sc.nextLine();
		this.foodItem = foodItem;
		
		System.out.println("Enter the Quantity of item:");
		int qty = sc.nextInt();
		this.qty = qty;
		 
		
		if(foodItem.equals("Pizza"))
		{
			
			this.price = 200;
		}
		else if(foodItem.equals("Burger")){
			
			this.price = 150;
		}
		else if(foodItem.equals("Pasta")){
			
			this.price = 120;
		}
		else if(foodItem.equals("Sandwich")){
			
			this.price = 100;
		}else{
			this.price = 0;
			System.out.println("Wrong Dishes Input " );
		}
		
		calculateValue(foodItem, qty, this.price);
		
				
	}
	
	
	public void calculateValue(String foodItem, int qty, double price){
		double amount = qty * price;
		double gstAddedAmount  = 0;
		double discountAmount = 0;
		if(amount > 500){
			
			discountAmount = amount * 0.10;
			
		}
		
		gstAddedAmount = amount * 0.05 ;
		
		double finalAmount = (gstAddedAmount - discountAmount) + amount;
		System.out.println("Restuarant name : " +RestaurantCustomer.RestaurantName); 
		System.out.println("Food Item : " + foodItem );
		System.out.println("Quantity : " + qty);
		System.out.println("price : " + price );
		
		System.out.println("Base Amount : " + amount);
		System.out.println("GSt: " + gstAddedAmount);
		System.out.println("Discount (10%) : " + discountAmount );
		System.out.println("Final Amount : " + finalAmount);
		
		
		
	}
	
}