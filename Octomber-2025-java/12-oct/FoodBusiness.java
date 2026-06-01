
public class Business {
	
	String businessName;
	String businessOwnerName;
	int noOfEmployees;
	
	Business(String businessName, String businessOwnerName, int noOfEmployees){
		this.businessName = businessName;
		this.businessOwnerName = businessOwnerName;
		this.noOfEmployees = noOfEmployees;
		
	}

	public void producation(String productType) {
		System.out.println(productType +" is  product of that company");
	}
	
	public void sellProduct(Product p) {
		
	}
	
	public void applyDiscount(double discountPercentage) {
		
	}

}

class Restaurant extends Business {
	String location;
	int seatingCapacity;
	String parkingArea;
	
	public Restaurant(String businessName, String businessOwnerName, int noOfEmployees, String location, int seatingCapacity, String parkingArea) {
		super();
		this.location = location;
		this.seatingCapacity = seatingCapacity;
		this.parkingArea = parkingArea;
	}

	public void displayRestaurantDetails() {
		System.out.println( "Restaurant [location=" + location + ", seatingCapacity=" + seatingCapacity + ", parkingArea="
				+ parkingArea + "]");;
	}
	
	
	
	
}

class CloudKitchen extends Business{
	int virtualId;

	public CloudKitchen(String location, int seatingCapacity, String parkingArea, String virtualId) {
		 super(  location,   seatingCapacity,   parkingArea)
		this.virtualId = virtualId;
	}

	 
	public void displayCloudKitchen() {
		System.out.println( "CloudKitchen [virtualId=" + virtualId + "]");
	}
	
	
	
	
}


class CartKitchen extends Business{
	int noOfWheels;

	public CartKitchen(String businessName, String businessOwnerName, int noOfEmployees, int noOfWheels) {		 
		this.noOfWheels = noOfWheels;
	}

 	 
	public void displayCartKithcen() {
		System.out.println( "CartKitchen [noOfWheels=" + noOfWheels + "]");
	}
	
		
}


public class FoodBusiness{
	public static void main(String[] args) {
		Restaurant restaurant1 = new Restaurant("AmeerPeth", 50,"200Sq.M" );
		CloudKitchen cloudKitchen1 = new CloudKitchen(2929);
		
	}
}


