import java.io.*;
import java.sql.*;

class SelectData 
{
  int id;
  String name,choice = "yes";
  float sal;
  boolean flag ;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Connection con;

  SelectData()
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
       System.out.println(" enter choice of continueing  ");
	   choice = br.readLine();
	    flag = false;
	    }catch(Exception e){System.out.println("e");}
	 }
    
	public void getData()
	 {
	   try{
	        Statement st = con.createStatement();
			while(choice.equals("yes"))
			 {
			  acceptData();
			  String stm = "select * from EmpTable where eidno = " + id ;
			  ResultSet rs = st.executeQuery(stm);
			  while(rs.next())
			   {
			     flag = true ;
			     int id = rs.getInt("eidno");
				 String name = rs.getString("ename");
				 float sal = rs.getFloat("esal");
				 System.out.println(" eidno : " + id + "  ename : " + name + "  esal : "+ sal );
				 }
                if(flag == false)
				  System.out.println(" entered idno is not present in the database ");
			   }
			con.close();
			}
			catch(Exception e){System.out.println(e);}
	   }

	public static void main(String[] args) 
	{
	    SelectData h = new SelectData();
		h.getData();
		System.out.println("Hello World!");
	}
}
