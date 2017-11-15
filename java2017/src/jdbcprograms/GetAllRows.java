import java.sql.*;

public class GetAllRows{
	public static void main(String[] args) {
		System.out.println("Getting All Rows from a table!");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "jdbctutorial";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";
		try{
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+db, user, pass);
			try{
				Statement st = con.createStatement();
				ResultSet res = st.executeQuery("SELECT * FROM  employee6");
				System.out.println("Emp_code: " + "\t" + "Emp_name: ");
				while (res.next()) {
					int i = res.getInt("Emp_code");
					String s = res.getString("Emp_name");
					System.out.println(i + "\t\t" + s);
				}
				con.close();
			}
			catch (SQLException s){
				System.out.println("SQL code does not execute.");
			}		
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}