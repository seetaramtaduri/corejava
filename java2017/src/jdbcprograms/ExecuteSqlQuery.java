import java.sql.*;
import java.io.*;

class ExecuteSqlQuery 
{
  String choice = "yes" , sqlStmt ;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Connection con;

  ExecuteSqlQuery()
   {
     try{
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   con = DriverManager.getConnection("jdbc:odbc:mydsn1");
	    }catch(Exception e){System.out.println(e);}
    }

  public void acceptData()
   {
     try{
       System.out.println(" enter sql statement : ");
	   sqlStmt = br.readLine();
	   System.out.println(" enter choice to continueing  ");
	   choice = br.readLine();
	    }catch(Exception e){System.out.println(e);}
	 }
    
	public void executeSql()
	 {
	   try{
	        Statement st = con.createStatement();
			while(choice.equals("yes"))
			{
			  acceptData();
			  st.executeUpdate(sqlStmt);
			 }
			con.close();
			}
			catch(Exception e){System.out.println("entered SQL Statement is not Syntacticaly correct ");}
	   }

	public static void main(String[] args) 
	{
	    ExecuteSqlQuery  es = new ExecuteSqlQuery();
		es.executeSql();
		System.out.println("Hello World!");
	}
}
