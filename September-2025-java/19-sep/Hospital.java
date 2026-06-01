/*
Scenario 5:
Imagine you work at a hospital managing medical reports. Each report includes:
Patient name
Medical condition
Report date
Doctor’s notes

When a patient returns for a follow-up, you create a new report copying the
patient and condition details but changing the report date and doctor’s notes.

Your Task
Create a class called MedicalReport with the following fields:
String patientName
String condition
String reportDate
String doctorNotes

Write two constructors in the MedicalReport class:
A regular constructor to create a medical report.
A copy constructor that copies patient name and condition from another report
but allows new report date and doctor’s notes.

In your main method:

Create an original medical report.
Create a follow-up report using the copy constructor with new date and notes.
Print both reports to show that:
Patient and condition remain the same.
Date and notes are updated in the copied report.

Learning Goals
Understand how copy constructors support versioning and updates.
Practice duplicating objects with selective field changes.

Expected Output Example
Original Medical Report:  
Patient Name: Asish Kumar  
Condition: Flu  
Report Date: 2025-01-10  
Doctor Notes: Prescribed rest and fluids.  
------------------------------  
Follow-Up Medical Report (Copied):  
Patient Name: Asish Kumar  
Condition: Flu  
Report Date: 2025-01-19  
Doctor Notes: Symptoms improving, continue medication. 
*/ 

import java.util.Scanner;
	
class MedicalReport{
	String patientName;
	String condition;
	String reportDate;
	String doctorNotes;

	MedicalReport(String patientName ,String condition ,String reportDate ,String doctorNotes)
	{
		this.patientName = patientName ;
		this.condition = condition;
		this.reportDate = reportDate;
		this.doctorNotes = doctorNotes;
	}

	MedicalReport(MedicalReport m, String reportDate, String doctorNotes ){
		
		 this.patientName = m.patientName ;
		this.condition = m.condition;
		this.reportDate = reportDate;
		this.doctorNotes = doctorNotes;
	}

	public String displayMedicalReport(){
		return " Patient name : " + patientName +
		"\n Medical condition : " +condition +
		"\n Report date : " + reportDate +
		"\n Doctor’s notes : " + doctorNotes + "\n";
	}
}

public class Hospital{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patient Name : ");
		String patientName = sc.nextLine();
		System.out.println("Enter the Patient Condition : ");
		String condition = sc.nextLine();
		System.out.println("Enter the Patient Report Date : ");
		String reportDate = sc.nextLine();
		System.out.println("Enter the Doctor Notes : ");
		String doctorNotes = sc.nextLine();

		MedicalReport m1 = new MedicalReport(patientName, condition, reportDate, doctorNotes );
		System.out.println(m1.displayMedicalReport());
		
		System.out.println("Enter the Patient Report Date : ");
		String reportDate2 = sc.nextLine();
		System.out.println("Enter the Doctor Notes : ");
		String doctorNotes2 = sc.nextLine();

		MedicalReport m2 = new MedicalReport(m1, reportDate2, doctorNotes2);
		System.out.println(m2.displayMedicalReport());
	}
}