import java.sql.*;

class RsMetaData
{
  Connection con;
  RsMetaData()
   {
     try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:mydsn1");
		}catch(Exception e){System.out.println(e);}
	}
   void viewMetaData()
    {
	   try{
	      
		  Statement st = con.createStatement();
		  ResultSet rs = st.executeQuery("select * from EmpTable ");
	      ResultSetMetaData rmd = rs.getMetaData();
		  int colCount = rmd.getColumnCount();
		  for (int i = 1;i <= colCount ; i++ )
		  {
		     String cname = rmd.getColumnName(i);
			 String ctype = rmd.getColumnTypeName(i);
			 System.out.println(" Name Of the " + i + " column is : " + cname);
             System.out.println(" Type Of the " + i + " column is : " + ctype);
		  }
		      
		  }
		  catch(Exception e)
		   {System.out.println(e);} 
      }
	public static void main(String[] args) 
	{
	   RsMetaData r = new RsMetaData();
	   r.viewMetaData();
		System.out.println("Hello World!");
	}
}
