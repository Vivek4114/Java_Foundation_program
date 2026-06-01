/*
You are given an array of integers and a number of steps. Implement a function to rotate the array to the right by the given number of steps.

Input: [1, 2, 3, 4, 5] 


steps = 2
Output:
[4, 5, 1, 2, 3]
*/

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int nums[] = {1, 2, 3, 4, 5, 4, 5, 7, 8, 9 }; 
		System.out.println("Enter Your Step to swap");
		int steps = sc.nextInt();
		
		
		int arr[] = new int[nums.length];
		int index=0;
		for(int i = nums.length - steps- 1 ; i<nums.length; i++){
			arr[index++] = nums[i];
		}
		
		for(int i = 0; i<nums.length - steps ; i++){
			arr[index++] = nums[i];
		}
		
		for(int i : arr){
			System.out.print(" " + i);
		}
		System.out.println();
	}
}
		
		
		
	
