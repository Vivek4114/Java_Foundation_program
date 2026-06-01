/*Q7. Even Position Digit Sum Banking Check
A banking application checks fraud by summing digits at even places in an account
number.
Write a program to print the sum of digits at even places.
Class Name: EvenDigitSum
Method Name: sumEvenPosition(int number)
Return Type: void
Variable Suggestion: sum, position
*/


class EvenDigitSum{
	public static void main(String [] args){
		sumEvenPosition(198677);
	}
	
	public static void sumEvenPosition(int number){
		int sum = 0;
		int rem = 0;
		int c= 0;

		int rev = 0;
		int rem1 = 0;

		int temp = number;
		
		//int rev = Integer.parseInt(new StringBuilder(""+number).reverse().toString());

		while (number!=0) { 
			 rem1 = number % 10;
			rev = rev * 10 + rem1;
			number /=10;

		}
		
		System.out.println(temp+"->"+rev);

		while(rev !=0){ //198677    776891
			rev/=10; // 77689
			sum+=rev%10;
			rev/=10;

		
			
		}
		
		System.out.println("Sum of Even Digit " + sum);
		
	}
	
}