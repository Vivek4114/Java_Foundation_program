import java.util.Scanner;

public class DecendingBubleSort{
	public static void main(String [] args){
		System.out.println("Enter Array Element" );
		int arr[] =  new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++){
			 arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Before Sort " );
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		for(int i = 0; i<arr.length; i++){
			 
			 for(int j = 0; j<arr.length-i-1; j++){
				 
				 if(arr[j] < arr[j+1]){
					 int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					 
				 }				 
			 }			 
		}
		
		System.out.println("\nArray After Sort " );
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\n");
		
	}
}
