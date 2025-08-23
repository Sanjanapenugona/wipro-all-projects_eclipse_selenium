package Assesement_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Library_management_system {

	public static void main(String[] args) {
		  try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("Enter book ISBN: ");
	            String isbn = scanner.next();
	            System.out.print("Enter book name: ");
	            String name = scanner.next();
	            System.out.print("Enter book publisher: ");
	            String publisher = scanner.next();
	            System.out.print("Enter book edition: ");
	            String edition = scanner.next();
	            System.out.print("Enter book genre: ");
	            String genre = scanner.next();
	            System.out.print("Enter book price: ");
	            int price = scanner.nextInt();
	            System.out.print("Enter book pages: ");
	            int pages = scanner.nextInt();

	            String query = "INSERT INTO books (book_isbn, book_name, book_publisher,"
	            		+ " book_edition, book_genre, book_price, book_pages) VALUES (?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(query);
	            pstmt.setString(1, isbn);
	            pstmt.setString(2, name);
	            pstmt.setString(3, publisher);
	            pstmt.setString(4, edition);
	            pstmt.setString(5, genre);
	            pstmt.setInt(6, price);
	            pstmt.setInt(7, pages);

	            int rowsAffected = pstmt.executeUpdate();

	            if (rowsAffected > 0) {
	                System.out.println("Book added successfully!");
	            } else {
	                System.out.println("Failed to add book!");
	            }

	            con.close();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
