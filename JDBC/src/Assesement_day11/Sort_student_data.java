package Assesement_day11;
import java.sql.*;

public class Sort_student_data {

	public static void main(String[] args) {
		try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

            // Create a SQL query to select students sorted by name
            String query = "SELECT * FROM students ORDER BY name";

            // Execute the query and retrieve results
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Process the results
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                // Print other student details as needed
            }

            // Close the database connection
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

