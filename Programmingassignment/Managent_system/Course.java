public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private int enrolledCount;
    private static int totalEnrolledStudents = 0;

    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledCount = 0;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getMaxCapacity() { return maxCapacity; }

    public boolean addStudent() {
        if (enrolledCount < maxCapacity) {
            enrolledCount++;
            totalEnrolledStudents++;
            return true;
        }
        return false;
    }

    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }
}
