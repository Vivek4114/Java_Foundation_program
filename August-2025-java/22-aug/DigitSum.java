class DigitSum{
	
	public static void main(String args[]){
		sumDigits(2455654);
	}
	
	public static void sumDigits(int number){
		int sum = 0;
		while(number !=0){
			int digit = number % 10;
			 sum += digit;
			number/=10;
		}
		
		System.out.println("sum of Digit is : " + sum);
		
		
	}
	
}