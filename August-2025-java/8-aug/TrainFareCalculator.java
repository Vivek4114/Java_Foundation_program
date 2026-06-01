import java.util.*;


class TrainFareCalculator{
public static void main(String args[]){

	int age, noOfTickets, ticketPrice, totalFare ;



	System.out.println("Enter your   age and Ticket : ");
	Scanner sc = new Scanner(System.in);
	
	age = sc.nextInt();
	noOfTickets = sc.nextInt();


	 ticketPrice = (age >= 12 ) ?  (noOfTickets * 100) : (noOfTickets* 50);

	 

	System.out.println("Total Fare : "+ ticketPrice);

	}
}
