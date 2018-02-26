package jsrcrud;

import java.sql.SQLException;
import java.util.Scanner;


public class JSRMainSql {

    public static void main(String[] args) throws SQLException {
        DisplayMenu();
    }

    public static void DisplayMenu() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        String READ_MENU;

        // Display menu graphics
        System.out.println("------------------------------------");
        System.out.println("|   WELCOME TO JSR RENO DB         |");
        System.out.println("--------------------------------------");
        System.out.println("| Options:                              |");
        System.out.println("|        1. Create Database Records     |");
        System.out.println("|        2. Read Database Records       |");
        System.out.println("|        3. Update Database Records     |");
        System.out.println("|        4. Delete Database Records     |");
        System.out.println("|        5. Exit                        |");
        System.out.println("------------------------------------------");

        System.out.print("Select option: ");

        READ_MENU = userInput.next();

//display menu based on user selection
        switch (READ_MENU) {
            case "1":
                JSRCreate create = new JSRCreate();
                break;
            case "2":
                JSRRead read = new JSRRead();
                break;
                /*
            case "3":
            	JSRUpdate update = new JSRUpdate();
                break;
            case "4":
            	JSRDelete delete = new JSRDelete();
                break;
                */
                
                
             
      
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection");
                break; 
        }
    }
}