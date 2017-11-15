import  java.sql.*;
public class Insert_EMP{
	public static void main(String a[])throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		CallableStatement calstat=conn.prepareCall("{call empproc(?,?,?)}");
		calstat.setString(1,a[0]);
		calstat.setString(2,a[1]);
		calstat.setString(3,a[2]);
		ResultSet rs = calstat.executeQuery();
		conn.close();
		calstat.close();
		System.out.println("Your data has been inserted into table.");
	}
}