import java.util.*;


class VotingEligibility{
public static void main(String args[]){

	int age;
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();


	String Eligibility = (age >= 18 ) ? "Eligible to Vote" : "Not Eligible";

	System.out.println(Eligibility);
	}
}
