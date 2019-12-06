package connection;

import courseSelector.CourseSelector;
import deleteCourse.DeleteCourse;
import getCourses.GetCourse;
import insertCourse.InsertCourse;

import java.sql.SQLException;

public class DatabaseMain {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection db = new DataBaseConnection();
        InsertCourse insertCourse = new InsertCourse();
        GetCourse getCourse = new GetCourse();
        CourseSelector courseSelector = new CourseSelector();
        DeleteCourse deleteCourse = new DeleteCourse();
//        System.out.println(db.attemptConnection());

//        if (insertCourse.addNewCourseInDatabase(DataBaseConnection.getConnection())) {
//            System.out.println("SuccessFully Inserted...");
//        }
//        getCourse.getCourse(DataBaseConnection.getConnection());
//        courseSelector.selectCourse(DataBaseConnection.getConnection());
        deleteCourse.deleteCourse(DataBaseConnection.getConnection());

    }


}
