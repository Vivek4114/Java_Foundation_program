/* 
 Airline Ticket Reservation (IndiGo/Air India-like)
Create a system for airline ticket booking.
Class: FlightTicket
Fields:
String passengerName
String flightNo
double ticketPrice
Tasks:
Use setters to assign ticket details.
Use getters to display ticket information.
Create three tickets in the test class and print them.
*/

//import java.util.Scanner;

class FlightTicket{
 private String passengerName;
 private int flightNo;
	private double ticketPrice;

public void setPassengerName(String passengerName){
	this.passengerName = passengerName;
}

public void setFlightNo(int flightNo){
	this.flightNo = flightNo;
}

public void setTicketPrice(double ticketPrice){
	this.ticketPrice = ticketPrice;
}

public String getPassengerName(){
	return passengerName;
}

public int getFlightNo(){
return flightNo;
}

public double getTicketPrice(){
return ticketPrice;
}

public String displayDetails(){
return " Passenger Name : " + passengerName +
	"\n Flight No : " + flightNo +
	"\n Ticket Price : " + ticketPrice;
}
}

public class IndiGo{

	public static void main(String [] args){
		FlightTicket f1 = new FlightTicket();
		f1.setPassengerName("Rahul");
		f1.setFlightNo(101);
		f1.setTicketPrice( );
		System.out.println(f1.displayDetails());
	}
}

	

