class DigitCounter{
	
	public static void main(String args[]){
		CountDigit(2455654);
	}
	
	public static void CountDigit(int number){
		int count = 0;
		while(number !=0){
			count++;
			number/=10;
		}
		
		System.out.println("Number of Digit is : " + count);
		
		
	}
	
}