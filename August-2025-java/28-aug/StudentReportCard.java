import java.util.Scanner;

class StudentReportCard{

    String name;
    int marks;
   static int count = 0;

public static void main(String args[]){
StudentReportCard s1 = new StudentReportCard();
StudentReportCard s2 = new StudentReportCard();
StudentReportCard s3 = new StudentReportCard();

s1.setInput();
 s2.setInput();
 s3.setInput();

s1.displayDetail();
s2.displayDetail();
s3.displayDetail();


}

public void setInput(){
   StudentReportCard.count++;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student"+ StudentReportCard.count + "  Name : " );
String name = sc.nextLine();

this.name = name;

System.out.print("Enter Student"+ StudentReportCard.count + "  Marks : " );
int marks = sc.nextInt();
this.marks = marks;


}

public void displayDetail(){
System.out.println("Name : "+ this.name + " | Marks : " + this.marks);

}
}