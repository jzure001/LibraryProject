import java.util.Map;
//interface done by Chris
interface LibraryUserInterface {
    // returns user's first name
    String getUserFirstName();

    // sets user's first name
     void setUserFirstName(String userFirstName);

    // returns user's last name
     String getUserLastName();

    // sets user's last name
     void setUserLastName(String userLastName);

    // returns map containing user's borrowing history
     Map<String, Book> getBorrowingHistory();

    // adds to user's borrowing history map
     void addToBorrowingHistory(Book book);

    // removes book from user's borrowing history map
     void removeFromBorrowingHistory(String bookId);

    // puts borrowing history to string and returns string
     String getRentedBooksList();
}