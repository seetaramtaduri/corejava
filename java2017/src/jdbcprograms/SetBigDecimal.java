import java.sql.*;
import java.math.*;

public class SetBigDecimal{
	public static void main(String[] args) {
		BigDecimal str = null;
		System.out.println("Set BigDecimal Example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "INSERT bigdecimal VALUES(?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setString(1,"Deepak");
				str = new BigDecimal("54547751418641878415841554878454");
				prest.setBigDecimal(2,str);
				prest.executeUpdate();
				System.out.println("Successfully!");
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