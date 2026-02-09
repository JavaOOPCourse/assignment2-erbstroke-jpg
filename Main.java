import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("Enter books' name");
                    String titleb = scanner.nextLine();
                    System.out.println("Enter books' author");
                    String authorb = scanner.nextLine();
                    System.out.println("Enter books' year");
                    int yearb = scanner.nextInt();
                    scanner.nextLine();
                    Book bookb = new Book(titleb, authorb, yearb);
                    library.addBook(bookb);
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Enter E-book's title:");
                    String eTitle = scanner.nextLine();
                    System.out.println("Enter E-book's author:");
                    String eAuthor = scanner.nextLine();
                    System.out.println("Enter E-book's year:");
                    int eYear = scanner.nextInt();
                    System.out.println("Enter file size (MB):");
                    double fileSize = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    EBook newEbook = new EBook(eTitle,eAuthor,eYear,fileSize);
                    library.addBook(newEbook);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("Enter your books' title");
                    String sTitle = scanner.nextLine();
                    library.searchByTitle(sTitle);
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Enter your books' title");
                    sTitle = scanner.nextLine();
                    library.borrowBook(sTitle);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Enter your books' title");
                    sTitle = scanner.nextLine();
                    library.returnBook(sTitle);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
