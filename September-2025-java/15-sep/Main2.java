import java.util.Scanner;

 class Naukari
{
	
	String userName;
	Profile profile;
	
	Naukari(String userName, Profile profile){
		this.userName = userName;
		this.profile = profile;
	}
	
	public String displayDetails(){
		System.out.println("---------------------------------------");
		return " User Name : " + userName +
				"\n Candidate Name : " + profile.candidateName +
				"\n Email Id : " + profile.emailId +
				"\n Date Of Birth : " + profile.dob +
				"\n Mobile No : " + profile.mobileNo+
				"\n Qualification : " + profile.qualification +
				"\n Skill : " + profile.skill + 
				"\n Year of Experience :" + profile.yeo +
				"\n---------------------------------------" +
				"\n Address : \n Street Name : " + profile.address.streetName +
				"\n State : " + profile.address.state + 
				"\n Country : " + profile.address.country+
				"\n";
				
	}
	 
}

class Profile
{
	 
	String candidateName;
	long mobileNo;
	int yeo;
	String emailId;
	String dob;
	String qualification;
	String skill;
	Address address;
	 
	Profile(String candidateName, long mobileNo, int yeo, String emailId, String dob, String qualification, String skill, 
				Address address){
		
		this.candidateName = candidateName;
		this.mobileNo = mobileNo;
		this.yeo = yeo;
		this.emailId = emailId;
		this.dob = dob;
		this.qualification = qualification;
		this.skill = skill;
		this.address = address;
		
	}
		
	
}

class Address
{
String streetName;
String state;
String country;

 
 
Address(String streetName, String state, String country){
	this.streetName = streetName;
	this.state = state;
	this.country = country;
}

 
}

public class Main2
{
	
	public static void main(String [] args){
		
	  Scanner sc = new Scanner(System.in);
System.out.println("Enter how many object u want to create :");
int size=sc.nextInt();
sc.nextLine();
for( int i=1;i<=size;i++)
	{
	 
		System.out.println("Enter the User Name :");
		String userName = sc.nextLine();
	 
		System.out.println("Enter the Candiate Name " );
		String candidateName = sc.nextLine();
		
		System.out.println("Enter the Mobile No : ");
		long mobileNo = sc.nextLong();
		
		System.out.println("Enter the year of Experience : " );
		int yoe = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Email Id " );
		String emailId = sc.nextLine();
		
		System.out.println("Enter the Date Of Birth : " );
		String dob = sc.nextLine();
		
		System.out.println("Enter the Qualification :");
		String qualification = sc.nextLine();
		
		System.out.println("Enter the Skill Set " );
		String skill = sc.nextLine();
				 
	 	System.out.println("Enter the Streat Name : ");
		String streetName = sc.nextLine();
	
		System.out.println("Enter the State Name : " );
		String state = sc.nextLine();
	
		System.out.println("Enter the Country : ");
		String country = sc.nextLine();
		Address address1 = new Address( streetName, state,country);
		Profile profile1 = new Profile( candidateName,mobileNo,yoe, emailId, dob, qualification, skill ,address1);
	
		Naukari n1 = new Naukari(userName,profile1);
		System.out.println(n1.displayDetails());
	}
	
	
	 
	}
}
