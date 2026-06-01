class SingleDigitSum{
	public static void main(String args[]){
		addUntilSingleDigit(9875);
	}
	
	public static void addUntilSingleDigit(int number){
		int sum = 0;
		
		while(number!=0){
			int rem = number%10;
			sum +=rem;
			number /=10;
			
			if( number == 0 && sum > 9){
				
				number = sum;
				sum = 0;
			}
		
		}
		
		 
	
	
	
	System.out.println("addition of number is : " +sum);
	}
}
	
	