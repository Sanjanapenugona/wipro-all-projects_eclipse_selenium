package Assesement_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert_student_records {

	public static void main(String[] args) {
		  try {
	           
	            Class.forName("com.mysql.cj.jdbc.Driver");

	           
	            String url = "jdbc:mysql://localhost:3306/mydb";

	           
	            String username = "root";
	            String password = "root";

	          
	            Connection con = DriverManager.getConnection(url, username, password);

	          
	            Scanner scanner = new Scanner(System.in);

	           
	            System.out.print("Enter student ID: ");
	            int id = scanner.nextInt();
	            System.out.print("Enter student name: ");
	            String name = scanner.next();
	            System.out.print("Enter student age: ");
	            int age = scanner.nextInt();

	           
	            String query = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(query);
	            pstmt.setInt(1, id);
	            pstmt.setString(2, name);
	            pstmt.setInt(3, age);

	          
	            int rowsAffected = pstmt.executeUpdate();

	          
	            if (rowsAffected > 0) {
	                System.out.println("Student record inserted successfully!");
	            } else {
	                System.out.println("Failed to insert student record!");
	            }

	            con.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC driver not found!");
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
	

	