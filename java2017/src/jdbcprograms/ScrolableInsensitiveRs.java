import java.sql.*;

class ScrolableInsensitiveRs
{
  Connection con;
  ResultSet rs;

  ScrolableInsensitiveRs()
   {
     try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:mydsn1");
		}catch(Exception e){System.out.println(e);}
	}
   
   public void getScrolableRs()
    {
	  try{
	   //Statement st = con.createStatement();
	    Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
		rs = st.executeQuery("select * from EmpTable ");
        while(rs.next())
		  {
	         int id = rs.getInt("eidno");
		     String name = rs.getString("ename");
		     float sal = rs.getFloat("esal");
		     System.out.println(" eidno : " + id + "  ename : " + name + "  esal : "+ sal );
		   }
         }catch(Exception e){System.out.println(e);}
	}
	public static void main(String[] args) 
	{
	  ScrolableInsensitiveRs si = new ScrolableInsensitiveRs();
	  si.getScrolableRs();
	  try{
	  si.rs.first();
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
