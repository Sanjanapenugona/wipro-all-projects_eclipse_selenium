package Assesement_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class student_update {

	public static void main(String[] args) {
		  String dbUrl = "jdbc:mysql://localhost:3306/mydb";
	        String username = "root";
	        String password = "root"; 

	        try (Connection conn = DriverManager.getConnection(dbUrl, username, password)) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Enter student ID: ");
	            int studentId = scanner.nextInt();
	            scanner.nextLine();
	            System.out.print("Enter new name: ");
	            String newName = scanner.nextLine();
	            System.out.print("Enter new age: ");
	            int newAge = scanner.nextInt();
	            scanner.close();

	            String query = "UPDATE students SET name = ?, age = ? WHERE id = ?";
	            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
	                pstmt.setString(1, newName);
	                pstmt.setInt(2, newAge);
	                pstmt.setInt(3, studentId);
	                int rowsAffected = pstmt.executeUpdate();
	                if (rowsAffected > 0) {
	                    System.out.println("Student details updated successfully.");
	                } else {
	                    System.out.println("Student not found.");
	                }
	            }
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
