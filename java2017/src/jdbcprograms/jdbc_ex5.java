//===================== Program 5 ===================
// Demonstrates commit and rollback.

import java.sql.*;

class jdbc_ex5
{
 static Connection con = null;
 static Statement st = null;

 public static void main(String [] args )
 {
  try{

 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 con = DriverManager.getConnection(
		"jdbc:odbc:sasi","kranthi","kranthi");

  st = con.createStatement();

String cmd1 = "insert into temp values(420,'p')";
String cmd2 = "update temp set no = 1  where no=30";

  con.setAutoCommit( false ); 

  st.addBatch(cmd1);
  st.addBatch(cmd2);

  st.executeBatch();

//  con.commit(); 

 con.rollback();

 }catch( SQLException e )
  {
     System.out.println(e);
  }
  catch( ClassNotFoundException e)
  {
     System.out.println(e);
  }

 }
 
}

