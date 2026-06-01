import java.util.*;

class GradeAssigner{
public static void main(String args[]){
	
	int marks;
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter your marks");
	 marks = sc.nextInt();
	 
	 if(marks >= 90 && marks <= 100){
		 System.out.println("Grade A");
	 }
	 else if( marks >= 70){
		 System.out.println("Grade B");
	 }
	 else if(marks >= 40){
		 System.out.println("Grade c");
	 }
	 else{
		 System.out.println("Fails");
	 }
}
}

	