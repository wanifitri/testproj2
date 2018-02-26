package jsrcrud;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class JSRUpdate {


	    JSRUpdate() throws SQLException {
	        Scanner userInput = new Scanner(System.in);
	        System.out.println("You selected option 3: Update database record: ");

	        String customer_id;
	        System.out.println("Enter customer id to update: ");
	        customer_id = userInput.next();

	        //retrieve record to update
	        DisplayRecord(customer_id);
	        
	        String id;
	        System.out.println("Enter id number of employee: ");
	        id = userInput.next();
	        
	        String firstname;
	        System.out.println("Enter first name of employee: ");
	        firstname = userInput.next();

	        String age;
	        System.out.println("Enter contact email: ");
	        age = userInput.next();


	        JSRDb dbUt = new JSRDb();

	        String sql_stmt = "UPDATE employee SET firstname = '" + firstname + "',age = '" + age +  "' WHERE id = " + customer_id;

	        dbUt.ExecuteSQLStatement(sql_stmt);

	        System.out.println("The Record has successfully being deleted");

	        JSRMainSql.DisplayMenu();
	    }

	    private void DisplayRecord(String id) throws SQLException {
	        try {
	            JSRDb dbUt = new JSRDb();

	            String sql_stmt = "SELECT  firstname, age FROM employee WHERE id = " + id ;
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