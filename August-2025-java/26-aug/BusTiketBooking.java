
import java.util.Scanner;
class BusTiketBooking{
	
	String passengerName;
	String sourceCity;
	String destinationCity;
	int tickets;
	float pricePerTicket;

	public static void main(String args[]){
		
		BusTiketBooking B1 = new BusTiketBooking();
		
		B1.setInput();
		
			BusTiketBooking B2 = new BusTiketBooking();
			B2.setInput();
		
		
		
	}
	
	public void setInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :" );
		String passengerName = sc.nextLine();
		
		System.out.println("Enter Your Source City: ");
		String sourceCity = sc.nextLine();
		
		System.out.println("Enter your Destination:");
		String destinationCity = sc.nextLine();
		
		System.out.println("Enter your Ticket : ");
		int tickets = sc.nextInt();
		
		System.out.println("Enter your Per Ticket Amount: ");
		float pricePerTicket = sc.nextFloat();		
		
		System.out.println();
		
		
		this.passengerName = passengerName;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.tickets = tickets;
		this.pricePerTicket = pricePerTicket;
		
		
 displayBookingDetails(passengerName, sourceCity, destinationCity, tickets, pricePerTicket );
		
		
	}
	
	public void calculateFare(int tickets, float pricePerTicket){
		
		double totalAmount = tickets * pricePerTicket;
		
		System.out.println("Your fare is : " +totalAmount);
		
		
		
	}
	
	public void displayBookingDetails(String passengerName, String SourceCity, String destinationCity, 
		int tickets, float pricePerTicket ){
		
		 
		
		System.out.println("Passenger Name : "+ passengerName );
		System.out.println("Fron : " + sourceCity );
		System.out.println("to : " + destinationCity);
		System.out.println("Ticket : "+ tickets );
		System.out.println("Price Per Ticket " + pricePerTicket);
		calculateFare(tickets, pricePerTicket);
		
		
		
	}

}