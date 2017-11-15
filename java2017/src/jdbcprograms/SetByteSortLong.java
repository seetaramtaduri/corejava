import java.sql.*;

public class SetByteSortLong{
	public static void main(String[] args) {
		System.out.println("Set Byte,short and long example by using Prepared Statement!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "INSERT datatypes VALUES(?,?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setByte(1,(byte)35);
				prest.setShort(2,(short)6565);
				prest.setLong(3,(long)155645);
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