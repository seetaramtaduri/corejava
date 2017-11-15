import java.io.*;
import java.sql.*;

public class DiscriptionTable{
	public static void main(String[] args) {
		System.out.println("See Description of Table Example!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctutorial","root","root");
			try{
				Statement st = con.createStatement();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter table name:");
				String table = bf.readLine();
				ResultSet rs = st.executeQuery("DESCRIBE "+table);
				ResultSetMetaData md = rs.getMetaData();
				int col = md.getColumnCount();
				for (int i = 1; i <= col; i++){
					String col_name = md.getColumnName(i);
					System.out.print(col_name+"\t");
				}
				System.out.println();
				DatabaseMetaData dbm = con.getMetaData();
				ResultSet rs1 = dbm.getColumns(null,"%",table,"%");
				while (rs1.next()){
					String col_name = rs1.getString("COLUMN_NAME");
					String data_type = rs1.getString("TYPE_NAME");
					int data_size = rs1.getInt("COLUMN_SIZE");
					int nullable = rs1.getInt("NULLABLE");
					System.out.print(col_name+"\t"+data_type+"("+data_size+")"+"\t");
					if(nullable == 1){
						System.out.print("YES\t");
					}
					else{
						System.out.print("NO\t");
					}
					System.out.println();
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