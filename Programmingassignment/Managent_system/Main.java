import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student("John Doe", "S101");

        while (true) {
            System.out.println("\n=== Course Management Menu ===");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate Overall Grade");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter course code: ");
                    String code = input.next();
                    System.out.print("Enter course name: ");
                    String name = input.next();
                    System.out.print("Enter max capacity: ");
                    int capacity = input.nextInt();
                    CourseManagement.addCourse(code, name, capacity);
                    break;
                case 2:
                    System.out.print("Enter course code to enroll: ");
                    String enrollCode = input.next();
                    for (Course c : CourseManagement.getCourses()) {
                        if (c.getCourseCode().equals(enrollCode)) {
                            CourseManagement.enrollStudent(student, c);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter course code: ");
                    String gradeCode = input.next();
                    System.out.print("Enter grade: ");
                    double grade = input.nextDouble();
                    for (Course c : CourseManagement.getCourses()) {
                        if (c.getCourseCode().equals(gradeCode)) {
                            CourseManagement.assignGrade(student, c, grade);
                        }
                    }
                    break;
                case 4:
                    CourseManagement.calculateOverallGrade(student);
                    System.out.println("Total enrolled students: " + Course.getTotalEnrolledStudents());
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
