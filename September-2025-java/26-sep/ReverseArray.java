import java.util.Scanner;

public class ReverseArray{

	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Size of Array : ");
	int n = sc.nextInt();
	
	if(n <=0){
		System.out.println("Array Size can not be negative ");
		System.exit(0);
	}
	 int arr[] = new int[n];
	 
	for(int i = 0; i< arr.length; i++){
		arr[i] = sc.nextInt();
	}

		revArr(arr);
	}

	public static void revArr(int arr[]){
		int n = arr.length;
		int arr2[] = new int[n];
		
		int index = 0;
		for(int i = n -1; i >=0; i--){
			
			arr2[index++] = arr[i];

		}
		System.out.println("\nArray After Reversing \n");
		for(int i =  0; i < arr2.length; i++){
			
			 System.out.print(arr2[i] + " ");

		}
		
		
	

	}
}