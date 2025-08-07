
public class LibraryCard {
    private int cardNumber;
    private String issueDate;

    public LibraryCard(int cardNumber, String issueDate) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
    }

    public String toString() {
        return "Card No: " + cardNumber + ", Issued: " + issueDate;
    }
}
