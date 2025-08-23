package Assesement_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class delete_student_record {

	public static void main(String[] args) {
		 // Database connection parameters
        String dbUrl = "jdbc:mysql://localhost:3306/mydb";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Create a Scanner object to get user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the student ID to delete: ");
            int studentId = scanner.nextInt();

            // Create a PreparedStatement object to delete a student record
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, studentId);

            // Execute the delete query
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student record deleted successfully.");
            } else {
                System.out.println("No student record found with the given ID.");
            }

            // Close the database connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database or executing query: " + e.getMessage());
        }

	}

}
