package Assesement_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect_mySQL_database {

	public static void main(String[] args) {
		  String dbUrl = "jdbc:mysql://localhost:3306/mydb";
	        String dbUser = "root";
	        String dbPassword = "root";

	        try {
	         
	            Class.forName("com.mysql.cj.jdbc.Driver");

	          
	            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

	         
	            Statement stmt = conn.createStatement();

	           
	            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

	          
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " " + rs.getString(2));
	            }

	         
	            conn.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC driver not found.");
	        } catch (SQLException e) {
	            System.out.println("Error connecting to the database or executing query: " + e.getMessage());
	        }

	}

}
