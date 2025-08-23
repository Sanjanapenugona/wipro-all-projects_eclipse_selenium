package Assesement_day11;
import java.sql.*;
public class count_rows {

	public static void main(String[] args) {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

          
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

          
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM students");

       
            if (rs.next()) {
                int rowCount = rs.getInt(1);
                System.out.println("Total number of rows: " + rowCount);
            }

            
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}