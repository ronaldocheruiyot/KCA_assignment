import java.util.Scanner;

class StudentManagement {
    static int totalStudents = 0;
    static final int MAX_STUDENTS = 100;
    static String[] studentNames = new String[MAX_STUDENTS];
    static String[] studentIDs = new String[MAX_STUDENTS];
    static int[] studentAges = new int[MAX_STUDENTS];
    static String[] studentGrades = new String[MAX_STUDENTS];

    // Add new student
    public static void addStudent(String name, String id, int age, String grade) {
        if (totalStudents < MAX_STUDENTS) {
            studentNames[totalStudents] = name;
            studentIDs[totalStudents] = id;
            studentAges[totalStudents] = age;
            studentGrades[totalStudents] = grade;
            totalStudents++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Error: Maximum student limit reached!");
        }
    }

    // Update student details
    public static void updateStudent(String id, String newName, int newAge, String newGrade) {
        for (int i = 0; i < totalStudents; i++) {
            if (studentIDs[i].equals(id)) {
                studentNames[i] = newName;
                studentAges[i] = newAge;
                studentGrades[i] = newGrade;
                System.out.println("Student record updated successfully.");
                return;
            }
        }
        System.out.println("Error: Student with ID " + id + " not found.");
    }

    // View student details
    public static void viewStudent(String id) {
        for (int i = 0; i < totalStudents; i++) {
            if (studentIDs[i].equals(id)) {
                System.out.println("Student ID: " + studentIDs[i]);
                System.out.println("Name: " + studentNames[i]);
                System.out.println("Age: " + studentAges[i]);
                System.out.println("Grade: " + studentGrades[i]);
                return;
            }
        }
        System.out.println("Error: Student with ID " + id + " not found.");
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. View Student Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    StudentManagement.addStudent(name, id, age, grade);
                    break;
                case 2:
                    System.out.print("Enter Student ID to update: ");
                    String updateID = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Grade: ");
                    String newGrade = scanner.nextLine();
                    StudentManagement.updateStudent(updateID, newName, newAge, newGrade);
                    break;
                case 3:
                    System.out.print("Enter Student ID to view: ");
                    String viewID = scanner.nextLine();
                    StudentManagement.viewStudent(viewID);
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
