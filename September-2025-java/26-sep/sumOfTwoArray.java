import java.util.Scanner;
public class sumOfTwoArray{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	int arr[] = {2,7,-7,2,7,9,-2,11,15};
	System.out.println("Enter the Target Element");
	int target = sc.nextInt();
	
	int b[] = calculateSum(arr, target);
	
	for(int i = 0; i<b.length; i++){
		System.out.print(b[i]+" ");
	}
  
 }
 
 
 public static int[] calculateSum(int arr[], int target){
	 
	//int arr2[] = new int[20];
	int index = 0;
	
	for(int i = 0; i<arr.length; i++){
		
		for(int j = i + 1; j<arr.length; j++){
			
		 if((arr[i] + arr[j]) == target){
			 
			 return new int[] {i,j};			 
		  }		 
		 
		}
			
	}
	
	return new int[]{};
}

}