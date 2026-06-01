/*
MultiLevel Inheritance
Scenario:
A banking application tracks general account details. The BankAccount class stores basic
account data, SavingsAccount adds interest-related info, and FixedDepositAccount further
adds locking period info.

Requirements:
Create classes: BankAccount, SavingsAccount, FixedDepositAccount

Class: BankAccount
Variables: accountHolder, accountNumber
Method: displayBankAccountInfo()

Class: SavingsAccount (extends BankAccount)
Variables: balance, interestRate
Method: displaySavingsInfo() + call base method

Class: FixedDepositAccount (extends SavingsAccount)
Variables: depositAmount, lockPeriodInMonths

Method: displayFDInfo() to:
Display all info (own + inherited)
Call displaySavingsInfo() and displayBankAccountInfo()

Main class:
Create an object of FixedDepositAccount
Call displayFDInfo()

Test Case (Hardcoded):
Account Holder: "Emma"  
Account Number: "ACC9987"  
Balance: 100000  
Interest Rate: 6.5%  
Deposit Amount: 50000  
Lock Period: 12 months  

Expected Output:
Deposit Amount: 50000  
Lock Period: 12 months  
Balance: 100000  
Interest Rate: 6.5%  
Account Holder: Emma  
Account Number: ACC9987  
*/
import java.util.Scanner;
class BankAccount
{
	 String accountHolder;
	 int accountNumber;
	 BankAccount(String accountHolder, int accountNumber ){
		 this.accountHolder = accountHolder;
		 this.accountNumber = accountNumber;
	 }
	 
	public void displayBankAccountInfo(){
		System.out.println("Account Holder " + accountHolder );
		System.out.println("Account Number " + accountNumber );
	}
 
}

class SavingsAccount  extends BankAccount {
	
	double balance;
	double interestRate;
	SavingsAccount(String accountHolder, int accountNumber,double balance, double interestRate ){
		super(accountHolder, accountNumber);
		this.balance = balance;
		this.interestRate = interestRate;
	}
		
	public void  displaySavingsInfo(){
		
		System.out.println("Balance : " + balance );
		System.out.println("Interest Rate : " + interestRate + " %" );
		displayBankAccountInfo();
	}
 }

class FixedDepositAccount extends SavingsAccount
{
	double depositAmount;
	int lockPeriodInMonths;
	
	FixedDepositAccount(String accountHolder, int accountNumber,double balance, double interestRate, double depositAmount, int lockPeriodInMonths){
		super( accountHolder,  accountNumber,  balance,   interestRate );
		this.depositAmount = depositAmount;
		this.lockPeriodInMonths = lockPeriodInMonths;
	}
	
	public void displayFDInfo(){
		
		System.out.println(" Deposit Amount : " + depositAmount );
		System.out.println(" Lock Period In Months : " + lockPeriodInMonths + " ( months )");
		displaySavingsInfo();
		
	}
 }

public class BankingApplication{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name : ");
		String accountHolder = sc.nextLine();
		System.out.println("Enter the Account Number : ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter the Account Balance : ");
		double balance = sc.nextDouble();
		System.out.println("Enter the Account Rate of Interest : ");
		double interestRate = sc.nextDouble();
		
		System.out.println("Enter the Account Deposit Amount : ");
		double depositeAmount = sc.nextDouble();
		System.out.println("Enter the Account Lock Period of Time : ");
		int periodTime = sc.nextInt();
		
		sc.nextLine();
		
		FixedDepositAccount fixedDepositAccount1 = new FixedDepositAccount(accountHolder,accountNumber, balance, interestRate, depositeAmount, periodTime);
		fixedDepositAccount1.displayFDInfo();
 	}
	
}