package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
 

public class createTable {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String user="root";
		String password="root";
		
		// create table
		String sql="create table students(rollno int,"
				+ "name varchar(50),"
				+ " per int,"
				+ "email varchar(50))";
		// insert record
		String insertSQL="insert into students values(101,'Sanjana',98,'sanjana@gmail.com'),"
				+ "(102,'Penugonda',89,'penugonda@gmail.com'),"
				+ "(103,'Dhana',79,'dhana@gmail.com')";
		String UpdateSQL="update students set per=95 where rollno=101";
		
		try
		{
			// driver connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			// create statement for query execution
			Statement stmt=con.createStatement();
			// call create query using statement
			stmt.executeUpdate(sql);
			System.out.println("Students table created");
			// call insert query using statement
			int rowInserted=stmt.executeUpdate(insertSQL);
			if(rowInserted>0)
			{
				System.out.println("new Student record inserted ");
			}
			//Udated query
			int rowUpdated=stmt.executeUpdate(UpdateSQL);
			if(rowUpdated>0)
			{
				System.out.println("Student record Updated ");
			}
			//Print table
			ResultSet rs=stmt.executeQuery("Select * from students");
			System.out.println("rollno\t name\t Per\t Email");
			// while loop for fetching all the table records
			while(rs.next())
			{
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				System.out.println(rollno+" "+ name+" "+ per+" "+ email);
				//System.out.println("rollno:"+rollno+"\tName:"+ name+"Percentage:"+ per+"Email:"+ email);
			}
			
			stmt.close();
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
 
}
	

