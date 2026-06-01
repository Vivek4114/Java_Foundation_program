class DigitFinder{
	
	public static void main(String args[]){
		findDigits(12345);
	}
	
	public static void findDigits(int number){
		int rev = 0;
	
		 
		
		while(number !=0){
			int digit = number % 10;
			rev = rev * 10 + digit;
			number/=10;
		}
		
		System.out.print("Digit is :");
		while(rev !=0){
			System.out.print(" "+rev%10);
			rev /=10;
			
			
		}
		
		System.out.println();
		
		
	}
	
}