import java.io.*;
import java.sql.*;

public class SumColumn{
	public static void main(String[] args) {
		System.out.println("Sum of the specific column!");
		Connection con = null;
		int sum = 0;
		String col_name;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name:");
				String table = bf.readLine();
				System.out.println("Enter column name which have to sum:");
				String col = bf.readLine();
				ResultSet res = st.executeQuery("SELECT SUM"+"("+col+")"+" FROM "+table);
				while (res.next()){
					int c = res.getInt(1);
					sum = sum+c;
				}
				System.out.println("Sum of column = "+sum);
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