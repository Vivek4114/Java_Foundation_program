
public class SelctionSort{
	public static void main(String [] args){
		int arr[] = {2,3,9,1,8};
		System.out.println("array Before Sorted : ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" "); 
		}
		 
		
		for(int i = 0; i<arr.length-1; i++){
			int minValue = i;
			for(int j=i+1; j<arr.length; j++){
	
				if(arr[j] < arr[minValue]){
					minValue = j;
				}
			}

			int temp = arr[minValue];
			arr[minValue] = arr[i];
			arr[i] = temp;
		
		}

		System.out.println("\narray After Sorted : ");
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+" "); 
		}
		System.out.println();

}
}