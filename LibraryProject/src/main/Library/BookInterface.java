//interface done by Chris
interface BookInterface {
    // returns this book id number
    public String getId();

    // returns the description of this book
    public String getDescription();

    // returns boolean indicating if this book is rented
    public boolean isRented();

    // sets this book's isRented boolean as true
    public void setRented(boolean isRented);

    // returns the id of user enting this book
    public Integer getRentedByUserId();

    // sets this book's renter to this user
    public void setRentedByUserId(Integer rentedByUserId);
}