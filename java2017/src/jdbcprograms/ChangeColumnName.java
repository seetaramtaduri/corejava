package jdbcprograms;

import java.io.*;
import java.sql.*;

public class ChangeColumnName{
	public static void main(String[] args) {
		System.out.println("Change column name in a database table example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name:");
				String table = bf.readLine();
				System.out.println("Enter old column name:");
				String old_col = bf.readLine();
				System.out.println("Enter new column:");
				String new_col = bf.readLine();
				System.out.println("Enter data type:");
				String type = bf.readLine();
				int n = st.executeUpdate("ALTER TABLE "+table+" CHANGE "+old_col+" "+new_col+" "+type);
				System.out.println("Query OK, "+n+" rows affected");
			}
			catch (SQLException s){
				System.out.println("Wrong entry!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
