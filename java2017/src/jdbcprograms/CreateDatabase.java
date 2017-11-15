import java.io.*;
import java.sql.*;

public class CreateDatabase{
	public static void main(String[] args) {
		System.out.println("Database creation example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Database name:");
				String database = bf.readLine();
				st.executeUpdate("CREATE DATABASE "+database);
				System.out.println("1 row(s) affacted");
			}
			catch (SQLException s){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}