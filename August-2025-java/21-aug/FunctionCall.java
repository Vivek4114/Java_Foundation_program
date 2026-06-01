class FunctionCall{
	
	public static void main(String args[]){
		
		incrementCounter();
		incrementCounter();
		incrementCounter();
	}
	
	static int count = 0;
	
	public static void incrementCounter(){
		//int count = 0;
		
		count++;
			 
		System.out.println("Count is : " +count);
		 
	}
}
