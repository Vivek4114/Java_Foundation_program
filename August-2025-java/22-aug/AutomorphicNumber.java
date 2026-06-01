class  AutomorphicNumber{
	public static void main(String args []){
		checkAutomorphic(625);
	}
	
	public static void checkAutomorphic(int number){
		
		int t =(int) Math.sqrt(number);
		
		int count = 0;
		int temp = number;
			
		
		while(number !=0){
		count++;
		number/=10;
		
		}
		
		number = temp;
		
		int DivideNumber = 0;
		int Lastdigit  = 0;
		
		  DivideNumber = (int)Math.pow(10,(count-1));
		  Lastdigit = number % DivideNumber;
		  
		  System.out.println(t);
		  System.out.println(Lastdigit);
		  if(t == Lastdigit){
			  System.out.println( number + " is  an Automorphic Number ");
			  
		  }
		  else{
				  System.out.println( number + " is  not a  Automorphic Number ");
		  }
		
		
	}
	
}