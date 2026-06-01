/*Banking System  Account Balance
In a banking system, each account has its own balance.
Should the balance variable be local, instance, or static? Why?
What would go wrong if you made it static?
*/

class BankingSystem{
	static String bankName = "Bank of Baroda";
		String nameOfCustomer ;
		int balance ;
	
	public static void main(String args[]){
	 Customer2();
	 Customer1();
	 
	}
	
	public static void Customer1(){
				BankingSystem b1 = new  BankingSystem();
				b1.nameOfCustomer = "Vivek Dhule";
				b1.balance = 10000;
				b1.balance += 2000;
						
			System.out.println("Bank Name " + bankName);
			System.out.println("Customer Name is : " + b1.nameOfCustomer);
		    System.out.println("balance of Customer1 " + b1.balance);
			System.out.println();

		
	}
	
	
	public static void Customer2(){
		 
		BankingSystem b2 = new  BankingSystem();
		b2.nameOfCustomer = "Jagdish Bodke";
		 
		b2.balance = 20000;
		b2.balance -= 500;
		
		System.out.println("Bank Name " + bankName);
		System.out.println("Customer Name is : " + b2.nameOfCustomer);
		System.out.println("balance of Customer2 " + b2.balance);
		System.out.println();
		
	}
	
	
}