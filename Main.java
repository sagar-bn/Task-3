import java.util.Scanner;


public class Main {
public static void main(String[] args) {


  Library library = new Library();
   library.addBook(new Book(1, "Clean Code", "Robert C. Martin"));
    library.addBook(new EBook(2, "Java Basics", "James Gosling", "PDF"));
  LibraryCard libraryCard1= new LibraryCard(5001, "01-Aug-2025");
    library.addUser(new User(101, "Alice",libraryCard1 ));
    library.addUser(new User(102, "Bob", new LibraryCard(5002, "05-Aug-2025")));

  
  Scanner sc=new Scanner(System.in);
   while (true) {
            System.out.println("\n1. List Books\n2. List Users\n3. Borrow Book\n4. Return Book\n5. View Borrowed Books\n6. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.listBooks();
                case 2 -> library.listUsers();
                case 3 -> {
                    System.out.print("Enter your User ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter Book ID to borrow: ");
                    int bookId = sc.nextInt();
                    library.borrowBook(userId, bookId);
                }
                case 4 -> {
                    System.out.print("Enter your User ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter Book ID to return: ");
                    int bookId = sc.nextInt();
                    library.returnBook(userId, bookId);
                }
                case 5 -> {
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    User user = library.findUserById(userId);
                    if (user != null) user.listBorrowedBooks();
                    else System.out.println("User not found.");
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
  

