import java.sql.*;

public class StatementBatchUpdate{
	public static void main(String[] args) {
		System.out.println("Prepared Statement Batch Update example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				con.setAutoCommit(false);
				String table1 = "INSERT emp_sal VALUES('Rahul',6000)";
				String table2 = "DELETE FROM movies WHERE title = 'Diwar'";
				Statement st = con.createStatement();
				st.addBatch(table1);
				st.addBatch(table2);
				int count[] = st.executeBatch();
				con.commit();
				con.close();
				System.out.println("Successfully!");
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