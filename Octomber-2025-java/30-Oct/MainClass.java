abstract class DatabaseConnection 
{
	public void connect(){
		
		System.out.println("Connect method from database connection");
	}
}

class SecondSubClass extends DatabaseConnection
{
	
}

public class MainClass
{
	public static void main(String [] args){
		
		
		DatabaseConnection s = new DatabaseConnection();
		s.connect();
	}
}
 