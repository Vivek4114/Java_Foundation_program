import java.util.Scanner ;
class Order{
	 
	String orderId ;
	String customerName;
	int deliveryTimeInMinutes;
	int ETA;
	
	public Order(String orderId, String customerName, int deliveryTimeInMinutes) {
        this.orderId = orderId;
        this.customerName = customerName;
        
         
        if (deliveryTimeInMinutes >= 1 && deliveryTimeInMinutes <= 30) {
            this.deliveryTimeInMinutes = deliveryTimeInMinutes;
        } else {
            this.deliveryTimeInMinutes = 30;  
        }
    }
	
	public void trackOrder(){
		 System.out.println("Order ID: " + orderId);
		if(deliveryTimeInMinutes > 10 ){
			 System.out.println("Status  : Order is preparing ");
		}
		else if(deliveryTimeInMinutes <=10 && deliveryTimeInMinutes>0){
			 System.out.println("Status : Order Out of Delivery ");
		}else{
			System.out.println("Status : Deliverd ");
		}
		
	}
	
	public void trackOrder(int currentTime){
		
		int timeLeft = deliveryTimeInMinutes - currentTime;
		 System.out.println("Order ID: " + orderId);
		if( timeLeft > 10){
			System.out.println("Status = 'Preparing'");
			System.out.println("ETA : "+ timeLeft);
		}
		else if (timeLeft >= 1 && timeLeft <=10){
			System.out.println("Status = 'Out for Delivery'");
			System.out.println("ETA : "+ timeLeft);
		}
		else{
			System.out.println("Status = 'Delivered'");
		}
	}
	
}

public class Zepto{
	public static void main(String [] args){
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Order Id : ");
	String orderId = sc.nextLine();
	System.out.println("Enter the Customer Name : "); 
	String customerName = sc.nextLine();
	System.out.println("Enter the  Delivery Time : "); 
	int deliveryTimeInMinutes = sc.nextInt();
	System.out.println("Enter the  Current Time "); 
	int currentTime = sc.nextInt();
	
	Order o1 = new Order(orderId, customerName , deliveryTimeInMinutes);
	o1.trackOrder();
	o1.trackOrder(currentTime);
	}
	}
	