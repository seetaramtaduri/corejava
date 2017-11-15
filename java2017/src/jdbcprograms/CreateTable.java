import java.sql.*;

public class CreateTable{
	public static void main(String[] args) {
		System.out.println("Table Creation Example!");
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
				String table = "CREATE TABLE Employee11(Emp_code integer, Emp_name varchar(10))";
				st.executeUpdate(table);
				System.out.println("Table creation process successfully!");
			}
			catch(SQLException s){
				System.out.println("Table all ready exists!");
			}
			con.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}