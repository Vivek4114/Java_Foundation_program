interface Employee{

	void work();
	void leaves();
	void experience(int year);

}

class Developer implements Employee{

	@Override
	public void work(){
		System.out.println("Developer are the Develop the Application");
	}
	
	@Override
	public void leaves(){
		System.out.println("Developer Takes leaves for 2 day in a Week Based on company Requirement");
	}
	
	@Override
	
	public void experience(int year){
		System.out.println(year + " of Experience have the Developer");
	}
	
}

class Manager implements Employee{

	@Override
	public void work(){
		System.out.println("Manager are the manage the team member and assign to task to there team member  ");
	}
	
	@Override
	public void leaves(){
		System.out.println("Manager  Takes leaves for 1 day in a Week Based on company Requirement");
	}
	
	@Override
	
	public void experience(int year){
		System.out.println(year + " of Experience have the Manager");
	}
}

class Tester implements Employee{

	@Override
	public void work(){
		System.out.println("Tester  are the test the Application");
	}
	
	@Override
	public void leaves(){
		System.out.println("Tester Takes leaves for 3 day in a Week Based on company Requirement");
	}
	
	@Override
	
	public void experience(int year){
		System.out.println(year + " of Experience have the Tester");
	}
}

public class Company{
	public static void main(String []args){
		Developer developer = new Developer();
		developer.work();
		developer.leaves();
		developer.experience(5);
		
		Manager manager = new Manager();
		manager.work();
		manager.leaves();
		manager.experience(10);
		
		Tester tester = new Tester();
		tester.work();
		tester.leaves();
		tester.experience(10);
	
	
	}
}


