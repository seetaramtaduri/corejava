import java.sql.*;

public class PreparedStatementBatchUpdate{
	public static void main(String[] args) {
		System.out.println("Prepared Statement Batch Update Example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				con.setAutoCommit(false);
				String sql = "INSERT movies1 VALUES(?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				prest.setString(1,"Bagal bali");
				prest.setInt(2,2002);
				prest.addBatch();
				prest.setString(1,"Raja Hindustani");
				prest.setInt(2,1998);
				prest.addBatch();
				prest.setString(1,"Diwar");
				prest.setInt(2,1980);
				prest.addBatch();
				prest.setString(1,"Nadia ke par");
				prest.setInt(2,1975);
				prest.addBatch();
				int count[] = prest.executeBatch();
				con.commit();
				con.close();
				System.out.println("Added Successfully!");
			}
			catch (BatchUpdateException s){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}