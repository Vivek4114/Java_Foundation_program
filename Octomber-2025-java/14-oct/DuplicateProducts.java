/*   Q1. Detect Duplicate Product IDs
The company occasionally receives duplicate product entries due to synchronization 
errors between branch servers.
Write a Java program to print all duplicate product IDs from a given product list.

Example:

Input:
productIDs = [101, 205, 101, 310, 101, 420, 605, 205, 518, 420]

Output:
Duplicate Product IDs: 101 205 420*/

class  DuplicateProducts
{
	public static void main(String[] args) 
	{
		 
		 int productIds[] = { 101, 205, 101, 310, 101, 420, 605, 205, 518, 420};
		 
		  
		 for(int i = 0; i<productIds.length; i++){
			 int count = 1; 
			 boolean isFound = false;
			 for(int j = 0;  j<productIds.length; j++){
				 
				 if(productIds[i] == productIds[j] && i < j){
					 count++;
				 }
				 
				 if(productIds[i] == productIds[j] && i > j){
					 isFound = true;
					 break;
				 }
			 }
			 if(!isFound && count > 1){
				 System.out.println(productIds[i]  );
			 }
		 }
	}
}