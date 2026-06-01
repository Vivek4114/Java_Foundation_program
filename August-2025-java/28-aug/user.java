import java.util.Scanner;

class Ola{
String name ;
int age ;

public void displayDetails(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter you name : ");
this.name = sc.nextLine(); 

System.out.println("Enter your age " );
this.age = sc.nextInt();


System.out.println("Ola customer name is : " + name );
System.out.println("Ola customer age is : " + age);
System.out.println();

}

}

public class user{

public static void main(String [] args){
	
Ola o1 = new Ola();
Ola o2 = new Ola();

o1.displayDetails();
o2.displayDetails();


}

}