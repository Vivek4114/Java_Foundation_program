class AlternateDigitSum{
	public static void main( String [] args){
		addAlternate(123352);
		
	}
	
	public static void addAlternate(int number){
		int sum = 0;
		int temp = number;
		while(number != 0){
			int rem = number%10;
			
			sum += rem;
			
			number/=100;
		}
		 
		
		System.out.println(" sum is " + sum);
		
		
	}
	
}