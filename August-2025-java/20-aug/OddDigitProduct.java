 /*Odd Place Digit Product Lottery Code
Another lottery check uses the product of digits at odd places.
Write a program to print the product of digits at odd places.
Class Name: OddDigitProduct
Method Name: productOddPosition(int number)
Return Type: void
Variable Suggestion: product, position
*/


class OddDigitProduct{
	public static void main(String [] args){
		productOddPosition(12345);
	}
	
	public static void productOddPosition(int number){
		int pro = 1;
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
			
			pro*=rev%10;
			rev/=10;
			rev/=10;

		
			
		}
		
		System.out.println("product of Odd Digit " + pro);
		
	}
	
}