import java.util.*;

class ExamGradeChecker{
public static void main(String args[]){

int marks;
Scanner sc = new Scanner(System.in);

marks = sc.nextInt();

String Result = (marks >=50)? "Eligible for certificate" : "Better Luck Next Time";

System.out.println(Result);

}
}