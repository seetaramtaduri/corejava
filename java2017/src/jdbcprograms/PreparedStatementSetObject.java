import java.sql.*;

public class PreparedStatementSetObject{
	public static void main(String[] args) {
		System.out.println("Prepared Statement Set Array Example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				PreparedStatement prest = con.prepareStatement("insert emp_sal values(?,?)");
				prest.setObject(1,"Sushil");
				prest.setObject(2,15000);
				int n = prest.executeUpdate();
				System.out.println(n + " Record is added in the table.");
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