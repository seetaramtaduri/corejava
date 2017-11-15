//===================== Program  4 ====================
// Demonstrates batch updates.

import java.sql.*;

class jdbc_ex4
{	
       static Connection con = null;
       static ResultSet rs = null;
       static Statement st = null;

        public static void main(String [] args ) throws Exception
        {
           try{
	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft ODBC for Oracle}","kranthi","kranthi");
st = con.createStatement();

String cmd1 = 
	"insert into temp values( 6 , 'abc' )";
String cmd2 = 
	"update temp set name = 'z'";

             st.addBatch( cmd1 );
             st.addBatch( cmd2 );

int k[] = st.executeBatch();


for( int i = 0 ; i < k.length ; i++ )
 System.out.println(
	"command "+i+"affected"+ k[i] );

           }catch( SQLException e )
           {
                 System.out.println(e);
           }
          
        }
}

