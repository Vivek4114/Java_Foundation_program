public class studentRegistration {

public static void main(String [] args){

Student s1 = new Student();
System.out.println(s1.setDetails());
Student s2 = new Student();
//System.out.println(s2.setDetails());

System.out.println(s1.printDetails());
//System.out.println(s2.printDetails());

System.out.println("--------------------------------------------");
s1.checkDetails();
System.out.println("--------------------------------------------");
//s2.checkDetails();

}

}