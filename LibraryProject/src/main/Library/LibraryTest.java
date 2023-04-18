public class LibraryTest {

    public static void main(String[] args) {
        testLibraryUserCreation();
        testLibraryBookCreation();
        testLibraryUserRegistration();
        testLibraryBookSearch();
        testLibraryBookRemoval();
        System.out.println("All tests passed.");
    }

    public static void testLibraryUserCreation() {
        LibraryUser user = new LibraryUser("John", "Doe");
        assert user.getUserFirstName().equals("John") : "User first name incorrect";
        assert user.getUserLastName().equals("Doe") : "User last name incorrect";
    }

    public static void testLibraryBookCreation() {
        Book book = new Book("1234", "Introduction to Java");
        assert book.getId().equals("1234") : "Book ID incorrect";
        assert book.getDescription().equals("Introduction to Java") : "Book description incorrect";
        assert !book.isRented() : "Book rental status incorrect";
    }

    public static void testLibraryUserRegistration() {
        Library library = new Library();
        library.registerUser(1, "John", "Doe");
        assert library.isUserRegistered(1) : "User registration failed";
        assert !library.isUserRegistered(2) : "False user registration detected";
    }

    public static void testLibraryBookSearch() {
        Library library = new Library();
        library.addBook("1234", "Introduction to Java");
        Book book = library.searchBook("1234");
        assert book != null : "Book search failed";
        assert book.getId().equals("1234") : "Book ID incorrect";
        assert book.getDescription().equals("Introduction to Java") : "Book description incorrect";
    }

    public static void testLibraryBookRemoval() {
        Library library = new Library();
        library.addBook("1234", "Introduction to Java");
        library.removeBook("1234");
        assert library.searchBook("1234") == null : "Book removal failed";
    }
}
