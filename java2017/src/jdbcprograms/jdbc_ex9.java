//===================== Program 9 ========================
// Demonstrates Callable statements.

import java.sql.*;
class jdbc_ex9
{
 public static void main( String[] args )
 {
  Connection con;
  CallableStatement cs;

  try {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con = DriverManager.getConnection(
	"jdbc:odbc:sasi","scott","tiger");

   cs = con.prepareCall( " { ? = call sub( ? , ? ) } ");

cs.registerOutParameter( 1 , Types.INTEGER );

		cs.setInt( 2 , 80 );
		cs.setInt( 3 , 20 );

cs.execute();

		System.out.println(cs.getInt(1));



  }catch( Exception e ) { System.out.println(e);}
 }
}



/*
        { ? = call p1(? , ? , ? ) }
        cs.registerOutParameter(1);
        cs.registerOutParameter(3);
        cs.execute();

        ret = cs.getString(1);
        ret1 = cs.getString(3);
*/

