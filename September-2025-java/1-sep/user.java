class PrintName {

	String name = "Ramesh";
	int age = 35;
	static String organization = "GSG";
	static String branch = "CS Branch";
	
	
	
	public static void displayDetails(){
	
			PrintName p1 = new PrintName();
	
		System.out.println(" Name is :  " +  p1.name  );
		System.out.println("  age is :  " +  p1.age  );
		System.out.println("  branch :   " +   branch  );
		System.out.println("  organization   " +  organization  );
	
	}
	
}
	
	
	class user
	{
		
		public static void main(String [] args){
	
		PrintName.displayDetails();
	}
	}