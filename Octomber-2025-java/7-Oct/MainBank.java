
public class MainBank{
	public static void main(String args[]){
		Address a1 = new Address("Ameerpeth", "telangana", "India");
		Customer c1 = new Customer("Vivek", a1);
		BankAccount b1 = new BankAccount(2344, 2933, c1);
		 System.out.println(b1.displayBankDetails());
		
	}
}

class BankAccount
{
	long accNo;
	double balance;
	Customer customer;
	
	BankAccount(long accNo, double balance, Customer customer){
		this.accNo = accNo;
		this.balance = balance;
		this.customer = customer;
	}
	
	public String displayBankDetails(){
		return "Account No : " + this.accNo + 
				"\n Balance : " + this.balance + 
				"\n --------Customer Detials ----" + 
				"\n Name : " + this.customer.getName()+
				"\n----------- Address : --------\n" + customer.address.displayAddressDetails();

}
}

class Customer
{
	String name;
	Address address;
	public Customer(String name, Address address){
		this.name = name;
		this.address = address;
		
	}
	
	public String getName(){
		return name;
	}
	
}

class Address
{
	String cityName;
	String stateName;
	String countryName;
	
	Address(String cityName, String stateName, String countryName){
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	public String displayAddressDetails(){
		return "City Name : "+this.cityName +
				"\n State Name : " + this.stateName + 
				"\n Country Name : " + this.countryName;
	}
}