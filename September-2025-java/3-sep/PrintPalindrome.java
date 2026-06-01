import java.util.Scanner;

class PrintPalindrome{

	public static void main(String [] args){

	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number : ");
	
	n = sc.nextInt();
	
	printNumber p1 = new printNumber();
	
	p1.check(n);
	 
	
	
	 
}
}


class printNumber
{
	
	public void check(int n){
		
		for(int i = 1; i<=n; i++){
		int temp = i;
		int rev = 0;
	
		while(temp !=0){
			int rem = temp%10;
		   rev =  rev * 10 + rem;
			temp/=10;
		}
		 
		if(i == rev){
			System.out.println(i);
		}
		
	}
		
	}
	
}