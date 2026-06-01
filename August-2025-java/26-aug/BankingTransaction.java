import java.util.Scanner;

class BankingTransaction{

	String accHolderName ;
	double balance;
	double depositeAmount;
	double widrawAmount;
	
	
	public static void main(String Args[]){
		
		Scanner Sc = new Scanner(System.in);
		
		BankingTransaction B1= new BankingTransaction();
		System.out.println("Enter the Acount Holder Name : ");
		String accHolderName = Sc.nextLine();
		B1.accHolderName = accHolderName;
		
		System.out.println("Enter the Balance of Account Holder : ");
		double balance = Sc.nextDouble();		
		B1.balance = balance;
		
		System.out.println("Enter the Deposte Amount of  Account Holder : ");
		double depositeAmount = Sc.nextDouble();
		B1.depositeAmount = depositeAmount;
		
		System.out.println("Enter the Widraw Amount of  Account Holder : ");
		double widrawAmount = Sc.nextDouble();
		B1.widrawAmount = widrawAmount;
		
		 
		
		B1.deposite(accHolderName, depositeAmount );
		B1.withdraw(accHolderName,  widrawAmount);
		B1.displayBalance(accHolderName,balance,  depositeAmount ,widrawAmount);
			
		
		
		
	}
	
	public void deposite(String accHolderName, double depositeAmount ) {
		 
		  this.accHolderName = accHolderName ;
		   this.depositeAmount = depositeAmount ;
		 
		 
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println(" Acount Holder Name " +  accHolderName);
		
		this.balance =  this.balance +  this.depositeAmount;
		
		System.out.println("Balance is : " +  this.balance);		
		System.out.println("Deposte Amount : " +   depositeAmount);
		System.out.println("-------------------------------------");
		System.out.println();
		
		
		
		
		
	}
	
	public void withdraw ( String accHolderName,  double widrawAmount){
		
		this.accHolderName=	accHolderName; 
		this.widrawAmount = widrawAmount ;
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println(" Acount Holder Name " +   accHolderName);
		
		this.balance =  this.balance -  this.widrawAmount;
		 
		System.out.println("Balance is : " +  this.balance);		 
		System.out.println("Widraw Amount : " +   widrawAmount);
		System.out.println("-------------------------------------");
		System.out.println();
	}
	
	
	public void displayBalance(String accHolderName, double balance, double depositeAmount, double widrawAmount){
		 accHolderName = this.accHolderName;
			widrawAmount = this.widrawAmount;
			 depositeAmount = this.depositeAmount;
			balance = this.balance;
			
		
		System.out.println("-------------------------------------");
		System.out.println(" Acount Holder Name " +   accHolderName);		
		System.out.println("Balance is : " +  balance);
		
		System.out.println("Deposte Amount : " +   depositeAmount);
		System.out.println("Widraw Amount " +  widrawAmount);
		System.out.println("--------------------------------------");
				
		
	}
}