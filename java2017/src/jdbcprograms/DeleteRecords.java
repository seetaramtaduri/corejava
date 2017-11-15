import java.sql.*;

public class DeleteRecords{
	public static void main(String[] args) {
		System.out.println("Delete records example using prepared statement!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "DELETE FROM movies where year_made = ?";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setInt(1,1985);
				int del = prest.executeUpdate();
				System.out.println("Number of deleted records: " + del);
				con.close();
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