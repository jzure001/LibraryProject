import java.util.Map;
//interface done by Chris
interface LibraryUserInterface {
    // returns user's first name
    public String getUserFirstName();

    // sets user's first name
    public void setUserFirstName(String userFirstName);

    // returns user's last name
    public String getUserLastName();

    // sets user's last name
    public void setUserLastName(String userLastName);

    // returns map containing user's borrowing history
    public Map<String, Book> getBorrowingHistory();

    // adds to user's borrowing history map
    public void addToBorrowingHistory(Book book);

    // removes book from user's borrowing history map
    public void removeFromBorrowingHistory(String bookId);

    // puts borrowing history to string and returns string
    public String getRentedBooksList();
}