package connection;

import java.sql.SQLException;

public class DatabaseMain {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection db = new DataBaseConnection();
        System.out.println(db.attemptConnection());
    }


}
