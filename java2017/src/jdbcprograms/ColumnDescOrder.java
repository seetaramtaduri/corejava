package jdbcprograms;

import java.io.*;
import java.sql.*;

public class ColumnDescOrder{
	public static void main(String[] args) {
		System.out.println("Descending order example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name:");
				String table = bf.readLine();
				System.out.println("Enter column name which have to see descending order:");
				String col_name = bf.readLine();
				ResultSet res = st.executeQuery("SELECT "+col_name+" FROM "+table+" ORDER BY "+col_name+" DESC");
				System.out.println("Descending order of given column:");
				while (res.next()){
					int col = res.getInt(1);
					System.out.println(col);
				}
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