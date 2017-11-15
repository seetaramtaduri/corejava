import java.sql.*;

class UpdatebleRs 
{
  Connection con;
  ResultSet rs;
  Statement st;

   UpdatebleRs()
    {
      try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:mydsn1");
		}catch(Exception e){System.out.println(e);}
	 }

	 public void upDateRs()
	  {
	    int count = 1;
         try{
	       st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		   rs = st.executeQuery("select * from EmpTable ");
           while(rs.next())
		    {
			  if(count == 1)
			    {
				  long l = 786;
				  double d = 9000;
			      rs.updateLong("eidno",l);
			      rs.updateString("ename","sham");
			//	  rs.updateDouble("esal",d);
			      rs.updateRow();
				 }
                else{
	                 int id = rs.getInt("eidno");
		             String name = rs.getString("ename");
		             float sal = rs.getFloat("esal");
		             System.out.println(" eidno : " + id + "  ename : " + name + "  esal : "+ sal );
					 }
                count = count + 1;
		       }
                con.close();
			  }
			 catch(Exception e){System.out.println(" inside upDateRs() " + e);}
         }

	public static void main(String[] args) 
	{
	    UpdatebleRs ur = new UpdatebleRs();
		ur.upDateRs();
		System.out.println("Hello World!");
	}
}
