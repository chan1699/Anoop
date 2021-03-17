import java.sql.*;
public class JdbcSample {

	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/coffee_store";
	    String user="Anoop";
	    String pass="Anoop@123";
		Connection myConn=DriverManager.getConnection(dbUrl,user,pass);
		System.out.println("Connection Established!");
		Statement myStmt=myConn.createStatement();
		ResultSet myRs=myStmt.executeQuery("select * from customers");
		while(myRs.next()) {
			System.out.println(myRs.getString("first_name"));
		}
		System.out.println("Query Executed");
	
	}

}
