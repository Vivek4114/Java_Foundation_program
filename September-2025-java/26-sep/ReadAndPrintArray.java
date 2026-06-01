import java.util.Scanner;

class ReadAndPrintArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size");		
		int n = sc.nextInt(); 
		
		if(n <=0){
			System.out.println("Array Size is not negative : ");
			System.exit(0);
		}
		
		int arr[] = new int[n];
		 
		for(int i = 0; i<n; i++){
			 arr[i] = sc.nextInt();
		} 
		
		usingForLoop(arr);
		useingForEachLoop(arr);
		//usingArraysToString(arr1);
		
	}
	
	public static void usingForLoop(int arr[]){
		System.out.println("Array Print  Simple For Loop");
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void useingForEachLoop(int arr[]){
		 System.out.println("\nArray Print Useing For Each Loop");
		 for(int x : arr){
			System.out.print(x + " ");
			
		}
		
	}
	
	/*
	public static void usingArraysToString(int arr[]) {
		System.out.println("Array Print int Array To String method");
		int t= arr.toString();
		
		for(int i = 0; i<t.length; i++){
			System.out.print(t[i]+ " ");
		}
		
		
	}
	*/
	
	
}
