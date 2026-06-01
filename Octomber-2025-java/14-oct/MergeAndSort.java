/*  Q4. Merge Sorted Product Price Lists
The finance department receives two sorted arrays representing product prices from 
two regional branches.
Write a Java program to merge both lists into a single sorted array.
Example:

Input:
pricesBranchA = [120, 250, 375]
pricesBranchB = [200, 340, 400]

Output:
Merged Sorted Prices: [120, 200, 250, 340, 375, 400]
*/
 
class MergeAndSort 
{
	public static void main(String[] args) 
	{
		int pricesBranchA[] = {120, 250, 375};
		int pricesBranchB[] = {200, 340, 400};
		int branchC[] = new int[pricesBranchA.length + pricesBranchB.length];
		
		for(int i = 0; i<branchC.length; i++){
			if(i < pricesBranchA.length){
				branchC[i] = pricesBranchA[i];
			}
			else{
				branchC[i] = pricesBranchB[i-pricesBranchA.length];
			}
			
		}
		System.out.println("Merge Array Before Sorting " );
		for(int i : branchC){
			System.out.print(i + " ");
		}
		
		for(int i = 0; i<branchC.length; i++){
			int minIndex = i;
			
			for(int j = i + 1; j<branchC.length; j++){
				if(branchC[j] < branchC[minIndex]){
					minIndex = j;
				}
 			}
			
			int temp = branchC[minIndex];
			branchC[minIndex] = branchC[i];
			branchC[i] = temp;
 		
		}
		
		System.out.println("\n\nMerge  Array After Sorting " );
		for(int i : branchC){
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		 
	}
}
