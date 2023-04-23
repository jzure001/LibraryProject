import Raffle.Raffle;
//John Zurek created test class
public class LibraryTest {

    public static void main(String[] args) {
        testLibraryUserCreation();
        testLibraryBookCreation();
        testLibraryUserRegistration();
        testLibraryBookSearch();
        testLibraryBookRemoval();
        testRaffleCheckWinner();
        testRafflePutDuplicate();
        testRaffleTreeStructure();
        System.out.println("All tests passed.");
    }

    //test user creation
    public static void testLibraryUserCreation() {
        LibraryUser user = new LibraryUser("John", "Doe");
        assert user.getUserFirstName().equals("John") : "User first name incorrect";
        assert user.getUserLastName().equals("Doe") : "User last name incorrect";
    }

    // test book creation
    public static void testLibraryBookCreation() {
        Book book = new Book("1234", "Introduction to Java");
        assert book.getId().equals("1234") : "Book ID incorrect";
        assert book.getDescription().equals("Introduction to Java") : "Book description incorrect";
        assert !book.isRented() : "Book rental status incorrect";
    }
    //registered user test
    public static void testLibraryUserRegistration() {
        Library library = new Library();
        library.registerUser(1, "John", "Doe");
        assert library.isUserRegistered(1) : "User registration failed";
        assert !library.isUserRegistered(2) : "False user registration detected";
    }
    //search for created book
    public static void testLibraryBookSearch() {
        Library library = new Library();
        library.addBook("1234", "Introduction to Java");
        Book book = library.searchBook("1234");
        assert book != null : "Book search failed";
        assert book.getId().equals("1234") : "Book ID incorrect";
        assert book.getDescription().equals("Introduction to Java") : "Book description incorrect";
    }
    //remove created book
    public static void testLibraryBookRemoval() {
        Library library = new Library();
        library.addBook("1234", "Introduction to Java");
        library.removeBook("1234");
        assert library.searchBook("1234") == null : "Book removal failed";
    }

    public static void testRaffleCheckWinner() {
        Raffle raffle = new Raffle();

        // Add names and raffle numbers to the tree
        raffle.put("Samantha", 1);
        raffle.put("Alex", 2);
        raffle.put("Benjamin", 3);

        // Test checkWinner method with different inputs
        String winnerMessage1 = raffle.checkWinner(raffle.getRoot(), 1, 1);
        assert winnerMessage1.contains("Congratulations") : "checkWinner failed when raffle number is the winner";

        String winnerMessage2 = raffle.checkWinner(raffle.getRoot(), 1, 2);
        assert winnerMessage2.contains("Sorry") : "checkWinner failed when raffle number is not the winner";

        String winnerMessage3 = raffle.checkWinner(raffle.getRoot(), 4, 1);
        assert winnerMessage3.contains("Error") : "checkWinner failed when raffle number is not in the tree";
    }

    public static void testRafflePutDuplicate() {
        Raffle raffle = new Raffle();

        raffle.put("Samantha", 1);
        raffle.put("Alex", 1);

        String winnerMessage = raffle.checkWinner(raffle.getRoot(), 1, 1);
        assert winnerMessage.contains("Congratulations") && winnerMessage.contains("Samantha") : "put method failed when handling duplicate raffle numbers";
    }

    public static void testRaffleTreeStructure() {
        Raffle raffle = new Raffle();

        raffle.put("Samantha", 1);
        raffle.put("Alex", 2);
        raffle.put("Benjamin", 3);

        assert raffle.getRaffleNumber(raffle.getRoot()) == 1 : "Tree root is incorrect";
        assert raffle.getRaffleNumber(raffle.getRightChild(raffle.getRoot())) == 2 : "Tree structure is incorrect";
        assert raffle.getRaffleNumber(raffle.getRightChild(raffle.getRightChild(raffle.getRoot()))) == 3 : "Tree structure is incorrect";
    }


}
