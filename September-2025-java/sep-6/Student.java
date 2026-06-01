import java.util.Scanner;
class Student{

String firstName;
String lastName;
int age;
String gender;
String department;
long contactNo;
long emergencyContNo;
char section;
String std;
String address;

static Scanner sc = new Scanner(System.in);

	public String setDetails(){
		System.out.print("Enter the First Name : ");
		this.firstName = sc.nextLine();
		System.out.print("Enter the Last Name : ");
		this.lastName = sc.nextLine();
		System.out.print("Enter the Student age : ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Student Gender : ");
		this.gender = sc.nextLine();		
		System.out.print("Enter the Student Standard : ");
		this.std = sc.nextLine();
		System.out.print("Enter the Student Section : ");
		this.section = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Enter the Student Department : ");
		this.department = sc.nextLine();
		System.out.print("Enter the Contact Number  : ");
		this.contactNo = sc.nextLong();
		System.out.print("Enter the Emergency Contact Number : ");
		this.emergencyContNo = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the address of the Student : ");
		this.address = sc.nextLine();
		
		return firstName + " has done Registration";
	}
	
	
	public void checkDetails(){
		System.out.println("---Check Details---");
		
		System.out.println(printDetails());
		
		System.out.println("Enter the number which want to change " );
		System.out.println("1 - First Name \n2 - Last Name \n3 - Age \n4 - Gender \n5 - Standard \n6 - Section \n7 - Department \n8 - ContactNumber \n9 - Emergency Contact No \n10 - Address  ");
			int num = sc.nextInt();
			sc.nextLine();
		switch(num){
			case 1 : System.out.print("Enter the First Name : ");
			this.firstName = sc.nextLine();
			break;
		
		case 2 : System.out.print("Enter the Last Name : ");
		this.lastName = sc.nextLine();
		break;
		
		case 3 : System.out.print("Enter the Student age : ");
		this.age = sc.nextInt();
		break;
		
		case 4 : System.out.print("Enter the Student Gender : ");
		this.gender = sc.nextLine();
		break;
		
		case 5 : System.out.print("Enter the Student Standard : ");
		this.std = sc.nextLine();
		break;
		
		case 6 : System.out.print("Enter the Student Section : ");
		this.section = sc.next().charAt(0);
		break;
		
		case 7 : System.out.print("Enter the Student Department : ");
		this.department = sc.nextLine();
		break;
		
		case 8 : System.out.print("Enter the Contact Number  : ");
		this.contactNo = sc.nextLong();
		break;
		
		case 9 : System.out.print("Enter the Emergency Contact Number : ");
		this.emergencyContNo = sc.nextLong();
		break;
		
		case 10 : System.out.print("Enter the address of the Student : ");
		this.address = sc.nextLine();
		break;
		
		default : System.out.println("your Input is invalid");
		 
		}
			
			
			System.out.println(printDetails());
			
		
		
		
	}
		
		public String printDetails(){
			System.out.println("---Student Details---");
			return " student first Name : " + firstName 
				+ " \n student Last Name : " + lastName 
				+ " \n student age : " + age 
				+ " \n student Gender : " + gender 
				+ " \n student standard : " + std 
				+ " \n student section : " + section 
				+ " \n student Department : " + department 
				+ " \n student contact Number : " + contactNo 
				+ " \n student Emergency Contact NO. : " + emergencyContNo 
				+ " \n student Address :  " + address ; 
		}
}