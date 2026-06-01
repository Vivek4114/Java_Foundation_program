/* Q3. Lucky Ticket Checker
In some countries, a bus ticket is considered lucky if the sum of its digits is
divisible by 9.
Write a program to calculate the digital sum of a ticket number.
Class Name: TicketChecker
Method Name: digitalSum(int number)
Return Type: void
Variable Suggestion: sum
 */
 
 class TicketChecker{
	 public static void main(String args[]){
		 digitalSum(2556);
	 }
	 
	 public static void digitalSum(int Number){
		 int rem = 0;
		 int sum = 0;
		 while(Number !=0){
			 rem = Number % 10;
			 
			  sum += rem ;
			  
			  Number /=10;
		 }
		 System.out.println("Sum of All Digit is : " + sum);
		 
		 if(sum % 9 == 0){
			 System.out.println("The Number is Lucky Number : " + sum );
		 }
		 else{
			 System.out.println("Not a Lucky Number");
		 }
	 }
 }