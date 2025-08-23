package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
class Student {
    int rollno;
    String name;
    int age;
 
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
 

public class prepare_stmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		String query="Insert into student1(rollno,name,age) value (?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(143, "sanjana", 20));
		students.add(new Student(144, "dhana", 21));
		students.add(new Student(145, "penugonda", 22));
		for (Student s: students) {
		
		
		pst.setInt(1,143);
		pst.setString(2, "sanjana");
		pst.setInt(3,  20);
		//int rows=pst.executeUpdate();
		
		pst.setInt(1,144);
		pst.setString(2, "dhana");
		pst.setInt(3,  23);
		int rows=pst.executeUpdate();
		

		pst.setInt(1,144);
		pst.setString(2, "penugonds");
		pst.setInt(3,  24);
		System.out.println(rows+"=Update rows");
		}
	
	}

}
