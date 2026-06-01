public class FindPrimeNum{

	public static void main(String [] args){
		
		int arr[]  = { 3,46,22,4,7,9};

		findEle(arr);
	}

	public static void findEle(int arr[]){
	
	 
	for(int i = 0 ; i < arr.length - 1; i++){
		 int minValue = i;

		for(int j = i+1 ; j <arr.length; j++){
			if(arr[j] < arr[minValue]){
				minValue = j;
			}
		}
	
	int temp = arr[minValue];
	arr[minValue] = arr[i];
	arr[i] = temp;

	}
	
	
 
	 
	System.out.println("Arr Element After Sorting");
	for(int i =  0; i < arr.length; i++){
			
			 System.out.print(arr[i] + " ");

		}
		
		System.out.println();


 for(int i = 0; i < arr.length; i++){
	int count = 0;
	for(int j = 2; j <= arr[i]/2 ; j++){
 
		if(arr[i] % j == 0){
			count++;
			
		}
	}
	if(count == 0 )
	{
		System.out.print(arr[i]+ " ");
	}
		 
	}
}
}