import java.util.Scanner;

class CheckPerfect{
	
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your Number : " );
	int n = sc.nextInt();
	 
	 checkPerfectNum c1 = new checkPerfectNum();
	 c1.checkNum(n);
		
	
	
	
	
	}
}

class checkPerfectNum
{
	
	public void checkNum(int n){
		for(int j = 1; j<=n; j++){
	 
		int sum = 0;
	int isFact = 0;
	for(int i = 1; i<=j/2; i++){
		
		if(j%i==0){
			 sum += i;
		}
		
	}
 
	if(sum ==  j){
		
		 System.out.println(j);
	}
	 
	}
		
	}
}
	