import java.sql.*;

public class DeleteAllRows{
	public static void main(String[] args) {
		System.out.println("Example for Deleting All Rows from a database Table!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial", "root", "root");
			try{
				Statement st = con.createStatement();
				String sql = "DELETE FROM employee6";
				int delete = st.executeUpdate(sql);
				if(delete == 0){
					System.out.println("All rows are completelly deleted!");
				}
			}
			catch(SQLException s){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}