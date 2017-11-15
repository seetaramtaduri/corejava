
 import java.io.*;
import java.sql.*;

class PreparedInsertData 
{
  int id;
  String name,choice = "yes";
  float sal;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Connection con;

  PreparedInsertData()
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
	        String stm = "insert into EmpTable values(?,?,?)" ;

	        PreparedStatement pst = con.prepareStatement(stm);

			while(choice.equals("yes"))
			{
			  acceptData();
			  pst.setInt(1,id);
			  pst.setString(2,name);
			  pst.setDouble(3,sal);
			  pst.executeUpdate();
			 }
			con.close();
		  }
		 catch(Exception e){System.out.println(e);}
	   }

	public static void main(String[] args) 
	{
	    PreparedInsertData pd = new PreparedInsertData();
		pd.insertData();
		System.out.println("Hello World!");
	}
}


