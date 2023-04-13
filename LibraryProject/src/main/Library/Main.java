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

    }

    public static void newSignUp() {
        String userFirstName;
        String userLastName;

        System.out.println("What is users first name?");
        System.out.println("What is users last name?");
        LibraryUser newUser = new LibraryUser(userFirstName, userLastName);

        //TODO: add user to database and then to registeredUser() to continue

    }

    public static void registeredUser() {
        //TODO: search for registered user in database and take to rental

    }
}
