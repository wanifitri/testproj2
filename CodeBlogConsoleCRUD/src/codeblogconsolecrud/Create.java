package codeblogconsolecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

    Create() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 1: Create database record: ");
        String name;
        System.out.println("Enter contact name: ");
        name = userInput.next();

        String email;
        System.out.println("Enter contact email: ");
        email = userInput.next();

        String contact_number;
        System.out.println("Enter contact number: ");
        contact_number = userInput.next();
       
        DBUtilities dbUtilities = new DBUtilities();
        
        String sql_stmt = "INSERT INTO contacts (name,email,contact_number) VALUES ('" + name + "','" + email + "','" + contact_number + "')";
        
        dbUtilities.ExecuteSQLStatement(sql_stmt);
        
        
        CodeBlogConsoleCRUD.DisplayMenu();
    }
}