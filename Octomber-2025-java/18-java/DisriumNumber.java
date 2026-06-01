class DisriumNumber{
	public static void main(String [] args){
		
		int num = 135;
		
		int temp = num;
		
		int rev = 0;
		while(temp != 0){
			int rem = temp%10;
			
			rev = rev* 10 + rem;
			temp/=10;
		}
		
		System.out.println("Reverse : " + rev);
		int sum = 0;
		int count = 0;
		while(rev != 0){
			count++;
			
			int rem = rev%10;
			int pow = 1;
			
			for(int i = 0; i<count; i++){
				System.out.println("Count : " + count);
				pow*=rem; 
			}
			sum += pow ;
			rev/=10;
			
		}
		System.out.println("Sum : " + sum);
		System.out.println("num : " + num);
		
		if(sum == num){
			System.out.println("Disarium Number ");
		}
		else{
			System.out.println("Not a disarium Number ");
		}
		
	}
}
			
			
			
			
			
			
	