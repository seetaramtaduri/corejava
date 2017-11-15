import java.sql.*;

class ScrolableSensitiveRs
{
  Connection con;
  ResultSet rs;
  Statement st;

  ScrolableSensitiveRs()
   {
     try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:mydsn1");
		}catch(Exception e){System.out.println(e);}
	}
   
   public void getScrolableRs()
    {
	  try{
	    st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("select * from EmpTable ");
        while(rs.next())
		  {
	         int id = rs.getInt("eidno");
		     String name = rs.getString("ename");
		     float sal = rs.getFloat("esal");
		     System.out.println(" eidno : " + id + "  ename : " + name + "  esal : "+ sal );
		   }
          
		 System.out.println("after insert : " );
          
         }catch(Exception e){System.out.println("inside getScrolabaleRs() " + e);}
	}

   public void changeRs()
     {
      try{
	     Connection con = DriverManager.getConnection("jdbc:odbc:mydsn1");
	     Statement st = con.createStatement();
	     int rows_effect = st.executeUpdate("insert into EmpTable values(92,'rajesh',67890)");
		 System.out.println("inside changeRs : ");
		 con.close();
		  }catch(Exception e){System.out.println(" inside changeRs() " + e);}
	  }

	public static void main(String[] args) 
	{
	  ScrolableSensitiveRs si = new ScrolableSensitiveRs();
	  si.getScrolableRs();
	  try{
	  int typ = si.rs.getType();
	  if(typ == ResultSet.TYPE_FORWARD_ONLY)
	    System.out.println(" forward only ");
      if(typ == ResultSet.TYPE_SCROLL_INSENSITIVE)
	    System.out.println(" Insensitive ");
      if(typ == ResultSet.TYPE_SCROLL_SENSITIVE)
	    System.out.println(" sensitive ");
	  si.changeRs();
	  
	  si.rs.beforeFirst();
	  System.out.println(" Inside main : ");
           while(si.rs.next())
		      {
	             int id = si.rs.getInt("eidno");
		         String name = si.rs.getString("ename");
		         float sal = si.rs.getFloat("esal");
		         System.out.println(" eidno : " + id + "  ename : " + name + "  esal : "+ sal );
		        } 
          }catch(Exception e){System.out.println(e);}
		System.out.println("Hello World!");
	}
}
