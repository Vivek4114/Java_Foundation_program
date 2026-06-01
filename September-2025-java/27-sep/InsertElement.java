// write to create an array and  insert Element in an array dynamically.
// write a program to find the minimun element present in the array.
// write a program to print the maximum element present in the array.
// Write a progam to calculate sum of array Elements and find average of array Elements;
		// NOTE : fetch the elements of the array useing for each loop only.
		

import java.util.Scanner;

public class InsertElement{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the element in the position");
		 int size = sc.nextInt();
		 
		 int arr[] = new int[size];
		 System.out.println("Enter the Array element ");
		 for(int i = 0; i<size; i++){
			 arr[i] = sc.nextInt();
		 }
		 
		 System.out.println("Array  Element Stored : ");
		 
		 for(int x : arr ){
			 System.out.print(x + " ");
		 }
		 
		
	}
}
	


