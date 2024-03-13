package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// TODO: Username and Password

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/yourDatabaseName";
    private static final String USER = "yourUsername";
    private static final String PASSWORD = "yourPassword";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
