/*3. Recursive Sum Function
A recursive function sumOfN(n) calculates the sum of numbers from 1 to n.
If you mistakenly use a static variable sum inside the function, what will happen if you call sumOfN(5) and then sumOfN(3) afterward?
Why is a local variable the correct choice here?
*/

class RecursiveSum{
	
		  int sum = 0;
		  int i = 1;
	
	public static void main(String args[]){
		sumOfN(5);
		sumOfN(3);
	}
	
	
	public static void sumOfN(int n){
			 //   int sum = 0;
			 // int i = 1; 
			 
		RecursiveSum r1 = new RecursiveSum();	 

		while(r1.i<=n){
			r1.sum +=r1.i;	
			r1.i++;
	}
	
	System.out.println("Sum is  : " + r1.sum);
	
	
	}
}