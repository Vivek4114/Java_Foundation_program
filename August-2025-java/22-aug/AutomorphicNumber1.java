/*int n =25
int sq=n*n;//625
int t=n;
boolean f=true;
while(t!=0){
if(t%10!=sq%10){
System.out.println("Not aut");
f=false;
break;
}
t/=10;
}
if(f){*/

class AutomorphicNumber1{

	public static void main(String [] args){
		checkAutomorphic(25);
		
	}
	
	public static void checkAutomorphic(int number){
		int sq = number * number;
		int temp = number;
		boolean flag = true;
		
		while(temp !=0 ){
			if(temp%10 != sq%10){
				System.out.println("Not Automorphic ");
				flag = false;
				break;
			}
			
			temp /= 10;
			sq/=10;
			
			
		}
		
		if(flag == true){
			System.out.println("Automophic ");	
			
		}
	}

}