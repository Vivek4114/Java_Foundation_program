class PerfectNumber{
	public static void main(String [] args){
	
		int num = 27;
		int temp = num;
		
		int sum = 0;
		System.out.println("Factor");
		for(int i = 1; i<=num/2; i++){
			
			if(num % i == 0){
				System.out.print(i + " " );
				sum += i;
				}
			}
			System.out.println("\n\n");
			
			if(temp == sum){
				System.out.println("  Perfect Number Is : " + temp  );
				}
				else{
				System.out.println("not perfect Number ");
				}
			}
		}
			
				
		