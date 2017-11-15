import java.sql.*;

public class DeleteSpecificRow{
	public static void main(String[] args) {
		System.out.println("An example for Deleting a Row from a Database!");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String driver = "com.mysql.jdbc.Driver";
		String db = "jdbctutorial";
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url+db, "root", "root");
			try{
				Statement st = con.createStatement();
				String sql = "DELETE FROM employee WHERE Emp_ed = '1'";
				int delete = st.executeUpdate(sql);
				if(delete == 1){
					System.out.println("Row is deleted.");
				}
				else{
					System.out.println("Row is not deleted.");
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