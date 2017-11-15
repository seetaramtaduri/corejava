import java.sql.*;

public class SetTimetamp{
	public static void main(String[] args) {
		System.out.println("Set Timestamp example by using the Prepared Statement!");
		Connection con = null;
		Timestamp tstamp = new Timestamp(00-00-00);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "INSERT ray VALUES(?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setString(1,"Bita-ray");
				prest.setTimestamp(2,tstamp.valueOf("1984-11-23 12:60:60.60"));
				int row = prest.executeUpdate();
				System.out.println(row + " row(s) affected)");
			}
			catch (IllegalArgumentException s){
				System.out.println("Illegal argument!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}