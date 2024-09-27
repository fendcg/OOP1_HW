package lab1;
import lab1.*;
public class lab1_Course {
    private String courseName;
    private String courseCode;
    private String courseDescription;
    private int courseCredits;
    private lab1_Course[] prerequisites;
    public lab1_Course(String courseName, String courseCode, String courseDescription, int courseCredits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
    }
    public lab1_Course(String courseName, String courseCode, String courseDescription, int courseCredits, lab1_Course[] prerequisites) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
        this.prerequisites = prerequisites;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public int getCourseCredits() {
        return courseCredits;
    }
    public lab1_Course[] getPrerequisites() {
        return prerequisites;
    }

}
