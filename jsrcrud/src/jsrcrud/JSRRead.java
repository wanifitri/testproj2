package jsrcrud;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JSRRead {


    public JSRRead() throws SQLException {
        System.out.println("You selected option 2: Read database record");
        DisplayResults();
    }

    private void DisplayResults() throws SQLException {
        try {
            JSRDb dbUt = new JSRDb();

            String sql_stmt = "SELECT id, age, first FROM employee";
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
        } finally {
            JSRMainSql.DisplayMenu();
        }
    }
}
