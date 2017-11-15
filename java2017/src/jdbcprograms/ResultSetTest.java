import java.sql.*;

class  ResultSetTest
{
	public static void main(String[] args) 
	{
	   try{
	        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	        Connection con = DriverManager.getConnection("jdbc:odbc:mydsn1");
	        Statement st = con.createStatement();

	        String stm = "select * from EmpTable " ;
	        ResultSet rs = st.executeQuery(stm);
	         while(rs.next())
		      {
	             int id = rs.getInt("eidno");
		         String name = rs.getString("ename");
		         float sal = rs.getFloat("esal");
		          System.out.println(" eidno : " + id + "  ename : " + name + "  esal : "+ sal );
		        }
           }
		catch(Exception e)
		   {System.out.println(e);}
		
	}
}
