import java.sql.*;
class Java_Connectivity {
	public static void main(String[] args)throws ClassNotFoundException,Exception {
           Class cls= Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@localhost:1521:orcl",
									"system",
									"vivek");
           System.out.println("Connected Successfully!");
	}
}