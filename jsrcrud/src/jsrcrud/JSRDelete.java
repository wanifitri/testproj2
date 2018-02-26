package jsrcrud;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class JSRDelete{

	      JSRDelete() throws SQLException {
	          Scanner userInput = new Scanner(System.in);
	          System.out.println("You selected option 4: Delete database record: ");

	          String id;
	          System.out.println("Enter customer id to delete: ");
	          id = userInput.next();

	          //retrieve record to update
	          DisplayRecord(id);

	          /*String confirm_delete;
	          System.out.println("Enter Y to confirm deletion: ");
	          confirm_delete = userInput.next();

	          if ("Y".equals(confirm_delete))*/ {
	              JSRDb dbUt = new JSRDb();

	              String sql_stmt = "DELETE FROM employee WHERE id = " + id;

	              dbUt.ExecuteSQLStatement(sql_stmt);
	              
	              System.out.println("The Record has successfully being deleted");
	          }

	          JSRMainSql.DisplayMenu();
	      }

	      private void DisplayRecord(String id) throws SQLException {
	          try {
	              JSRDb dbUt = new JSRDb();

	              String sql_stmt = "SELECT first, last, age FROM employee WHERE id = " + id;
	              ResultSet resultSet = dbUt.ReadRecords(sql_stmt);

	              // process query results
	              if (resultSet.next()) {

	                  ResultSetMetaData metaData = resultSet.getMetaData();
	                  int numberOfColumns = metaData.getColumnCount();
	                  System.out.print("Database Records Listingn");

	                  for (int i = 1; i <= numberOfColumns; i++) {
	                      System.out.printf("%-8st", metaData.getColumnName(i));
	                  }
	                  System.out.println();

	                  do {
	                      for (int i = 1; i <= numberOfColumns; i++) {
	                          System.out.printf("%-8st", resultSet.getObject(i));
	                      }
	                      System.out.println();
	                  } while (resultSet.next());

	                  System.out.println();

	              } else {
	                  System.out.println("No database records foundn");
	              }

	              //close db connection
	              dbUt.DisconnectFromDB();
	          } catch (SQLException ex) {
	              System.out.println("The following error has occured: " + ex.getMessage());
	          } 
	      }
	  }
