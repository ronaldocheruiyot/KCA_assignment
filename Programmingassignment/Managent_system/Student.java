import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Course> enrolledCourses;
    private Map<String, Double> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public ArrayList<Course> getEnrolledCourses() { return enrolledCourses; }

    // Enroll in a course
    public void enrollCourse(Course course) {
        if (course.addStudent()) {
            enrolledCourses.add(course);
            System.out.println(name + " enrolled in " + course.getCourseName());
        } else {
            System.out.println("Enrollment failed: Course is full.");
        }
    }

    // Assign a grade
    public void assignGrade(Course course, double grade) {
        grades.put(course.getCourseCode(), grade);
        System.out.println("Grade " + grade + " assigned to " + name + " for " + course.getCourseName());
    }

    // Calculate overall average grade
    public double calculateOverallGrade() {
        if (grades.isEmpty()) return 0.0;
        double total = 0;
        for (double g : grades.values()) total += g;
        return total / grades.size();
    }
}
