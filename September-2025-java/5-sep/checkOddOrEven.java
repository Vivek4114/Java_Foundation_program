/* wap to declare a method which takes a number as input and return true if its is even otherwise return false if its not even*/

import java.util.Scanner;
 
  
class checkOddOrEven{ 
	public static boolean isEven(int num){
		
		 if(num%2==0){
			 return true;
		 }
		 else{
			  return false ;
		 }
		
	}
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		 
		boolean result = isEven(num);
		
		System.out.println(num + " is Even " +  result );
		
	}
	
}
