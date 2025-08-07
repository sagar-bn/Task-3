import java.util.List;
import java.util.ArrayList;

public class User {
   private int userId;
    private String name;
    private LibraryCard card;
   

private List<Book> borrowedBooks= new ArrayList<>();

public User(int userId, String name, LibraryCard card) {
        this.userId = userId;
        this.name = name;
        this.card = card;
    }
      public int getUserId() { return userId; }
    public String getName() { return name; }
  
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean hasBook(Book book) {
        return borrowedBooks.contains(book);
    }
    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + " borrowed:");
            for (Book book : borrowedBooks) {
                System.out.println(" - " + book.getTitle());
            }
        }
      }
     public String toString() {
        return "User ID: " + userId + ", Name: " + name + ", " + card;
    }  
  
  }