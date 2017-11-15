import java.io.*;
import java.sql.*;

public class InsertRecords{
	public static void main(String[] args) {
		System.out.println("Insert records example using prepared statement!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				String sql = "INSERT movies VALUES(?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter movie name:");
				String mov = bf.readLine();
				prest.setString(1, mov);
				System.out.println("Enter releases year of movie:");
				int year = Integer.parseInt(bf.readLine());
				prest.setInt(2, year);
				int count = prest.executeUpdate();
				System.out.println(count + "row(s) affected");
				con.close();
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