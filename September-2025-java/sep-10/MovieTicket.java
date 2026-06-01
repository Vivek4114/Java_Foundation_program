class MovieTicket{

private	String movieName ; //name of the movie.
private int seatNumber; //seat number assigned to the ticket.
private double ticketPrice;// cost of the ticket.

public void setMovieName(String movieName){
	
	if(movieName == null){
			System.err.println("Movie Ticket Have Some Name");
			System.exit(0);
	}
	else{
		this.movieName = movieName;

	}
}

public void setSeatNumber(int seatNumber){
	
	if(seatNumber > 0){
 
		this.seatNumber = seatNumber;
	}
	else{
		System.err.println("Seat Number Must be Positive");
		System.exit(0);
	}
	
	}
	
	public void setTicketPrice(double ticketPrice){
		if(ticketPrice > 0){
			
		this.ticketPrice = ticketPrice;
		}
		else{
			System.err.println("Kindly Privide some correct Value ");
		}
	}

	public String getMovieName(){
		return movieName;
	}

	public int getSeatNumber(){
		return seatNumber;
	}
	
	public double getTicketPrice(){
		return ticketPrice;
	}
}

