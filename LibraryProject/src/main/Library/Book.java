public class Book {
    private String id;
    private String description;
    private boolean isRented;

    public Book(String id, String description){
        this.id = id;
        this.description=description;
        this.isRented=false;
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

}
