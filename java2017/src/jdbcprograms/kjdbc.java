import java.lang.*;
import java.sql.*;
public class kjdbc 
{
	public static void main(String args[]) throws SQLException 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:kranthi","kranthi","kranthi");
			st=con.createStatement();
			rs=st.executeQuery("select * from temp");
			System.out.println("\nTemp Details...\n");
			System.out.println("No.........name\n");	
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				
			}
		}
		catch(SQLException e)
		{
			
		}
		catch(ClassNotFoundException ce)
		{
			
		}
		finally
		{
			rs.close();
			st.close();
			con.close();
		}
	}
}