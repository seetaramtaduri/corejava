import java.sql.*;

public class SetDate{
	public static void main(String[] args) {
		System.out.println("Prepared statement set date example!");
		Connection con = null;
		Date date = new Date(0000-00-00);
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				PreparedStatement prest = con.prepareStatement("INSERT Records VALUES(?,?,?)");
				prest.setInt(1,003);
				prest.setString(2,"vinod kumar");
				prest.setDate(3,date.valueOf("1984-01-12"));
				int row = prest.executeUpdate();
				System.out.println(row + " row(s) affected");
			}
			catch (SQLException s){
				System.out.println("SQL stattement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}