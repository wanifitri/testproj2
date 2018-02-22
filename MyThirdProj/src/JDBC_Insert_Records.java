//STEP 1. Import required packages
import java.sql.*;

public class JDBC_Insert_Records {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/jsr";

   //  Database credentials
   static final String USER = "wani";
   static final String PASS = "wanifitri1@";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO employee " +
                   "VALUES (001, 'ismail', 'ahmad', 19)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES (002, 'aslam', 'akbar', 25)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES (003, 'Zyad', 'hamzah', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES(004, 'faezul', 'fitri', 26)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES(005, 'syafiq', 'fouzi', 26)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample
