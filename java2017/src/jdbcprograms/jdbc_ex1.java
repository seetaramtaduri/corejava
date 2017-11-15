//==================== Program 1 ============================

import java.sql.*;

class jdbc_ex1
{

 static Connection con = null;
 static ResultSet rs = null;
 static Statement st = null;

        public static void main(String [] args )
        {

        try{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  

//===================

 con =
  DriverManager.getConnection(
     "jdbc:odbc:Driver={Microsoft ODBC for Oracle}",
     "scott",
     "tiger");
//===================

 st = con.createStatement();

 rs = st.executeQuery("Select * from dept");

 while( rs.next() )
 {
    int no ;
    String na;

    no = rs.getInt("deptno");
    na = rs.getString("dname");

    System.out.println(
      " no : " + no + "  name : " + na );
}

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

/* 
  DriverManager.getConnection(
   "jdbc:odbc:Driver={Microsoft ODBC for Oracle}",
   "scott","tiger"
  );
*/