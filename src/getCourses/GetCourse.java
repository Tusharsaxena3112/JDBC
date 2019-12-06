package getCourses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetCourse {
    public boolean getCourse(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");
        while (resultSet.next()) {
            System.out.printf("%d\t\t%s\t\t%s\t\t%d\t\t%f\n", resultSet.getInt("courseID"),
                    resultSet.getString("courseName"),
                    resultSet.getString("courseCode"),
                    resultSet.getInt("courseDuration"),
                    resultSet.getDouble("courseCost"));
        }
        return resultSet.next();
    }
}
