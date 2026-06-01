class SwapWithoutTemp{
	public static void main(String [] args){
		
		int n1=20, n2=30;
		System.out.println("Previous value of n1  is " + n1 + " n2 is " + n2 );
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("after value of n1 is " + n1 + " n2 is "+ n2 );
		
	}
	

}