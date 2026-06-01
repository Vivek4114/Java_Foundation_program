/*  
Q5. Find Kth Highest Product Price
The management team wants to know the 3rd most expensive product from the company’s 
sorted price list.
Write a Java program to find the kth largest price in the array.

Example:
Input:
productPrices = [120, 340, 375, 400, 425, 480, 520, 600]
k = 3

Output:
3rd highest price: 480 */

class FindKthLargestElement
{
	public static void main(String[] args) 
	{
		int productPrices[] = {120, ,900, 332,66,2,34,4,5,4,3,324,55,2234,340, 375, 400, 425, 480, 520, 600};
		int k = 3 ;
		
		for(int i = 0; i<productPrices.length; i++){
			int minIndex = i;
			
			for(int j = i + 1; j<productPrices.length; j++){
				if(productPrices[j] < productPrices[minIndex]){
					minIndex = j;
				}
 			}
			
			int temp = productPrices[minIndex];
			productPrices[minIndex] = productPrices[i];
			productPrices[i] = temp;
 		
		}
		
		
		for(int i = arr[productPrices.length - 1]; i >= 0; i--){
			if( ){
				
			}
		}
	}
}
