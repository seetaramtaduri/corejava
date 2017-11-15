import java.io.*;
import java.sql.*;

public class DeleteColumn{
	public static void main(String[] args) {
		System.out.println("Delete columns example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name: ");
				String table = bf.readLine();
				System.out.println("Enter column name: ");
				String col = bf.readLine();
				st.executeUpdate("ALTER TABLE "+table+" DROP "+col);
				System.out.println("Column is deleted successfully!");
			}
			catch (SQLException s){
				System.out.println("Table or column is not found!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
