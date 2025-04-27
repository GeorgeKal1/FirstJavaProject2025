package tourismApp.classes;

public class POI extends Reservation{
    private String description;


    public POI(String Title, int code, int Rating, int num,String description) {
        super(Title, code, Rating, num);
        this.description=description;
    }

    public String getDescription(){return description;}
    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return String.format("POI {title='%s', code=%d, rating=%d, num=%d, description='%s'\n}", 
                      getTitle(), getCode(), getRating(), getCost1(), description);
    }
    
}
