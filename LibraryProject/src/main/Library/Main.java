import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);
    private static Library library = new Library();


    public static void main(String[] args) {
        String userFirstName;
        String userLastName;
        int menuOption = 1;
        

        while(menuOption != 0) {
            System.out.println("Choose menu option:");
            System.out.println("0: Quit");
            System.out.println("1. New Sign Up");
            System.out.println("2. Registered Users");
            System.out.println("3. Book Management");
            menuOption = keyboard.nextInt();

            switch (menuOption) {
                case 0:
                    System.out.println("Thank you for visiting our library, come again!");
                    break;
                case 1:
                    newSignUp();
                    break;
                case 2:
                    registeredUser();
                    break;
                case 3:
                    manageBooks();
                default:
                    System.out.println("Please enter one of the menu options!");
                    break;
    
            }
        }

        


    }

    public static void bookRental(String bookName, int userId) {
        Book book= library.searchBook(bookName);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (! library.isUserRegistered(userId)) {
            System.out.println("User not registered.");
            return;
        }

        if (book.isRented()) {
            System.out.println("Book is currently rented. Returning book.");
            book.setRented(false);
        } else {
            System.out.println("Renting book to user.");
            book.setRented(true);
        }
    }

        //TODO: set up rental return and new rental menu


    public static void newSignUp() {
        String userFirstName;
        String userLastName;
        int userId; 

        System.out.println("What is users first name?");
        userFirstName= keyboard.nextLine();
        System.out.println("What is users last name?");
        userLastName=keyboard.nextLine();
        LibraryUser newUser = new LibraryUser(userFirstName, userLastName);

        do{
            System.out.println("Enter a unique user ID: ");
            userId= keyboard.nextInt();
            keyboard.nextLine();
        }
        while (library.isUserRegistered(userId));

        library.registerUser(userId, userFirstName, userLastName);
        System.out.println("User registered successfully.");

        registeredUser(userId);

    }

    public static void registeredUser(int userId) {
        //TODO: search for registered user in database and take to rental

    }
}

    public static void manageBooks() {
        int option;
        do {
            System.out.println("Choose an option:");
            System.out.println("1: Add a book");
            System.out.println("2: Remove a book");
            System.out.println("0: Back to the main menu");
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    break;
            }
        } while (option != 0);
    }

    public static void addBook() {
        String bookId;
        String bookDescription;

        System.out.print("Enter the book ID: ");
        bookId = keyboard.nextLine();

        if (library.searchBook(bookId) != null) {
            System.out.println("A book with this ID already exists. Please try again.");
            return;
        }

        System.out.print("Enter the book description: ");
        bookDescription = keyboard.nextLine();

        library.addBook(bookId, bookDescription);
        System.out.println("Book added successfully.");
    }

    public static void removeBook() {
        String bookId;

        System.out.print("Enter the book ID to remove: ");
        bookId = keyboard.nextLine();

        if (library.searchBook(bookId) == null) {
            System.out.println("No book found with this ID. Please try again.");
            return;
        }

        library.removeBook(bookId);
        System.out.println("Book removed successfully.");
    }

}