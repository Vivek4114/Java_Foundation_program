 /*odd Position Digit Sum  Banking Check
Similarly, another check requires the sum of digits at odd places.
Write a program to print the sum of digits at odd places.
Class Name: OddDigitSum
Method Name: sumOddPosition(int number)
Return Type: void
Variable Suggestion: sum, position
*/


class OddDigitSum{
	public static void main(String [] args){
		sumOddPosition(8654439);
	}
	
	public static void sumOddPosition(int number){
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

		while(rev !=0){
			
			sum+=rev%10;
			rev/=10;
			rev/=10;

		
			
		}
		
		System.out.println("Sum of Odd Digit " + sum);
		
	}
	
}