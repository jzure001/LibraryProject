import java.util.HashMap;
import java.util.Map;
//Library user created by Roberto Solorzano
public class LibraryUser implements LibraryUserInterface {
    private String userFirstName;
    private String userLastName;
    private Map<String, Book> borrowingHistory;

    public LibraryUser(String userFirstName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.borrowingHistory = new HashMap<>();
    }

    public String getUserFirstName() {
        return userFirstName;
    }
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    public Map<String, Book> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void addToBorrowingHistory(Book book) {
        borrowingHistory.put(book.getId(), book);
    }

    public void removeFromBorrowingHistory(String bookId) {
        borrowingHistory.remove(bookId);
    }

    public String getRentedBooksList() {
        StringBuilder rentedBooks = new StringBuilder();
        for (Book book : borrowingHistory.values()) {
            rentedBooks.append("Book ID: ").append(book.getId()).append(", Description: ").append(book.getDescription()).append("\n");
        }
        return rentedBooks.toString();
    }

}
