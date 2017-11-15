//==================== Program 7 =========================
// Demonstrates accessing meta information.

import java.sql.*;

class jdbc_ex7
{
        public static void main( String[] args )
        {
                Connection con;
                ResultSet rs;
                ResultSetMetaData meta;
                Statement st;

                try{
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  con =
					 DriverManager.getConnection(
"jdbc:odbc:sasi","scott","tiger");
 st = con.createStatement();
 rs = st.executeQuery("select * from emp");

 meta = rs.getMetaData();
 System.out.println(
  " Column count " + meta.getColumnCount() );
System.out.println(
 " Column Name        Type           Precision       Scale  ");

for( int i=1;  i <= meta.getColumnCount() ; i++ )
    System.out.println(
	" " + meta.getColumnName(i) 
	+ "            " 
	+ meta.getColumnTypeName(i)
	+ "           " 
	+ meta.getPrecision(i) 
	+ "            " 
	+ meta.getScale(i)  );
                         

                  st.close();
                  con.close();
                  

                }catch( SQLException e)
                {
                        System.out.println(e);
                }
                catch( ClassNotFoundException e)
                {
                        System.out.println(e);
                }




        }
}
