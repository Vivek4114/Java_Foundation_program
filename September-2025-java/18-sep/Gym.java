/*
Q6). Create a class GymMember to model gym membership registration.
Requirements:
Declare private fields: name, planType, and discountCode.
Overload constructors:
- One with name only
- One with name and planType
- One with all three fields
Use encapsulation principles (getters/setters).

Define:
- calculateMembershipFee(): calculates fee based on plan type and applies discount
- getMemberDetails(): returns member data in formatted string

Write a test class to:
Instantiate members using different constructors
Print details and membership fees"
*/

import java.util.Scanner;

class GymMember{
	private String name;
	private String planType;
	private String discountCode;
	double fee;

	GymMember(){
		name = "N/A";
		planType = "N/A";
		discountCode = "N/A";
		fee = 0;
	}

	GymMember(String name){
		this.name = name;	 
	}
	
	GymMember(String name, String planType ){
		this.name = name;
		this.planType = planType;
	}

	GymMember(String name, String planType, String discountCode){
		this.name = name;
		this.planType = planType;
		this.discountCode = discountCode;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPlanType(String planType){
		this.planType = planType;
	}


	public void setDiscountCode(String discountCode){
		this.discountCode = discountCode;
	}

	public String getName(){
		return name;
	}
	
	public String getPlanType(){
		return planType;
	}

	public String getDiscountCode(){
		return discountCode;
	}

	
	public void calculateMembershipFee(){
		if(planType==null){
			fee = 1000;
		}
		else if(planType.equals("High")){
			fee = 5000;
		}
		else if(planType.equals("Medium"))
		{
			fee = 3000;
		}else {
			fee=500;
		}
		
		
	}

	public String getMemberDetails(){
	return " Name : "+name +
		"\n Plan Type : "+ planType + 
		"\n Discount Code : "+discountCode +
		"\n Fee : "+ fee +"\n\n" ;
	}

	
}


public class Gym{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		  String name  = sc.nextLine();
		if(name.isEmpty() || name.equals(" ")){
			System.out.println("Enter the Valid Name");
			System.exit(9);
		}
		
		System.out.println("Enter the PlanType (High Medium or Any) ");
		  String planType = sc.nextLine();
		if(planType.isEmpty() || planType.equals(" ")){
			System.out.println("Enter the Valid Name");
			System.exit(0);
		}

		System.out.println("Enter the Discount Code");
		 String discountCode = sc.nextLine();
		if(discountCode.isEmpty() || discountCode.equals(" ")){
			System.out.println("Enter the Valid Code");
			System.exit(0);
		}

		GymMember g1 = new GymMember();
		GymMember g2 = new GymMember(name);
		GymMember g3 = new GymMember(name, planType );
		GymMember g4 = new GymMember(name, planType, discountCode);
		
		g1.calculateMembershipFee();
		g2.calculateMembershipFee();
		g3.calculateMembershipFee();
		g4.calculateMembershipFee();

		System.out.println(g1.getMemberDetails());
		System.out.println(g2.getMemberDetails());
		System.out.println(g3.getMemberDetails());
		System.out.println(g4.getMemberDetails());
		
	
	}
}