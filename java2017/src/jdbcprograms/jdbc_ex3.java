//==================== Program 3 ============================
// Program to demonstrate basic DML manipulations.

import java.sql.*;

class jdbc_ex3
{
 static Connection con = null;
 static ResultSet rs = null;
 static Statement st = null;

 public static void main(String [] args )
 {
   try{



	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con = DriverManager.getConnection(
			"jdbc:odbc:kranthi",
			"kranthi","kranthi");


st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , 
		ResultSet.CONCUR_UPDATABLE );

rs = st.executeQuery("Select * from temp");
                        

   // inserting record.

/*
   rs.moveToInsertRow();

   rs.updateInt( 1 , 30 );
   rs.updateString( 2 , "abc" );

   rs.insertRow();
    
  // rs.moveToCurrentRow();

*/

   // updating record.
/*
   rs.absolute(2);

   rs.updateString( 2 , "OOOOO" );

   rs.updateRow();

*/
// deleting a record.


    rs.first();
    rs.relative(1); // relative from current
    rs.deleteRow();


      while( rs.next() )
      {
         int no ;
         String na;

         no = rs.getInt(1);
         na = rs.getString(2);
 
         System.out.println(" no : " + no + "  name : " + na );
      }

   }catch( SQLException e )
    {
		e.printStackTrace();
    }

	catch( ClassNotFoundException e)
    {
         System.out.println(e);
    }


  
  } // end of main.
}

	

	
