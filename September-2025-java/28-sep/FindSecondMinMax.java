import java.util.Scanner;

public class FindSecondMinMax{
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
        int secondMin = arr[1];
		
       
		
		for(int i = 1; i<arr.length; i++){
			if(min > arr[i]){
				secondMin = min;
				min = arr[i];
			}
		}
	
		System.out.println("\nOriginal Array Element is : ");
		for(int i : arr){
			System.out.print(i + " ");
		}
				
				System.out.println("\n Minimum Element is : " + min);
		System.out.println(" Second Minimum Element is : " + secondMin);
	}
	
	public static void findMax(int []arr){
		
		 int max = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2];
		
		for(int i = 1; i<arr.length; i++){
			if(max < arr[i]){
				secondMax = max;
				max = arr[i];
			}
		}
	
		 
		System.out.println("\n Maximum Element is : " + max);
		System.out.println(" Second Maximum Element is : " + secondMax);
	}
}
		
		
	
	
	
	 