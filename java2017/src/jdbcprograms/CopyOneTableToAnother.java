import java.sql.*;

public class CopyOneTableToAnother{
	public static void main(String[] args) {
		System.out.println("Copy data from one table to another in a database!");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "jdbc4";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		try {
			//Load jdbc driver
			Class.forName(driver).newInstance();
			//Establish the connection
			conn = DriverManager.getConnection(url+dbName,userName,password);
			Statement st = conn.createStatement();
			//Copy table
			int rows = st.executeUpdate("INSERT INTO Copyemployee SELECT * FROM employee");
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