public class BankApplication{

	public static void main(String [] args){
		withdraw(2342234292834L);
		withdraw("Vivek");
		withdraw("Vivek", 3974294429L);
		

	}

	public static void withdraw(long cardNo){
		System.out.println("card No is :" + cardNo);
		System.out.println("called the method with card NO");
	}
	public static void withdraw(String userName){
			System.out.println("User Name : "+ userName);
		
			System.out.println("called the method with user name");
	}
	public static void withdraw(String userName, long adharNo){
			System.out.println("User Name : " + userName + " Adhar No is : " + adharNo);
		
			System.out.println("called the method with  user name and adhar No");
	}
}