import java.sql.*;

public class NatLeftJoinTable{
	public static void main(String[] args) {
		System.out.println("Natural Left Join Tables Example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				ResultSet res = st.executeQuery("SELECT *FROM "+"employee"+" NATURAL LEFT JOIN "+"Emp_sal");	//Natural Left Join two tables
				System.out.println("Emp_name" + "\t" + "Emp_ed" + "\t" + "Emp_sal");
				while(res.next()){
					String name = res.getString("Emp_name");
					int ed = res.getInt("Emp_ed");
					int sal = res.getInt("Emp_sal");
					System.out.println(name + "\t\t" + ed + "\t" + sal);
				}
			}
			catch (SQLException s){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}