import java.util.Scanner;

class user{
	
	public static void main(String [] args){
		LinkedIn l1 = new LinkedIn();
		LinkedIn l2 = new LinkedIn();

		Profile profile1 = new Profile(); 		
		Address address1 = new Address();
		LinkedIn.createProfile(profile1, address1);
		System.out.println(LinkedIn.viewProfile(profile1));
		
		Profile profile2 = new Profile();
		Address address2 = new Address(); 
		LinkedIn.createProfile(profile2, address2); 
		System.out.println(LinkedIn.viewProfile(profile2));
		
		l1.follow(profile1, profile2);
		l2.follow(profile2, profile1); 
	}	 
}

class LinkedIn
{
	static Scanner sc = new Scanner(System.in);
	
	public static void createProfile(Profile p, Address a){
		System.out.println("--------------Enter the Student Details-----------");
		p.address = a;
		System.out.println("Enter the Name :");
		p.name = sc.nextLine();
		System.out.println("Enter Designation :");
		p.designation = sc.nextLine();
		
		System.out.println("Enter  Streat:");
		p.address.streat = sc.nextLine();
		
		System.out.println("Enter State:");
		p.address.state = sc.nextLine();
		
		System.out.println("Enter the  Country :");
		p.address.country = sc.nextLine();
		
		System.out.println("Enter the  webling :");
		p.weblink = sc.nextLine();
		
		System.out.println("Enter the University :");
		p.university = sc.nextLine();
	}
	
	public   void follow(Profile p1, Profile p2){
		System.out.println(p1.name + " follows the " + p2.name );
		p2.connection++;
		System.out.println("Connection is : " + p2.connection);
	 }
	
	public void connections(Profile p1, Profile p2){ 
		System.out.println(p1.name + " follows the " + p2.name ); 
	}
	
	
	public static String viewProfile(Profile p){
		System.out.println("---------Student DEtails is -----------");
		return " name :" + p.name + 
			"\n Designation :" + p.designation + 
			"\n Streat :" + p.address.streat + 
			"\n State :" + p.address.state + 
			"\n Country :" + p.address.country + 
			"\n weblink :" + p.weblink + 
			"\n Connnection :" + p.connection + 
			"\n University :" + p.university; 
		}

	}

class Profile
{
	public String name;
	public String designation;
	public Address address;
	public String weblink;
	public int connection;
	public String university; 
}

class Address
{ 
	public String streat;
	public String state;
	public String country;
}