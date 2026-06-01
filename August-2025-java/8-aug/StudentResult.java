import java.util.*;


class StudentResult{
public static void main(String args[]){



	 double averageMarks;
	String result;



	System.out.println("Enter your Average Marks : ");
	Scanner sc = new Scanner(System.in);
	
	
	averageMarks = sc.nextInt();


	 result = (averageMarks >= 75 ) ?  " Distinction" : (averageMarks >= 40 ) ? "Pass" : "Fail" ;

	 

	System.out.println("Result is  "+ result);

	}
}
