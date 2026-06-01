/* Hierarchical Inheritance
Scenario-Based Question:
A hospital system needs to maintain information about different staff members.
All staff members share common details, but Doctor and Nurse have their own specializations.

Requirements:
Create one base class: Staff, and two subclasses: Doctor, Nurse.
The Staff class should contain:
Instance variables: staffId, name
Method: displayStaffDetails()

The Doctor class should:
Inherit from Staff
Contain: specialization
Method: displayDoctorDetails()  should print all details including inherited.

The Nurse class should:
Inherit from Staff
Contain: department
Method: displayNurseDetails()  should print all details including inherited.

In the Main class:
Create objects of Doctor and Nurse.
Call their respective display methods.

Test Case (Hardcoded):
Doctor:  
  ID: "D001", Name: "Dr. Smith", Specialization: "Cardiology"  
Nurse:  
  ID: "N001", Name: "Nina", Department: "ICU"  

Expected Output:
Doctor Specialization: Cardiology  
Doctor Name: Dr. Smith  
Doctor ID: D001  
Nurse Department: ICU  
Nurse Name: Nina  
Nurse ID: N001  

 */
class Staff
{
	String staffId;
	String name;
	
	Staff(String staffId, String name){
		this.staffId = staffId;
		this.name = name;
	}
	
	public void displayStaffDetails(){
		System.out.println(" Staff Id : " + staffId );
		System.out.println(" Name : " + name );
	}
	
}

class Doctor extends Staff
{
	String specialization;
	
	Doctor(String staffId, String name, String specialization ){
		super(staffId, name);
		this.specialization = specialization;
		
	}
	
	public void displayDoctorDetails(){
		System.out.println("Doctor Id : " + super.staffId );
		 System.out.println("Doctor Name : " + super.name );
		System.out.println("Doctor Specialization : " + specialization );
	}
		
	
}

class Nurse extends Staff
{
	String department;
	
	Nurse(String staffId, String name, String department){
		super(staffId, name);
		this.department = department;
	}
	
	public void displayNurseDetails(){
		 System.out.println(" Nurse Id : " + super.staffId );
		 System.out.println(" Nurse Name : " + super.name );
		System.out.println(" Nurse Department : " + department );
	}
}


public class  HospitalSystem
{
	public static void main(String[] args) 
	{
		Doctor doctor1 = new Doctor("D134", " Vavdhane ","X-RaY specialization " );
		Nurse nurse1 = new Nurse("N234", "Poonam", "BalChikista");
		doctor1.displayDoctorDetails();
		nurse1.displayNurseDetails();
		doctor1.displayStaffDetails();
		 
	}
}
