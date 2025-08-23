package Assesement_day11;
import java.sql.*;
public class all_CRUD {

	public static void main(String[] args) {
		 try {
	            // Load the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish a connection to the database
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

	            // Create employee
	            createEmployee(conn, 1, "Sanjana", "java developer", 000);

	            // Read employees
	            readEmployees(conn);

	            // Update employee
	            updateEmployee(conn, 1, 60000);

	            // Read employees
	            readEmployees(conn);

	            // Delete employee
	            deleteEmployee(conn, 1);

	            // Close the database connection
	            conn.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Create employee
	    public static void createEmployee(Connection conn, int id, String name, String position, double salary) throws SQLException {
	        String query = "INSERT INTO employees (id, name, position, salary) VALUES (?, ?, ?, ?)";
	        PreparedStatement pstmt = conn.prepareStatement(query);
	        pstmt.setInt(1, id);
	        pstmt.setString(2, name);
	        pstmt.setString(3, position);
	        pstmt.setDouble(4, salary);
	        pstmt.executeUpdate();
	        System.out.println("Employee created successfully!");
	    }

	    // Read employees
	    public static void readEmployees(Connection conn) throws SQLException {
	        String query = "SELECT * FROM employees";
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            System.out.println("ID: " + rs.getInt("id"));
	            System.out.println("Name: " + rs.getString("name"));
	            System.out.println("Position: " + rs.getString("position"));
	            System.out.println("Salary: " + rs.getDouble("salary"));
	            System.out.println();
	        }
	    }

	    // Update employee
	    public static void updateEmployee(Connection conn, int id, double salary) throws SQLException {
	        String query = "UPDATE employees SET salary = ? WHERE id = ?";
	        PreparedStatement pstmt = conn.prepareStatement(query);
	        pstmt.setDouble(1, salary);
	        pstmt.setInt(2, id);
	        pstmt.executeUpdate();
	        System.out.println("Employee updated successfully!");
	    }

	    // Delete employee
	    public static void deleteEmployee(Connection conn, int id) throws SQLException {
	        String query = "DELETE FROM employees WHERE id = ?";
	        PreparedStatement pstmt = conn.prepareStatement(query);
	        pstmt.setInt(1, id);
	        pstmt.executeUpdate();
	        System.out.println("Employee deleted successfully!");
	    }
	}