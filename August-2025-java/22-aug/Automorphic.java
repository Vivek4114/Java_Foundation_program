 

class Automorphic{

	public static void main(String [] args){
		checkAutomorphic(25);
		System.out.println("hellow");
		int x = CalculatePower(6,7);
		System.out.println(x);
	}
	
	public static void checkAutomorphic(int number){
		
		int temp1 = number;
		int count = 0;
		
		int sq = number * number;
		int temp = sq;
		
		 while(temp != 0 ){
			count++;
			temp/=10;
		 }
		 
		 int CheckLast = 0;
		 CheckLast =  CalculatePower(10 ,(count-1));
		int RealNumber = sq % CheckLast;
		
		
		if(number == RealNumber){
			
			System.out.println(number + " Automophic Number  "); 
			
		}
		else{
			System.out.println(number + " Not automorphic Number ");
		}
	}

	public static int CalculatePower(int base, int power){
		int pow = 1;
		
		for(int i = 1;  i<= power; i++){
			pow *= base;
			
		}
		
		 return pow;
		
	}
		
}