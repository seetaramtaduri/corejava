import java.lang.*;
import java.sql.*;
public class jdbc1 
{
	public static void main(String args[]) throws SQLException 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:raghu","scott","tiger");
			st=con.createStatement();
			rs=st.executeQuery("select empno,ename,sal from emp");
			System.out.println("\nEmployee Details...\n");
			System.out.println("EmpNo.........Ename......Sal\n");	
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n");
				
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