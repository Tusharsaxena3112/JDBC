package insertCourse;

import courses.Courses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertCourse {
    public boolean addNewCourseInDatabase(Connection connection) throws SQLException {
        boolean isAdded = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter courseName:");
        String name = scanner.nextLine();
        System.out.println("Enter courseID:");
        int courseId = scanner.nextInt();
        System.out.println("Enter courseDuration:");
        int duration = scanner.nextInt();
        System.out.println("Enter courseCost");
        double cost = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter courseCode:");
        String code = scanner.nextLine();
        Courses courses = new Courses(courseId, name, code, duration, cost);
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO courses VALUES (?,?,?,?,?)");
        preparedStatement.setInt(1, courses.getCourseID());
        preparedStatement.setString(2, courses.getCourseName());
        preparedStatement.setString(3, courses.getCourseCode());
        preparedStatement.setInt(4, courses.getCourseDuration());
        preparedStatement.setDouble(5, courses.getCourseCost());

        int rows = preparedStatement.executeUpdate();
        if (rows != 0) {
            isAdded = true;
        }

        return isAdded;
    }
}
