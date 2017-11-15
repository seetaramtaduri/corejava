import java.sql.*;

public class SetTime{
	public static void main(String[] args) {
		System.out.println("Prepared Statement Set Time example!");
		Connection con = null;
		Time time = new Time(00-00-00);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "INSERT child VALUES(?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setString(1,"Deepak");
				prest.setTime(2,time.valueOf("09:45:57"));
				int row = prest.executeUpdate();
				System.out.println(row + " row(s) affectec)");
			}
			catch (SQLException e){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}