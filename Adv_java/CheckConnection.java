import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CheckConnection{
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		
		System.out.println("loading The Connection ");
		Class cls = Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Establishing The Connection 
		
		System.out.println("Establishing the Connection ");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek","vivek");
		
		//Create Statement 
		
			Statement stmt = conn.createStatement();
			
			stmt.execute("""
			
				CREATE TABLE abc3(
					a Number(2),
					b varchar2(10),
					c int
				)
				"""
				);
				
			
		//insert into value
		
			stmt.execute("""
			
				INSERT INTO abc3 VALUES(20,'A', 1)
				"""
				);
				
		//CLOSING THE CONNECTION 
		conn.close();
		stmt.close();
		System.out.println("Connection Close");
		
	}
	
}