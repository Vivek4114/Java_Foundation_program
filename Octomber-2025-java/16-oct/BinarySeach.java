// Program to demonstrate Binary Search Algorithm in an Array

public class BinarySeach{
	public static void main(String [] args){
		
		// Rule - 1 : -> we want the seach the Element useing binary search Tecnique then the array should be first  Sorted array 
		// Rule - 2 : -> if the target element is found in the mid array then no need to search again 
		// Rule - 3 : -> if the target element is less than the mid element then search the element in before mid.
		// Rule - 4 : -> if the element is geter than the mid element  of an array then the seach target element after of the mid.
		// it takes less time than binary search.
		
		
		int arr[] = {10, 20 ,30, 40, 50, 60,70,80,90,100};
		
			
			int start = 0;
			int end = arr.length-1 ;
			int target = 20;
			boolean isFound = false;
			int index = 0;
				while(start <= end){
					int  mid = (start  + end )/2;
					
					if(arr[mid] == target){
						isFound = true;
						index = mid;
						break;
					}
					else if(arr[mid] < target){			 
						start = mid + 1;				 
					}
					else  {					
						end = mid - 1;				 	 
					}
				}
				
				if(isFound){
					System.out.println( target + "  Element is Found : " + index );
				}
				else{
					System.out.println("Element is not found " );
				}
	}
}
					
					 
					
						
						 
						
						
				
			