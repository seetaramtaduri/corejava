//==================== Program 2 ============================

import java.sql.*;

class jdbc_ex2
{
   public static void main(String [] args )
                throws SQLException
   {
          
DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver() );
       
Connection con =
 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle",
 "scott",
 "tiger"
);

Statement st = con.createStatement();

ResultSet rs =
	st.executeQuery("Select * from emp");

      while( rs.next() )
      {
          int no ;
          String na;

          no = rs.getInt(1);
          na = rs.getString(2);

    System.out.println(" no : " + no + 
			      "  name : " + na );
        }
      }
  }
