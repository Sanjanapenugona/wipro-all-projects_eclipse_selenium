package Assesement_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display_all_students_records {

	public static void main(String[] args) {
		  try {
	           
	            Class.forName("com.mysql.cj.jdbc.Driver");

	          
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

	           
	            Statement stmt = con.createStatement();

	         
	            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

	          
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " " + rs.getString(2));
	            }

	            rs.close();
	            stmt.close();
	            con.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC driver not found!");
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
		
