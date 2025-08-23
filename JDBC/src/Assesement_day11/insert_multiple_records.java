package Assesement_day11;
import java.sql.*;
public class insert_multiple_records {

	public static void main(String[] args) {
		try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

            // Create a PreparedStatement object
            String query = "INSERT INTO students (name, grade, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            // Insert multiple student records
            insertStudent(pstmt, "Sanjana", "A", 20);
            insertStudent(pstmt, "Dhana", "B", 21);
            insertStudent(pstmt, "Sri", "c", 19);

            // Close the database connection
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a student record
    private static void insertStudent(PreparedStatement pstmt, String name, String grade, int age) throws SQLException {
        pstmt.setString(1, name);
        pstmt.setString(2, grade);
        pstmt.setInt(3, age);
        pstmt.executeUpdate();
        System.out.println("Student record inserted successfully");
   
	}

}
