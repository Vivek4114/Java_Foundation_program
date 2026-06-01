/*
Scenario 2:
Imagine you are building a simple banking system. A customer has a bank account
with the following details:

Account holder’s name
Account number
Branch code
Account balance

Now, the customer opens a new account in another branch but with the same account
holder name and balance, while the account number and branch code are different.

Your Task
Create a class called BankAccount with the following fields:
String holderName
String accountNumber
String branchCode
double balance

Write two constructors in the BankAccount class:
A regular constructor to create a new bank account.
A copy constructor that copies the holderName and balance from another
BankAccount object, but lets the user set a new accountNumber and branchCode.

In your main method:
Create an original bank account with any values you like.
Create a second bank account using the copy constructor, changing only the account number and branch code.

Print both accounts to show that:
The holder name and balance are the same
The account number and branch code are different

Learning Goals
Understand copy constructor use with partial field changes.
Learn how to safely duplicate objects while modifying selective fields.

Expected Output Example
Original Account:  
Holder Name: Asish Kumar  
Account Number: ACC123  
Branch Code: BR001  
Balance: Rs. 5000.0  
------------------------------  
New Account (Copied):  
Holder Name: Asish Kumar  
Account Number: ACC456  
Branch Code: BR002  
Balance: Rs. 5000.0  

*/

import java.util.Scanner;

class Account{
	String holderName;
	double accountNumber;
	String branchCode;
	double balance;

	Account(String holderName ,double accountNumber ,String branchCode ,double balance){
		if(!holderName.isEmpty() && !branchCode.isEmpty()){
			this.holderName = holderName;
			this.branchCode = branchCode;
		}
		else{
				System.out.println("Enter the Valid Account Holder Name and Branch Code ");
				System.exit(0);
		}
		
		if(accountNumber > 0 && balance > 0){
			
			this.accountNumber = accountNumber;
			this.balance = balance; 
		}
		else{
			System.out.println("Enter the Valid Account  Number and Balance  ");
			System.exit(0);
		}

	}

	Account(Account A ){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Account Number : ");
			double accountNumber = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Branch Code : ");
			String branchCode = sc.nextLine();
			
			this.holderName = A.holderName;
			this.accountNumber = accountNumber;
			this.branchCode = branchCode;
			this.balance = A.balance;
	}

	public String displayAccountDetails(){
		
		return " Account Holder Name : " + holderName +
		"\n Account Number : " + accountNumber +
		"\n Branch Code : " + branchCode + 
		"\n Balance : " + balance +"\n\n";
	}

}

public class Bank{
	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Account Holder Name : ");
		String accHolderName = sc.nextLine();
		
		System.out.println("Enter the Account  Account Number  : ");
		double accountNumber = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the  Branch Code : ");
		String branchCode = sc.nextLine();
		
		System.out.println("Enter the Account  Balance  : ");
		double balance = sc.nextDouble();
		
		
		
		Account a1 = new Account(accHolderName, accountNumber ,  branchCode,  balance );
		System.out.println(a1.displayAccountDetails());
		   
		Account a2 = new Account(a1);
		System.out.println(a2.displayAccountDetails());
	}
}
