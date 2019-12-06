package deleteCourse;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteCourse {
    public void deleteCourse(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course to be deleted :");
        String course = scanner.nextLine();
        Statement preparedStatement = connection.createStatement();
//        preparedStatement.setString(1,course);
        String sql = "DELETE from courses where courseName='dbms' ";
        System.out.println(preparedStatement.executeUpdate(sql));

        System.out.println("Successfully Deleted...");
    }
}
