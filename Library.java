import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void borrowBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null || book == null) {
            System.out.println("Invalid User ID or Book ID.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.borrow();
        user.borrowBook(book);
        System.out.println(user.getName() + " borrowed \"" + book.getTitle() + "\".");
    }

    public void returnBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null || book == null) {
            System.out.println("Invalid User ID or Book ID.");
            return;
        }

        if (!user.hasBook(book)) {
            System.out.println(user.getName() + " has not borrowed \"" + book.getTitle() + "\".");
            return;
        }

        book.returnBook();
        user.returnBook(book);
        System.out.println(user.getName() + " returned \"" + book.getTitle() + "\".");
    }

    public User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

}
