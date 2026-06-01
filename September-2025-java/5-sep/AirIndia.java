import java.util.Scanner;

public class AirIndia{
	
	
	public static void main(String [] args){
		
		AirIndiaCustomer a1 = new AirIndiaCustomer();
		a1.setPassengeDetails();
		a1.displayPassengerDetails();
		
		
	}
	
}

class AirIndiaCustomer
{	static String Airway = " Air India " ;
	static double gstRate = 0.12;
	String passengerName;
	int flightNumber;
	double baseFare = 7000;
	
	
	public void setPassengeDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Passanger Name : ");
		this.passengerName = sc.nextLine();
		
		System.out.print("Enter the Flight Number : ");
		this.flightNumber = sc.nextInt();
		
		System.out.println("Enter the Seats :" );
		int seats = sc.nextInt();
		
		System.out.println("Enter the Amount has to be converted into USD :" );
		double amount  = sc.nextDouble();
		
		calculateFare(seats); 
		convertINRtoUSD(amount); 
		}
		
	
	public void displayPassengerDetails(){
		System.out.println(" Air Way System of Platform : " + AirIndiaCustomer.Airway);
		System.out.println("Passange Name : " + passengerName );
		System.out.println("Flight Number : " + flightNumber ); 
		}
	
	public void calculateFare(int seats){
		double totalFare = (seats * baseFare) + (baseFare * AirIndiaCustomer.gstRate);
		System.out.println("the Total Fare of Travel : " + totalFare);
	 }
	
	public static void convertINRtoUSD(double amountInINR){
		
	double USD = amountInINR / 88.0;
	System.out.println(" USD Amount is : " + USD );
	
		
	} 
	}
 