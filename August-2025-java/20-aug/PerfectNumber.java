/*  Perfect Number Ancient System
In ancient number theory, certain numbers are called perfect numbers if the sum of
their divisors equals the number itself. A research app needs to verify this.
Write a program to check whether a number is perfect or not.
Class Name: PerfectNumber
Method Name: isPerfect(int number)
Return Type: void
Variable Suggestion: sumOfDivisors
 */
 
 class PerfectNumber{
	 
	 public static void main(String args[]){
		 isPerfect(28);
		 isPerfect(4911:23 pm6);
	 }
	 
	 public static void isPerfect(int number){
		 int sumOfDivisors = 0;
		 int count = 1;
		 
		 while(count <= number/2){
			 
			 if(number % count ==0){
				 sumOfDivisors += count ;
			 }
			 
			 count++;
			 
		 }
		 
		 if(sumOfDivisors == number ){
			 System.out.println(number + " is a Perfect Number ");
			 
			 
		 }else{
			System.out.println( number + " is Not a  Perfect Number ");
		 }
		 
	 }
	 
 }