import java.sql.*;
import java.io.*;

class CommitTest
{
  int id;
  String name,choice = "yes";
  float sal;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Connection con;

  CommitTest()
   {
     try{
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   con = DriverManager.getConnection("jdbc:odbc:mydsn1");
	    }catch(Exception e){System.out.println(e);}
    }

  public void acceptData()
   {
     try{
       System.out.println(" enter idno ");
	   id = new Integer(br.readLine()).intValue();
       System.out.println(" enter name ");
	   name = br.readLine();
	   System.out.println(" enter sal ");
	   sal = new Float(br.readLine()).floatValue();
	   System.out.println(" enter choice of continueing  ");
	   choice = br.readLine();
	   System.out.println( id + name + sal);
	    }catch(Exception e){System.out.println("e");}
	 }
    
	public void insertData() 
	 {
	   try{
	        con.setAutoCommit(false);
	        Statement st = con.createStatement();
			while(choice.equals("yes"))
			{
			  acceptData();
			  String stm = "insert into EmpTable values(" + id + ",'" + name + "'," + sal + ")" ;
			  int md = st.executeUpdate(stm);
			  }
            //con.rollback(); 
			con.commit();
			con.close();
			}
			catch(Exception e){System.out.println(e);}
	   }
	public static void main(String[] args) 
	{
       CommitTest ct = new CommitTest();
	   ct.insertData();

		System.out.println("Hello World!");
	}
}
