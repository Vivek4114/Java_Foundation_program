class KapreKar{
	public static void main(String args[]){
		calculateKaprekar(45);
	}
	
	public static void calculateKaprekar(int num){
		
		int sq = num * num;
		
		int temp =  num;
		int count = 0;
		
		while(temp !=0){
			count++;
			temp/=10;
		}
		
		
		int pow = 1;
		
		for(int itr = 1; itr<= count; itr++){
			pow = pow * 10;
			
		}
		
		 

		
		
		
		int Que = sq / pow;
		int rem = sq % pow;
		
		if((Que + rem) == num ){
			System.out.println("Kaprekar Number");
		}
		else{
			System.out.println("Not Kaprekar Number ");
			
		}
		
	}
	
		
		
	}