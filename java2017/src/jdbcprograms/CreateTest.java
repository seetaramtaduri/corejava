import java.sql.*;

class CreateTest 
{
	public static void main(String[] args) 
	{
		try{
	        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	        Connection con = DriverManager.getConnection("jdbc:odbc:mydsn1");
	        Statement st = con.createStatement();

	        String stm = "create table student(sidno number,sname text,sclass number) " ;
	        st.executeUpdate(stm);
	        
           }
		catch(Exception e)
		   {System.out.println(e);}
	}
}
