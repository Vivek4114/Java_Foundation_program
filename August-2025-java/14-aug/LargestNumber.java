class LargestNumber{
	public static void main(String args[]){
		int n1=8,n2=8,n3=8;
		
		if(n1 > n2 && n1 > n3){
			System.out.println(n1 +" is greter");
		}
		else if(n2 > n3){
			System.out.println(n2 + " is Greater");
		}
		else if(n2 == n1 && n1 == n3 ){
			System.out.println(n1+" , "+ n2+" , " + n3 + " is Equal ");
		}
		else{
			System.out.println(n3 + " is Greater " );
		}
	}
}