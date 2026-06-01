
class PerfectNumber{
	
	public static void main(String args[]){
		checkPerfect(293:39 pm);
		
	}
	
	public static void  checkPerfect(int number){
		int sum = 0;
		int itr = 1;
		
		while(itr <= number/2){
			
			if(number % itr == 0){
				sum += itr;
				
			}			
		 
			itr++;
			
		}
		
		if(sum == number){
			System.out.println(number + " is Perfect Number ");
		}
		else{
			System.out.println(number + " is Not Perfect Number ");

		}
		
		
		
	}
	
}
