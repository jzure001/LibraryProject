public class Book {
    private String id;
    private String description;
    private boolean isRented;
    private Integer rentedByUserId;

    public Book(String id, String description){
        this.id = id;
        this.description=description;
        this.isRented=false;
        this.rentedByUserId= null;
    }


    public String getId(){
        return id;

    }

    public String getDescription(){
        return description;

    }

    public boolean isRented(){
        return isRented;
    }

    public void setRented(boolean isRented){
        this.isRented=isRented;
    }

    public Integer getRentedByUserId(){
        return rentedByUserId;
    }

    public void setRentedByUserId(Integer rentedByUserId){
        this.rentedByUserId=rentedByUserId;
    }
}
