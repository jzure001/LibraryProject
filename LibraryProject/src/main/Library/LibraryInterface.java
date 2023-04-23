//interfaces done by Chris
interface LibraryInterface {

        // returns this user's id
         LibraryUser getUser(int id);

        //Adds existing books to library
        void initializeBooks();

        // adds user to hashmap using provided id and user's first and last name
         void registerUser(int id, String firstName, String lastName);

        // checks hashmap for id and returns boolean
         boolean isUserRegistered(int id);

        // adds book id and book's description to hashmap
         void addBook(String id, String description);

        // searches hashmap for specified book
         Book searchBook(String id);

        // removes book from hashmap
         void removeBook(String id);
}

