package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Search_stuID {

	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(dbUrl, username, password)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.close();

            String query = "SELECT * FROM student WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, studentId);
                try (ResultSet result = pstmt.executeQuery()) {
                    if (result.next()) {
                        System.out.println("Student found:");
                        System.out.println("ID: " + result.getInt("id"));
                        System.out.println("Name: " + result.getString("name"));
                        System.out.println("Age: " + result.getInt("age"));
                    } else {
                        System.out.println("Student not found.");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
