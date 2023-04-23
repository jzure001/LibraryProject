//interface done by Chris
interface BookInterface {
    // returns this book id number
     String getId();

    // returns the description of this book
     String getDescription();

    // returns boolean indicating if this book is rented
     boolean isRented();

    // sets this book's isRented boolean as true
     void setRented(boolean isRented);

    // returns the id of user enting this book
     Integer getRentedByUserId();

    // sets this book's renter to this user
     void setRentedByUserId(Integer rentedByUserId);
}