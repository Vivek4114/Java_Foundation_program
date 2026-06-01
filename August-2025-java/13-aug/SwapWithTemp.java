class SwapWithTemp{
	public static void main(String args[]){
		int a=10,b =20,c;
		System.out.println("Previous  A and B value is "+a + " " + b );
		c = a;
		a = b;
		b = c;
		System.out.println("After  A and B value is "+a + " " + b );
		
		
	}
}