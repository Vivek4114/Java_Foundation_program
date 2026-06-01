import java.util.Scanner;

public class FindMinMax{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Array Size : ");
	int size = sc.nextInt();
	
	if(size <=0){
	System.out.println("Provide Valid Value for the Array " );
	System.exit(0);
	}
	
	int arr[] = new int[size];
	System.out.println("Enter the Array Element : ");
	for(int i = 0; i<size; i++){
	arr[i] = sc.nextInt();
	}
	
	findMin(arr);
	findMax(arr);
	}
	
	public static void findMin(int []arr){
		
		int min = arr[0];
		for(int i = 1; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
	
		System.out.println("\nOriginal Array Element is : ");
		for(int i : arr){
			System.out.print(i + " ");
		}
		
		System.out.println("\nMinimum Element is : " + min);
	}
	
	public static void findMax(int []arr){
		
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
	
		System.out.println("\nOriginal Array Element is : ");
		for(int i : arr){
			System.out.print(i + " ");
		}
		
		System.out.println("\nMaximum Element is : " + max);
	}
}
		
		
	
	
	
	 