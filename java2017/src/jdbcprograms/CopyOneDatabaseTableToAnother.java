import java.sql.*;

public class CopyOneDatabaseTableToAnother {
	public static void main(String[] args) {
		System.out.println("Copy data from one database table to another!");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "jdbcMysql";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "admin";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			Statement st = conn.createStatement();
			//Copy table
			int rows = st.executeUpdate("INSERT INTO Roseindia SELECT * FROM jdbc4.Copyemployee");
			if (rows == 0){
				System.out.println("Don't add any row!");
			}
			else{
				System.out.println(rows + " row(s)affected.");
				conn.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}