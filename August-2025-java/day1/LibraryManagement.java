import java.util.Scanner;

class LibraryManagement{
	
	String fullName;
	int rollNumber;
	String department;
	String email;
	long mobileNumber;
	
	public static void main(String [] args){
		
	
		getInput();
		
		
		
	}
	
	public static  void getInput( ){
		
		LibraryManagement L1 = new LibraryManagement();
		
		Scanner sc = new Scanner(System.in);	
		String fullName = sc.nextLine(); 
		int rollNumber = sc.nextInt(); sc.nextLine();
		String department = sc.nextLine();
		String email = sc.nextLine();
		Long mobileNumber = sc.nextLong();
		
		
		
		
		L1.fullName  = fullName;
		L1.rollNumber = rollNumber;
		L1.department = department;
		L1.email = email;
		L1.mobileNumber = mobileNumber;
		
		
		
		
			
		
		L1.displayDetials();
	}
	
	public   void displayDetials(  ){
		
		System.out.println("Full Name : " +this.fullName);
		System.out.println(" Roll Nmber : " +  this.rollNumber);
		System.out.println(" DepartMent : " +  this.department );
		System.out.println(" Email : " + this.email  );
		System.out.println(" MobileNumber : " + this.mobileNumber );
		System.out.println("--------------------------------------------------");
	}
	
}