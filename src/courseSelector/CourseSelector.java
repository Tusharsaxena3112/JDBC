package courseSelector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CourseSelector {
    public boolean selectCourse(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM courses WHERE courseName = ?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course Name:");
        String name = scanner.nextLine();
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.printf("%d\t%s\t%s\t%d\t%f\n", resultSet.getInt("courseID"),
                    resultSet.getString("courseName"),
                    resultSet.getString("courseCode"),
                    resultSet.getInt("courseDuration"),
                    resultSet.getDouble("courseCost"));
        }
        return resultSet.next();
    }
}
