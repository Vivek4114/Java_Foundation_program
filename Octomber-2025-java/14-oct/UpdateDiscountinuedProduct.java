
/* Q2. Update Discontinued Product Codes
When a product is discontinued and reintroduced under a new code, you need to update 
all its occurrences in the system.
Write a Java method named modifyArrayElement that replaces every occurrence of oldProductCode with newProductCode.

Example:
Input:
productCodes = [501, 502, 503, 504, 505, 502, 503]
oldProductCode = 503
newProductCode = 999

Output:
Updated Product Codes: [501, 502, 999, 504, 505, 502, 999] */

class  UpdateDiscountinuedProduct
{
	public static void main(String[] args) 
	{
		int productCodes[] = {501, 502, 503, 504, 505, 502, 503};
		int oldProductCode = 502;
		int newProductCode = 999;
		
		boolean isFind = false;
		int index = 0;
		for(int i = 0; i<productCodes.length; i++){
			if(productCodes[i] == oldProductCode){
				isFind = true;
				productCodes[i] = newProductCode;
			 
				
			}
		}
		
		if(isFind){
			 
			System.out.println("SEE All ARRAY : \n");
			for(int i : productCodes){
				System.out.print(i + " ");
				
			}
			System.out.println();
		}else{
			System.out.println("Element not Found " );
			
		}
		
		

	}
}
