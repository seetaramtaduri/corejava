import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class CreateConnection {

 // defining driver name, mysql-jdbc driver in this case
 String driverName = "com.mysql.jdbc.Driver";
 Connection con = null;

 // database url string with hostname and port on which db is running
 String url = "jdbc:mysql://localhost:3306/";

 public Connection getConnection(String dbName, String username,
   String password) {

  // creating connection url
  String connectionUrl = url + dbName;

  try {
   // registers the specified driver class into memory
   Class.forName(driverName);
  } catch (ClassNotFoundException e) {
   e.printStackTrace();
  }

  try {
   // returns a connection objcet by selecting an appropriate driver
   // for specified connection URL
   con = DriverManager.getConnection(connectionUrl, username, password);
  } catch (SQLException e) {
   e.printStackTrace();
  }
  return con;
 }
}

public class Implementation {
 public static void main(String args[]) {

  // create a table
  CreateTable createTable = new CreateTable();
  createTable.createTable();

 }
}

______________________________________________________________________
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
 public void createTable() {

  Statement stmt = null;
  Connection con = null;

  // storing a simple sql query into string object
  String query = "create table user (" + "id int,"
    + "first_name varchar(30)," + "last_name varchar(30),"
    + "email varchar(30)," + "phone varchar(30))";
  try {
   // created connection to db
   con = new CreateConnection().getConnection("checkjdbc", "root",
     "root");

   // obtained a statement object to execute the required query
   stmt = con.createStatement();

   // executed the query on obtained statement
   stmt.execute(query);
   System.out.println("Table created !");
  } catch (SQLException e1) {
   e1.printStackTrace();
  } finally {

   if (stmt != null) {
    try {
     // close statement to free the resources
     stmt.close();
    } catch (SQLException e) {
     e.printStackTrace();
    }
   }
   if (con != null) {
    try {
     // closed the connection to db
     con.close();
    } catch (SQLException e) {
     e.printStackTrace();
    }
   }

  }
 }
}
___________________________________________________________________________

//Create a connection in JDBC code
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class CreateConnection {

 // defining driver name, mysql-jdbc driver in this case
 String driverName = "com.mysql.jdbc.Driver";
 Connection con = null;

 // database url string with hostname and port on which db is running
 String url = "jdbc:mysql://localhost:3306/";

 public Connection getConnection(String dbName, String username,
   String password) {

  // creating connection url
  String connectionUrl = url + dbName;

  try {
   // registers the specified driver class into memory
   Class.forName(driverName);
  } catch (ClassNotFoundException e) {
   e.printStackTrace();
  }

  try {
   // returns a connection objcet by selecting an appropriate driver
   // for specified connection URL
   con = DriverManager
     .getConnection(connectionUrl, username, password);
  } catch (SQLException e) {
   e.printStackTrace();
  }
  return con;
 }
}
public class Implementation {

 public static void main(String args[]) {

  CreateTable createTable = new CreateTable();
  createTable.createTable();

  Student student = new Student();
  student.setId(1);
  student.setFirstName("ankush");
  student.setLastName("thakur");
  student.setEmail("beingjavaguy@gmail.com");
  student.setPhone("8987676754");

  InsertData insertData = new InsertData();
  insertData.insertData(student);
 }
}

______________________________________________________________________________--

package com.beingjavaguys.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
 public void deleteData(int id) {

  Statement stmt = null;
  Connection con = null;

  String query = "delete from user where id=" + id;
  try {
   con = new CreateConnection().getConnection("checkjdbc", "root",
     "root");
   stmt = con.createStatement();
   stmt.execute(query);
   System.out.println("Data deleted for id = " + id + " !");
  } catch (SQLException e1) {
   e1.printStackTrace();
  } finally {

   if (stmt != null) {
    try {
     stmt.close();
    } catch (SQLException e) {
     e.printStackTrace();
    }
   }
   if (con != null) {
    try {
     con.close();
    } catch (SQLException e) {
     e.printStackTrace();
    }
   }

  }
 }
}

______________________________________________________________________________________________



