import java.util.HashMap;
//Library class created by John Zurek

public class Library implements LibraryInterface {
    private HashMap<Integer, LibraryUser> users;
    private HashMap<String, Book> books;

    public Library(){
        users= new HashMap<>();
        books = new HashMap<>();

    }
    public LibraryUser getUser(int id) {
        return users.get(id);
    }

    public void initializeBooks() {
        addBook("1","Introduction to C");
        addBook("2","Introduction to Python");

    }

    public void registerUser(int id, String firstName, String lastName){
        users.put(id, new LibraryUser(firstName, lastName));
    }

    public boolean isUserRegistered(int id){
        return users.containsKey(id);
    }

    public void addBook(String id, String description){
        books.put(id, new Book(id, description));
    }

    public Book searchBook(String id){
        return books.get(id);
    }

    public void removeBook(String id){
        books.remove(id);
    }


}
