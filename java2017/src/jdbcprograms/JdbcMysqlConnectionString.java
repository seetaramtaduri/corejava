
import java.sql.*;

public class JdbcMysqlConnectionString {

    static public final String driver = "com.mysql.jdbc.Driver";
    static public final String connection =
            "jdbc:mysql://localhost:3306/komal";
    static public final String user = "root";
    static public final String password = "root";

    public static void main(String args[]) {
        try {
            Class.forName(driver);
            Connection con =
                    DriverManager.getConnection(connection, user, password);

            System.out.println("Jdbc Mysql Connection String :");
            System.out.println(connection);

            System.out.println("User Name :" + user);
            System.out.println("Password  :" + password);

            if (!con.isClosed()) {
                con.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
