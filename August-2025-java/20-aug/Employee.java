class Employee{
	
	String name ;
	int age;
	
	String Desigation;
	double salary=345;
	static String CompnyName = "abc";
	
	public static void main(String [] args){
		System.out.println("Main Starts");
		
		Employee e1 = new Employee();
		
		System.out.println(e1.salary );
	}
	
}