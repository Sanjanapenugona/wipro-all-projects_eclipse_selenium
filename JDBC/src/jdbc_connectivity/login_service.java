package jdbc_connectivity;
import java.sql.*;
import java.util.Scanner;


public class login_service {

	
		 public static boolean login(String username, String password) {
		        try (Connection con = modules.getConnection()) {
		            String query = "SELECT * FROM staff WHERE username = ? AND password = ?";
		            PreparedStatement ps = con.prepareStatement(query);
		            ps.setString(1, username);
		            ps.setString(2, password);

		            ResultSet rs = ps.executeQuery();
		            return rs.next(); // login success if a match is found
		        } catch (Exception e) {
		            e.printStackTrace();
		            return false;
		        }
		    
		
	}

		 public static Object registerPatient(Scanner sc) {
			// TODO Auto-generated method stub
			return null;
		 }

		 public static boolean login_service(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		 }


}
