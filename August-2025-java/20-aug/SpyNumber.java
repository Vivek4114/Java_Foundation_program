/*Q5. Spy Number Security
A security system accepts only special spy Codes where the sum of the digits equals
the product of the digits.
Write a program to check whether a number is a Spy Number.
Class Name: SpyNumber
Method Name: isSpyNumber(int number)
Return Type: void
Variable Suggestion: sum, product*/


class SpyNumber{
	public static void main(String args[]){
		isSpyNumber(1237);
	}
	public static void isSpyNumber(int Number){
		
	int rem = 0;
	int sum = 0;
	int mul = 1;
	
	while(Number !=0){
		rem = Number % 10;
		sum += rem;
		mul *= rem;
		Number /=10;
	}
	
	if(sum == mul ){
		System.out.println("Spy Number ");
	}
	else{
		System.out.println("Not a Spy Number");
	}
	}
}

		
