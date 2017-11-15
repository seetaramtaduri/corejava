package jdbcprograms;

import java.io.*;
import java.sql.*;

public class AddColumn{
	public static void main(String[] args) {
		System.out.println("Adding new column in table example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name:");
				String table = bf.readLine();
				System.out.println("Enter column name:");
				String col = bf.readLine();
				System.out.println("Enter data type:");
				String type = bf.readLine();
				int n = st.executeUpdate("ALTER TABLE "+table+" ADD "+col+" "+type);
				System.out.println("Query OK, "+n+" rows affected");
			}
			catch (SQLException s){
				System.out.println("Tabel or column or data type is not found!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
