import java.sql.*;

public class SelectRecords{
	public static void main(String[] args) {
		System.out.println("Select Records Example by using the Prepared Statement!");
		Connection con = null;
		int count = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "SELECT title,year_made FROM movies WHERE year_made >= ? AND year_made <= ?";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setInt(1,1980);
				prest.setInt(2,2004);
				ResultSet rs = prest.executeQuery();
				while (rs.next()){
					String mov_name = rs.getString(1);
					int mov_year = rs.getInt(2);
					count++;
					System.out.println(mov_name + "\t" + "- " + mov_year);
				}
				System.out.println("Number of records: " + count);
				prest.close();
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