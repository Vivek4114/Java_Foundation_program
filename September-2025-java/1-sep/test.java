class test{

	static int a = 10;
	static int b = 20;
	int c = 30;
	int d = 40;
	
	public static void main(String args[]){
		 
		callA();
		
	}
	
	public static void callA(){
		test t2 = new test();
		
		
		System.out.println("a : " + a   );
		System.out.println("b : " +  b  );
		System.out.println("c : " + t2.c  );
		System.out.println("d : " + t2.d  );
		
	}
	
	
	
	 
}
