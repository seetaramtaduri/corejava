import java.sql.*;

public class TwicePreparedStatement{
	public static void main(String[] args) {
		System.out.println("Twice use prepared statement example!\n");
		Connection con = null;
		PreparedStatement prest;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "SELECT * FROM movies WHERE year_made = ?";
				prest = con.prepareStatement(sql);
				prest.setInt(1,2002);
				ResultSet rs1 = prest.executeQuery();
				System.out.println("List of movies that made in year 2002");
				while (rs1.next()){
					String mov_name = rs1.getString(1);
					int mad_year = rs1.getInt(2);
					System.out.println(mov_name + "\t- " + mad_year);
				}
				prest.setInt(1,2003);
				ResultSet rs2 = prest.executeQuery();
				System.out.println("List of movies that made in year 2003");
				while (rs2.next()){
					String mov_name = rs2.getString(1);
					int mad_year = rs2.getInt(2);
					System.out.println(mov_name + "\t- " + mad_year);
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