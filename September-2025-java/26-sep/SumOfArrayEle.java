import java.util.Scanner;
public class SumOfArrayEle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Size of Array ");
		int n = sc.nextInt();
		
		if(n <= 0){
			System.out.println("Error.. Array Size Cann Not be negative or Zero");
			System.exit(0);
		}
		
		int arr[] = new int[n];
		 
		for(int i = 0; i< arr.length; i++){
			 arr[i] = sc.nextInt() ;
		}
		
	 
		calSum(arr);
		
	}
	
	public static void calSum(int arr[])
	{
		int sum = 0;
		for(int i = 0; i< arr.length; i++){
			sum+=arr[i];
		}
		
		System.out.println("Sum of All Array Element is " + sum );
	}
}