import java.util.Scanner;

public class Strong{
	
	
	public static void main(String [] args){
		Check_Strong c1 = new Check_Strong();
		
		c1.check_number();
		
		
		
	}
	
}

class Check_Strong{
	
	public void check_number(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num = sc.nextInt();//145
		
		int temp = num;
		
		int sum = 0;
			
		while(temp!=0){
		int rem = temp%10;//5
		int f = 1;
			while( rem!=0 ){
				f =  f * rem;
				rem--;
			 }
			
			sum += f;
			temp /= 10;
			
			
		}
		
		if(sum == num){
			
			System.out.println(num + " is a Strong Number " );
		}
		else{
			System.out.println(num + " is a not a Strong Number ");
		}
		
		
		
		 
		
		
		
	}
		
	
}