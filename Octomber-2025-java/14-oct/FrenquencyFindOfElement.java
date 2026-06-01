/* Q3. Find Frequency of Product Sales

To determine the popularity of products, the marketing team wants to know how many times
each product was sold.
Write a Java program to display the frequency of each product ID in the sales list.

Example:
Input:
salesData = [101, 102, 101, 103, 104, 102, 101, 104, 104]

Output:
101 - >  3 times
102 - >  2 times
103 - >  1 time
104 - >  3 times
*/
class FrenquencyFindOfElement
{
	public static void main(String[] args) 
	{
		 
		 int productIds[] = { 101, 102, 101, 103, 104, 102, 101, 104, 104};
		 
		  
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
			 if(!isFound && count >= 1 ){
				 System.out.println(productIds[i] + " --> " + count + " Times ");
			 }
		 }
	}
}
