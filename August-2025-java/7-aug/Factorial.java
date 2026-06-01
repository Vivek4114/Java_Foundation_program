class Factorial{
public static void main(String args[]){

	int fact = 1, sum=0;
	int n = 8;

	for(int i = 1; n>0; i++)

	{
		fact = fact * n;
		sum +=fact ;
		n--;

	}

	System.out.println("Factorial is " + fact );
	}
}

	