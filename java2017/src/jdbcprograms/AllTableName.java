package jdbcprograms;

import java.sql.*;

public class AllTableName{
	public static void main(String[] args) {
		System.out.println("Listing all table name in Database!");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "jdbctutorial";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url+db, user, pass);
			try{
				DatabaseMetaData dbm = con.getMetaData();
				String[] types = {"TABLE"};
				ResultSet rs = dbm.getTables(null,null,"%",types);
				System.out.println("Table name:");
				while (rs.next()){
					String table = rs.getString("TABLE_NAME");
					System.out.println(table);
					con.close();
				}
			}
			catch (SQLException s){
				System.out.println("No any table in the database");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}