public class AsendingDesending{
	public static void main(String [] args){

	int arr[] = { 5,2,1,4,3 };

	for(int i = 0; i<arr.length; i++){

		for(int j = 0; j<arr.length-i-1; j++){
		
			if(arr[j] > arr[j+1]){
			
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	for(int i : arr){
		System.out.print(i + " ");
	}
	System.out.println();
	
	  int arr2[] = {  33,44,56,33,76, };

	
	 for(int i = 0; i<arr2.length - 1; i++){
		 
		 int minValue = i;
		 
		 for(int j = i+1; j < arr2.length; j++){
			 
			 if(arr[j] > arr[minValue]){
				 minValue = j;
			 }
		 }
		 
		 int temp = arr2[i];
		   arr2[i] = arr2[minValue];
		  arr2[minValue] = temp;
	 }
	 
	

	for(int i : arr2){
		System.out.print(i + " ");
	}


}
}