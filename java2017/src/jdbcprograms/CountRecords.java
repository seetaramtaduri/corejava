import java.io.*;
import java.sql.*;

public class CountRecords{
	public static void main(String[] args) {
		System.out.println("Count records example using prepared statement!");
		Connection con = null;
		int records = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name:");
				String table = bf.readLine();
				String sql = "SELECT COUNT(*) FROM "+table;
				PreparedStatement prest = con.prepareStatement(sql);
				ResultSet rs = prest.executeQuery();
				while (rs.next()){
					records = rs.getInt(1);
				}
				System.out.println("Number of records: " + records);
				con.close();
			}
			catch (SQLException s){
				System.out.println("Table does not exist in the database!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}