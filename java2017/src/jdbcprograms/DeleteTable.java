import java.sql.*;

public class DeleteTable{
	public static void main(String[] args) {
		System.out.println("Tabel Deletion Example");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "jdbctutorial";
		String driverName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try{
			Class.forName(driverName).newInstance();
			con = DriverManager.getConnection(url+dbName, userName, password);
			try{
				Statement st = con.createStatement();
				st.executeUpdate("DROP TABLE Employee2");
				System.out.println("Table Deletion process is completly successfully!");
			}
			catch(SQLException s){
				System.out.println("Table is not exists!");
			}
			con.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}