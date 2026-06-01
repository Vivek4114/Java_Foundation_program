/* Reversing Train Ticket Numbers
At a railway counter, ticket numbers need to be reversed for cross-checking against
a fraud database.
Write a program to reverse a number.
Class Name: TicketReverser
Method Name: reverseNumber(int number)
Return Type: void
Variable Suggestion: digit, reversed
*/

class TicketReverser{
	public static void main(String [] args){
		reverseNumber(3456);
	}
	
	public static void reverseNumber(int number){
		int rev = 0;
		int rem = 0;
		int count =0;
		
		while(number !=0){
			count++;
			rem = number % 10;
			rev = rev * 10 + rem;
			
			number /=10;
			
		}
		
		System.out.println("Reverse Number : " + rev + " Count :  " + count );
		
	}
	
}