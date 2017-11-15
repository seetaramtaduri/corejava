import java.sql.*;

public class CreateMySqlTable{
	public static void main(String[] args) {
		System.out.println("Creating a Mysql Table to Store Java Types!");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "jdbctutorial";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";
		try{
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+db, user, pass);
			try{
				Statement st = con.createStatement();
				String table = "CREATE TABLE java_DataTypes2("+ "typ_boolean       BOOL, "              
														+ "typ_byte          TINYINT, "          
														+ "typ_short         SMALLINT, "          
														+ "typ_int           INTEGER, "           
														+ "typ_long          BIGINT, "            
														+ "typ_float         FLOAT, "             
														+ "typ_double        DOUBLE PRECISION, "  
														+ "typ_bigdecimal    DECIMAL(13,0), "    
														+ "typ_string        VARCHAR(254), "      
														+ "typ_date          DATE, "              
														+ "typ_time          TIME, "              
														+ "typ_timestamp     TIMESTAMP, "         
														+ "typ_asciistream   TEXT, "              
														+ "typ_binarystream  LONGBLOB, "          
														+ "typ_blob          BLOB)"; 
				st.executeUpdate(table);
				System.out.println(table);
				con.close();
			}
			catch (SQLException s){
				System.out.println("Table is all ready exists!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}