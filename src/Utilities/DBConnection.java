/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.1.0
 * @since 1.0.0
 */

package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Uh This May Be Unneccessary Due To Having DB Connection In Import
// Also Uh, We Can't Hardcode String Stuff (User And Pass Ran Througg GUI)
// TODO: Username and Password

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/yourDatabaseName";
    private static final String USER = "yourUsername";
    private static final String PASSWORD = "yourPassword";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
