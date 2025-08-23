package jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assesement_day11 {

	public static void main(String[] args) {
		   try {
	           
	            Class.forName("com.mysql.cj.jdbc.Driver");

	          
	            String url = "jdbc:mysql://localhost:3306/mydb";

	        
	            String username = "root";
	            String password = "root";

	            Connection con = DriverManager.getConnection(url, username, password);

	         
	            Statement stmt = con.createStatement();

	  
	            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

	     
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " " + rs.getString(2));
	            }

	  
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}
	