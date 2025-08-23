package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class Hospital {

	public static void main(String[] args) {
		 try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

	            // Call procedure to print average patient count on daily basis
	            CallableStatement cs = con.prepareCall("CALL avg_patient_count()");
	            ResultSet rs = cs.executeQuery();
	            System.out.println("Average patient count on daily basis:");
	            while (rs.next()) {
	                System.out.println(rs.getDate(1) + " " + rs.getInt(2));
	            }

	            // Call function to print all patients who belong to the same ward
	            CallableStatement cs1 = con.prepareCall("SELECT get_same_ward_patients('Cardiology')");
	            ResultSet rs1 = cs1.executeQuery();
	            System.out.println("\nPatients in Cardiology ward:");
	            while (rs1.next()) {
	                System.out.println(rs1.getString(1));
	            }

	            // Call procedure to arrange patients list according to admission date
	            CallableStatement cs2 = con.prepareCall("CALL arrange_patients_by_admission_date()");
	            ResultSet rs2 = cs2.executeQuery();
	            System.out.println("\nPatients list arranged by admission date:");
	            while (rs2.next()) {
	                System.out.println(rs2.getInt(1) + " " + rs2.getString(2) + " " + rs2.getString(3) + " " + rs2.getDate(4));
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	
	}
		
