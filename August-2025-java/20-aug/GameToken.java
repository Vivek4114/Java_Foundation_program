/*  Q4. Game Token Calculation
In a board game, a tokens power is decided by multiplying all digits of the token
number.
Write a program to print the digital product of a number.
Class Name: GameToken
Method Name: digitalProduct(int number)
Return Type: void
Variable Suggestion: product
 */
 
 class GameToken{
	 public static void main(String args[]){
		 
		 digitalProduct(1234);
	 }
	 
	 public static void digitalProduct(int number){
		 int rem =0;
		 int mul = 1;
		 int temp = number;
		 
		 while(number !=0){
			rem = number % 10;
			
			mul *= rem ;
			number /=10;
			 
		 }
		 
		   number = temp ;
		 
		 
		 
		 System.out.println("the number power of sum of all digit " +  (long)Math.pow(number,mul) );
		 
		 
	 }
 }