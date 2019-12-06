package courses;

public class Courses {
    private String courseName;
    private int courseID;
    private int courseDuration;
    private double courseCost;
    private String courseCode;

    public Courses(int courseID, String courseName, String courseCode, int courseDuration, double courseCost) {
        this.courseCode = courseCode;
        this.courseCost = courseCost;
        this.courseDuration = courseDuration;
        this.courseID = courseID;
        this.courseName = courseName;
    }
}
