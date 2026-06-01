class Sample3{
	static int x = 24;
	static int y = 345;
	public static void main(String args[]){
		
		called();
	}
	
	public static void called(){
		System.out.println(" x value is " + x);
		System.out.println(" Y value is " + y);
	}
}