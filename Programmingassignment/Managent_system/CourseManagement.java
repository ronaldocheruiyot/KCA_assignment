import java.util.ArrayList;

public class CourseManagement {
    private static ArrayList<Course> courses = new ArrayList<>();

    public static void addCourse(String code, String name, int capacity) {
        Course course = new Course(code, name, capacity);
        courses.add(course);
        System.out.println("Course added: " + name);
    }

    public static void enrollStudent(Student student, Course course) {
        student.enrollCourse(course);
    }

    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
    }

    public static void calculateOverallGrade(Student student) {
        double avg = student.calculateOverallGrade();
        System.out.println("Overall grade for " + student.getName() + ": " + avg);
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }
}
