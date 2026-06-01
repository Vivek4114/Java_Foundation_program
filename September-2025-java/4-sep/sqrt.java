import java.util.Scanner;

class sqrt{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : " );
		int num = sc.nextInt();
		calculateSqure(num);
		
		
	}
	
	
	public static void calculateSqure(int num){
		
		 
		 int sqrt = 0;
		 
		 for(int i = 1; i<=num/2;  i++){
			 
			 if(i*i == num){
				 sqrt = i;
				 break;
			 }
			 
		 }
		 
		 System.out.println("Square root : " + sqrt);
		 
		
		
		
		
	}
	
}