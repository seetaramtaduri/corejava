import java.io.*;
import java.sql.*;

public class MakeUniqueColumn{
	public static void main(String[] args) {
		System.out.println("Make unique column example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name: ");
				String table = bf.readLine();
				System.out.println("Enter column name that you want to unique values: ");
				String col = bf.readLine();
				int n = st.executeUpdate("ALTER TABLE "+table+" ADD UNIQUE"+"("+col+")");
				System.out.println("Query OK, "+n+" rows affected.");
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