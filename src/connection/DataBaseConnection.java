package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public boolean attemptConnection() throws SQLException {
        boolean isConnected = false;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        if (connection != null) {
            isConnected = true;
        }
        return isConnected;
    }

}
