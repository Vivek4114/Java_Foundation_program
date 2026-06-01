/*write a program to check if is number is even useing  predicate  */

import java.util.Scanner;
import java.util.function.Predicate;

class TestCodePredicate
{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
	
		Predicate<Integer> p = (n) -> n%2==0;
		
		 boolean res = p.test(num);
		 
		 if(res)
			 System.out.println(num +" is Even");
		 else
			 System.out.println(num + "is Odd");
		}
	}