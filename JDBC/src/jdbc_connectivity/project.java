package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class project {

	public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
            Statement stmt = con.createStatement();

            // Create tables
            stmt.execute("create table  teacher(id int, name varchar(50))");
            stmt.execute("create table  employee(id int, department varchar(50))");

            // Insert records
            stmt.execute("insert into teacher values(101,'John'),(102,'Emma'),(103,'David')");
            stmt.execute("insert into employee values(101,'HR'),(102,'Marketing'),(104,'Sales')");

            // Left join
            ResultSet rs = stmt.executeQuery("SELECT teacher.id, teacher.name, employee.department " +
                    "FROM teacher " +
                    "LEFT JOIN employee " +
                    "ON teacher.id = employee.id");
            System.out.println("Left Join Result:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Right join
            rs = stmt.executeQuery("SELECT teacher.id, teacher.name, employee.department " +
                    "FROM teacher " +
                    "RIGHT JOIN employee " +
                    "ON teacher.id = employee.id");
            System.out.println("\nRight Join Result:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Full outer join
            rs = stmt.executeQuery("SELECT teacher.id, teacher.name, employee.department " +
                    "FROM teacher " +
                    "LEFT JOIN employee " +
                    "ON teacher.id = employee.id " +
                    "UNION " +
                    "SELECT teacher.id, teacher.name, employee.department " +
                    "FROM teacher " +
                    "RIGHT JOIN employee " +
                    "ON teacher.id = employee.id");
            System.out.println("\nFull Outer Join Result:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
