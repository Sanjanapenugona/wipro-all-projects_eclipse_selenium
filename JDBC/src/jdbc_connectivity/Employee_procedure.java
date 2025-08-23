package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class Employee_procedure {

	public static void main(String[] args) {
		   try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

	            // Call procedure to add bonus
	            CallableStatement cs = con.prepareCall("CALL add_bonus()");
	            cs.execute();

	            // Call function to get same name employees
	            cs = con.prepareCall("SELECT get_same_name_employees()");
	            ResultSet rs = cs.executeQuery();
	            while (rs.next()) {
	                System.out.println("Same name employees: " + rs.getString(1));
	            }

	            // Call procedure to get highest and lowest salary
	            cs = con.prepareCall("CALL get_highest_lowest_salary()");
	            rs = cs.executeQuery();
	            while (rs.next()) {
	                System.out.println("Highest salary: " + rs.getBigDecimal(1));
	                System.out.println("Lowest salary: " + rs.getBigDecimal(2));
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}



	