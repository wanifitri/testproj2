package jsrcrud;


import java.sql.SQLException;
import java.util.Scanner;


public class JSRCreate {

	    JSRCreate() throws SQLException {
	        
	    	Scanner userInput = new Scanner(System.in);
	        System.out.println("You selected option 1: Create database record: ");
	        
	        String id;
	        System.out.println("Please enter employee id: ");
	        id = userInput.next();

	        
	        String first;
	        System.out.println("Please enter employee first : ");
	        first = userInput.next();
	        
	        String last;
	        System.out.println("Please enter employee last : ");
	        last = userInput.next();

	        
	        String age;
	        System.out.println("Please enter employee age: ");
	        age = userInput.next();


	       
	        JSRDb dbUt = new JSRDb();
	        
	        String sql_stmt = "INSERT INTO employee (id, first, last, age) VALUES ('" + id + "','" +  first + "','"+ last +"','" + age + "')";
	        
	        dbUt.ExecuteSQLStatement(sql_stmt);
	        
	        
	        JSRMainSql.DisplayMenu();
	    }
	}
