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
		 ReverseNumbe(12345677654);
		 
	 }
	 
	 public static void ReverseNumbe(long MoNo){
		 
		 while(MoNo !=0){
			 int rev = 0;
			 int rem = MoNo%10;
			   rev = rev * 10 + rem ;
			   MoNo /=10;
		 }
		 
		 System.out.println("Reverse Mobile Number " + rev);
		 
	 }
	 