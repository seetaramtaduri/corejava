import java.sql.*;

public class SetDataTypes{
	public static void main(String[] args) {
		System.out.println("Set string,ingeger,double and float example by using the Prepared Statement!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "INSERT student VALUES(?,?,?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setString(1,"vinod");
				prest.setInt(2,86);
				prest.setDouble(3,47.52);
				prest.setFloat(4,65.025f);
				int row = prest.executeUpdate();
				System.out.println(row + " row(s) affected)");
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