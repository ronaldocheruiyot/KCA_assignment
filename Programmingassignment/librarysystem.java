import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
    String title;
    String author;
    int quantity;

    Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
}

public class LibrarySystem {
    private static Map<String, Book> library = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Library System ======");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addBooks();
                    break;
                case 2:
                    borrowBooks();
                    break;
                case 3:
                    returnBooks();
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }

    private static void addBooks() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number for quantity.");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        scanner.nextLine();

        if (library.containsKey(title)) {
            library.get(title).quantity += quantity;
            System.out.println("Quantity updated for existing book: " + title);
        } else {
            library.put(title, new Book(title, author, quantity));
            System.out.println("New book added: " + title);
        }
    }

    private static void borrowBooks() {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        if (!library.containsKey(title)) {
            System.out.println("Book not found in library.");
            return;
        }

        System.out.print("Enter number of books to borrow: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        int borrowQty = scanner.nextInt();
        scanner.nextLine();

        Book book = library.get(title);
        if (book.quantity >= borrowQty) {
            book.quantity -= borrowQty;
            System.out.println("Borrow successful! " + borrowQty + " copy/copies of \"" + title + "\" borrowed.");
        } else {
            System.out.println("Not enough copies available. Current stock: " + book.quantity);
        }
    }

    private static void returnBooks() {
        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();
        if (!library.containsKey(title)) {
            System.out.println("This book does not belong to the library system.");
            return;
        }

        System.out.print("Enter number of books to return: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        int returnQty = scanner.nextInt();
        scanner.nextLine();

        Book book = library.get(title);
        book.quantity += returnQty;
        System.out.println("Return successful! " + returnQty + " copy/copies of \"" + title + "\" returned.");
    }
}
