class FindLargest{
public static void main(String[] args){

	int a = 170, b = 540, c = 234;

	if(a>b && a>c){
		System.out.println(a + " is Bigger than " + b + " and " + c);

	}

	else if( b > c ){

		System.out.println(b + " is Bigger than " + a + " and " + c); 

	}

	else {

		System.out.println(c + " is Bigger than " + a + " and " + b);

	}
}
} 
