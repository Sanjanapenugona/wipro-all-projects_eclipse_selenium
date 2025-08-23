package Assesement_day11;
import java.sql.*;
public class handle_expections {

	public static void main(String[] args) {
		   try {
	            // Load the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish a connection to the database
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

	            // Create a Statement object
	            Statement stmt = conn.createStatement();

	            try {
	                // Execute a query to retrieve a student record
	                ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id = 143");

	                // Process the result set
	                if (rs.next()) {
	                    System.out.println("Student ID: " + rs.getInt("id"));
	                    System.out.println("Student Name: " + rs.getString("name"));
	                } else {
	                    System.out.println("No student record found with the given ID.");
	                }
	            } catch (SQLException e) {
	                System.out.println("Error executing query: " + e.getMessage());
	            } finally {
	                try {
	                    // Close the Statement object
	                    stmt.close();
	                } catch (SQLException e) {
	                    System.out.println("Error closing Statement object: " + e.getMessage());
	                }
	            }
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC driver not found.");
	        } catch (SQLException e) {
	            System.out.println("Error connecting to the database: " + e.getMessage());
	        }

	}

}
