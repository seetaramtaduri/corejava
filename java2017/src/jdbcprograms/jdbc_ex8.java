//==================== Program 8 ========================
// Demonstrates Prepared statements 

import java.sql.*;

class jdbc_ex8
{
 public static void main( String[] args )
 {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

   try {

     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con = DriverManager.getConnection(
			"jdbc:odbc:myoracle","scott","tiger");

 ps = con.prepareStatement
        ("select * from temp where eno = ? ");

 ps.setString(1,"888");
 ps.execute();

  rs = ps.getResultSet();

     while( rs.next() )
     {
	System.out.println( 
		rs.getString("eno") 
		+ " " 
		+ rs.getString("ena") 
	);
     }

   }catch( Exception e ) 
	{ 
	   System.out.println(e);
	}
  }
}

