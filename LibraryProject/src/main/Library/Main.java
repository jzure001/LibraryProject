import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(system.in);

    public static void main(String[] args) {
        String userFirstName;
        String userLastName;
        int menuOption = 1;
        

        while(menuoption != 0) {
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

    public static void bookRental(String bookName) {
        //TODO: set up rental return and new rental menu

    }

    public static void newSignUp() {
        String userFirstName;
        String userLastName;

        System.out.println("What is users first name?");
        System.out.println("What is users last name?");
        LibraryUser newUser = new LibraryUSer(userFirstName, userLastName);

        //TODO: add user to database and then to registeredUser() to continue

    }

    public static void registeredUser() {
        //TODO: search for registered user in database and take to rental

    }
}
