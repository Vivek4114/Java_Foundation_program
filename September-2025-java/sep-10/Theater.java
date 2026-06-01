import java.util.Scanner;

public class Theater{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		MovieTicket m1 = new MovieTicket();
		
		System.out.println("Enter the Movie Name : " );
		String movieName = sc.nextLine();
		m1.setMovieName(movieName);
		
		System.out.println("Enter the Seat Number : " );
		int seatNumber = sc.nextInt();
		m1.setSeatNumber(seatNumber);
		
		System.out.println("Enter the Ticket Price : " );
		double ticketPrice = sc.nextDouble();
		m1.setTicketPrice(ticketPrice); 
		
		System.out.println( m1.getMovieName());
		System.out.println( m1.getSeatNumber());
		System.out.println( m1.getTicketPrice());
	}
}


		