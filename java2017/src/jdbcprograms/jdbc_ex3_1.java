import java.sql.*;

class jdbc_ex3_1
{
 public static void main(String [] args )
					  throws SQLException
 {

	DriverManager.registerDriver( 
	  new oracle.jdbc.driver.OracleDriver() );
       
	Connection con =
	   DriverManager.getConnection(
		 "jdbc:oracle:thin:@localhost:1521:oracle",
		 "kranthi",
		 "kranthi"
		);

	PreparedStatement st =
	  con.prepareStatement( 
		" insert into temp values( ? , ? ) " );

	st.setString( 1 , "110" );
	st.setString( 2 , "abc" );

	st.execute();

	st.setString( 1 , "210" );
	st.setString( 2 , "xyz" );

	st.execute();

	Statement st1 = con.createStatement();
	ResultSet rs = 
		st1.executeQuery("Select * from temp");

	while( rs.next() )
	{
		System.out.println(
			" Eno : " + rs.getString("no") 
			+"Ena : " + rs.getString("name")			
		);
	}
   }
}

	

	
