
import java.sql.*;

class jdbc_ex12 
{
	public static void main(String[] args) 
			throws Exception
	{


Connection con ;

DriverManager.registerDriver( 
	new oracle.jdbc.driver.OracleDriver() );

con =
 DriverManager.getConnection(
	 "jdbc:oracle:thin:@localhost:1521:oracle",
	 "scott",
	 "tiger");

String command = 
	  " create or replace function"
    + "   sub( a in number , b in number )"
	+ "                return number " 
	+ " as "
    + " begin " 
	+ "   return a - b ; "
	+ " end; "
	;

Statement st = con.createStatement();
st.execute( command );

CallableStatement cs = 
  con.prepareCall(
	   " { ? = call sub( ? , ? ) } ");

cs.registerOutParameter( 1 , Types.INTEGER );

		cs.setInt( 2 , 10 );
		cs.setInt( 3 , 20 );

cs.execute();

		System.out.println( 
			         cs.getInt(1) 
		);
	}
}
