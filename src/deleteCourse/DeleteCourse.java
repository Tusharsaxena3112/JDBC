package deleteCourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCourse {
    public void deleteCourse(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE from courses where courseName = ");
        preparedStatement.executeQuery();

        System.out.println("Successfully Deleted...");
    }
}
