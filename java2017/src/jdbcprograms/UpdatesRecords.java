import java.sql.*;

public class UpdatesRecords{
	public static void main(String[] args) {
		System.out.println("Updates Records Example through Prepared Statement!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "UPDATE movies SET title = ? WHERE year_made = ?";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setString(1,"Sanam We wafafa");
				prest.setInt(2,2005);
				prest.executeUpdate();
				System.out.println("Updating Successfully!");
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