import java.sql.*;
import java.io.*;
import java.util.*;

public class TextFileToTable{
	Connection con = null;
	Statement st;
	public static void main(String[] args) {
		System.out.println("Write Text File to Table!");
		TextFileToTable text = new TextFileToTable();
	}

	public Connection connection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException c){
			System.out.println("Class not found!");
		}
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
		}
		catch(SQLException s){
			System.out.println("Connection is not found!");
		}
		return con;
	}

	public TextFileToTable(){
		try{
			FileInputStream fstream = new FileInputStream("Employee_list.txt");
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader bf = new BufferedReader(new InputStreamReader(dstream));
			String data = null;
			String comma = ",";
			while((data = bf.readLine()) != null){
				StringTokenizer stoken = new StringTokenizer(data,comma);			
				String Emp_id = stoken.nextToken();
				int id = Integer.parseInt(Emp_id);
				String Emp_name = stoken.nextToken();
				String Emp_depart = stoken.nextToken();
				String Emp_sal = stoken.nextToken();
				int sal = Integer.parseInt(Emp_sal);
				st = connection().createStatement();
				int row = st.executeUpdate("INSERT Employee_Records VALUES("+id+" , '"+Emp_name+"'"+" , '"+Emp_depart+"' ,"+sal+")");
			}
			System.out.println("All data are inserted in the database table");
			bf.close();
			st.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}