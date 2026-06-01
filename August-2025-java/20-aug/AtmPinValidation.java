/*Q1. ATM PIN Validation
A banks ATM software needs to check how many digits a customers PIN has before
processing it.
Write a program to count the digits of a number.
Class Name: PinValidator
Method Name: countDigits(int number)
Return Type: void
Variable Suggestion: digit Count   stores the count of digits.
*/


class AtmPinValidation 
{
	public static void main(String[] args) 
	{	
		CountDigit(23456);
		
	}
	
	public static void CountDigit(int pin){
		int count = 0;
		while(pin!=0){
			count++;
			pin/=10;
			
		}
		
		System.out.println("Pin Digit Count is : " + count);
		
	}
	
}
