abstract class Person{

	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public abstract void getRole();
	public abstract void performDuties();
	
	public void displayDetails(){
		System.out.println("Person Name : " + name );
		System.out.println("Person Age : " + age  );
	}
}


class Teacher extends Person{

	Teacher(String name, int age){
		 super(name, age);
	}
	
	@Override 
	public void getRole(){
		System.out.println(" Teacher Role is Teacher");
	}
	
	@Override
	public void performDuties(){
		System.out.println("Teaching students and preparing lessons");
	}
}
class Student extends Person{

	Student(String name, int age){
		 super(name, age);
	}
	
	@Override 
	public void getRole(){
		System.out.println(" Student");
	}
	
	@Override
	public void performDuties(){
		System.out.println("Attending classes and completing assignments");
	}
}
	


class Principal extends Person{

	Principal(String name, int age){
		 super(name, age);
	}
	
	@Override 
	public void getRole(){
		System.out.println(" Principal");
	}
	
	@Override
	public void performDuties(){
		System.out.println("Managing school operations and supervising staff");
	}
}
	
	
class School{

	public static void main(String[] args){
	
		Person p[] = new Person[3];
		
		p[0] = new Student("Vivek", 21);
		p[1] = new Teacher("Santosh", 42);
		p[2] = new Principal("Kadam Sir", 56);
		
		for(int i = 0; i< p.length; i++){
		
			p[i].displayDetails();
			p[i].getRole();
			p[i].performDuties();
		}
	}
}
		
	  


	