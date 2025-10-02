import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Track score
        int correctAnswers = 0;
        int totalQuestions = 5;

        // Intro message
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("Answer the following questions by typing A, B, C, or D.\n");

        // ================= Question 1 =================
        System.out.println("1. Which data type is used to store whole numbers in Java?");
        System.out.println("A. double");
        System.out.println("B. int");
        System.out.println("C. boolean");
        System.out.println("D. char");
        char answer1 = scanner.next().toUpperCase().charAt(0);  // take first char in uppercase

        // Use if statement for checking
        if (answer1 == 'B') {
            correctAnswers++;
        }

        // ================= Question 2 =================
        System.out.println("\n2. Which keyword is used to create a class in Java?");
        System.out.println("A. class");
        System.out.println("B. define");
        System.out.println("C. new");
        System.out.println("D. struct");
        char answer2 = scanner.next().toUpperCase().charAt(0);

        // Use switch statement for checking
        switch (answer2) {
            case 'A':
                correctAnswers++;
                break;
        }

        // ================= Question 3 =================
        System.out.println("\n3. What is the size of a boolean variable in Java?");
        System.out.println("A. 1 bit (not precisely defined)");
        System.out.println("B. 8 bits");
        System.out.println("C. 16 bits");
        System.out.println("D. 32 bits");
        char answer3 = scanner.next().toUpperCase().charAt(0);

        if (answer3 == 'A') {
            correctAnswers++;
        }

        // ================= Question 4 =================
        System.out.println("\n4. Which method is the entry point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. init()");
        System.out.println("C. main()");
        System.out.println("D. run()");
        char answer4 = scanner.next().toUpperCase().charAt(0);

        switch (answer4) {
            case 'C':
                correctAnswers++;
                break;
        }

        // ================= Question 5 =================
        System.out.println("\n5. Which operator is used to compare two values in Java?");
        System.out.println("A. ==");
        System.out.println("B. =");
        System.out.println("C. !=");
        System.out.println("D. >=");
        char answer5 = scanner.next().toUpperCase().charAt(0);

        if (answer5 == 'A') {
            correctAnswers++;
        }

        // ================= Final Score =================
        double percentage = (correctAnswers / (double) totalQuestions) * 100;
        System.out.println("\nQuiz finished!");
        System.out.println("You got " + correctAnswers + " out of " + totalQuestions + " correct.");
        System.out.println("Final Score: " + percentage + "%");

        // Close scanner
        scanner.close();
    }
}
