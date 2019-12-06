package insertCourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCourse {
    public boolean addNewCourseInDatabase(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO courses VALUES (?,?,?,?,?)");
    }
}
