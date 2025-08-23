package jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class jdbc_con {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String user="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
    	System.out.println("Connection created");
    	Statement stmt=con.createStatement();
    	ResultSet rs=stmt.executeQuery("Select * from emplo");
    	System.out.println("ID\t name\t salary");
    	while(rs.next())
    	{
    		int id=rs.getInt("id");
    		String name=rs.getString("name");
    		int salary=rs.getInt("salary");
    		System.out.println(id+" "+ name+ " "+salary);
    	}
    	rs.close();
    	stmt.close();
		con.close();

	}

}
