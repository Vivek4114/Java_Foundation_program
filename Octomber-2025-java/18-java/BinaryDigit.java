class BinaryDigit{
	public static void main(String [] args){
	
		 long bin = 11101;
		 
		 int count = -1;
		 double pow = 0;
		 int sum = 0;
		 while(bin != 0){
			 count++;
			 
			 long rem = bin%10;
			 
			 if(rem == 1 ){
				 
				 for(int i = 1; i<=count; i++){
					 pow = 2 * count;  
				 }
				 
			 }
			 
			 sum += pow;
		 
		}
		
		
		System.out.println("Decimal Digit : " + sum );
		
		}	
		
	}	
	hellow world kay kart ahee
	