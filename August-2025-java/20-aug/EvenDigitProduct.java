/*Even Place Digit Product Lottery Code
A lottery tickets secret value is based on the product of digits at even places.
Write a program to print the product of digits at even places.
Class Name: EvenDigitProduct
Method Name: productEvenPosition(int number)
Return Type: void
Variable Suggestion: product, position

*/


class EvenDigitProduct{
	public static void main(String [] args){
		productEvenPosition(123456);N
	}
	
	public static void productEvenPosition(int number){
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
			rev/=10;
			pro*=rev%10;
			rev/=10;

		
			
		}
		
		System.out.println("Product of Even Digit " + pro);
		System.out.println();
		
	}
	
}