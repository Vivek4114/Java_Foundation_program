import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;



class ExecuteQuery
	{
	public static void main(String[] args) throws  ClassNotFoundException, SQLException
	{
		 // Loding Driver
		 Class cls = Class.forName("oracle.jdbc.driver.OracleDriver");
		 System.out.println("Loading Class");
		 
		  // Establish the Connection 
		  
		  
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
																				"c##vivek",
																				"vivek");
		 System.out.println("Connected to Dateabse");
		 
		
		 // Create a Statment
		 Statement stmt = con.createStatement();
		 System.out.println("Statement is Created");
		 
		 
		 

		 
		 stmt.execute("""
			CREATE TABLE course20(
				course_id Number(4) Primary key,
				course_name varchar2(30) unique not Null,
				fee float
			) """ 
			);
			
			
			stmt.execute("""
			CREATE TABLE student20(
					 sid Number(4) primary key,
					sname varchar2(30) not null,
					course_id Number(4) REFERENCES course20(course_id)

					
			) """ 
			);
		
		con.close();
		stmt.close();
		System.out.println("End of the Program");
				
				
		 
		 
	
	}
}
