/* wap to declare a method which will take two integers as input and return the lasrgest among themif both integer are equal then return Equal Number */

import java.util.Scanner;
 
class FindLargest{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Value:");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Value:");
		int b = sc.nextInt(); 
		String result = checkValue(a,b);
		
		System.out.println(a+" and " + b + " is Largest is " + result );
		
	}
	
	public static String checkValue(int a, int b){
		
		if(a>b){ew
			return a + " is Largest" ;
		}
		else if(a == b ){
			return "both are equal" ;
		}
		else{
			return b +" is largest" ;
		}
		
	}
	
}
