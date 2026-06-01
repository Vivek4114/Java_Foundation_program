class DisariumNumber{
	public static void main(String args[]){
		checkDisarium(89);
		
	}
	
	public static void checkDisarium(int number){
		int count = 0;
		int rev = 0;
		int t1 = number;
		while(number !=0){
			int rem = number%10;
			rev = rev * 10 + rem;
			number /=10;
			
		}
		 
		 
		int sum = 0;
		
		while(rev != 0){
			count++;
			int rem = rev %10;
			 sum += Math.pow(rem,count);
			rev/=10;
			
		}
		
		if(sum == t1){
			System.out.println(t1 + " is Disarium Number");
		}
		else{
			System.out.println(t1 + " is not Disarium Number");
		}
		
	}
	
}