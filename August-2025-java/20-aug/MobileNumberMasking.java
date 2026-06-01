/* Q2. Mobile Number Masking
For privacy, a mobile app wants to display a users phone number in reverse order
when sending a one-time password (OTP).
Write a program to print every digit of a given number in reverse order.
Class Name: MobileMask
Method Name: reverseDigits(int number)
Return Type: void
Variable Suggestion: digit, reversedNumber

 */
 
 
 class MobileNumberMasking{
	 public static void main(String args[]){
		 ReverseNumbe(1234567654l);
		 
	 }
	 
	 public static void ReverseNumbe(long MobileNumber){
		 long rev = 0;
		 long rem = 0;
		 while(MobileNumber !=0){
			 
			   rem = MobileNumber % 10;
			   rev = rev * 10 + rem ;
			   MobileNumber /=10;
		 }
		 
		 System.out.println("Reverse Mobile Number " + rev);
		 
	 }
	 
 }
	 