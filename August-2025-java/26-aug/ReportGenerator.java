import java.util.Scanner;
class ReportGenerator{
	int m1 , m2, m3;
	
	 
	static int noOfSub = 3;
	
	public static void main(String args[]){
		ReportGenerator R1 = new ReportGenerator();
		
		R1.inputMarks();
		R1.displayResult();
		
		
	}
	
	public void inputMarks(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Subject Marks: ");
		int m1 = sc.nextInt();
				
		System.out.println("Enter your Second Subject Marks: ");
		int m2 = sc.nextInt();
		
		System.out.println("Enter your Third Subject narks: ");
		int m3 = sc.nextInt();
		
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
		
		
		
		
	}
	
	public void calculateResult(int m1, int m2, int m3){
		int total  = m1 + m2 + m3;
		System.out.println(" Total is : "+ total );
		
		String result = "fail";	
		double avg = (double)total / (double)noOfSub;
		System.out.println("Average is : " + avg );
		
		
		
		
		if(avg >= 35 ){
			
			result = "pass" ;
		}
		else{
			result = "fail" ;
		}
		
		System.out.println("Result is : "+ result );
		
		
		
	}
	
	public void displayResult(){
		
		System.out.println("Marks of first Subject " + this.m1 );
		System.out.println("Marks of Second Subject " + this.m2 );
		System.out.println("Marks of third Subject " + this.m2 );
		calculateResult(m1, m2, m3);
		
		
	}
	
}