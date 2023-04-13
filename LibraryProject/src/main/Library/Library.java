import java.util.HashMap;


public class Library {
    private HashMap<Integer, LibraryUser> users;
    private HashMap<String, Book> books;

    public Library(){
        users= new HashMap<Integer, LibraryUser>();
        books = new HashMap<String, Book>();

    }

    public void registerUser(int id){
        users.put(id, new LibraryUser(id));
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
