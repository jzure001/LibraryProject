interface LibraryInterface {

        // returns this user's id
        public LibraryUser getUser(int id);

        // adds user to hashmap using provided id and user's first and last name
        public void registerUser(int id, String firstName, String lastName);

        // checks hashmap for id and returns boolean
        public boolean isUserRegistered(int id);

        // adds book id and book's description to hashmap
        public void addBook(String id, String description);

        // searches hashmap for specified book
        public Book searchBook(String id);

        // removes book from hashmap
        public void removeBook(String id);
}

