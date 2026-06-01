class CountDigit{
public static void main(String []args){

	int a = 4353454;
	int count = 0;

	while(a !=0){
	count++;
	a/=10;
	}

	System.out.println("Digit is " + count);
	}
}
