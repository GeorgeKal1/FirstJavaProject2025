package tourismApp.classes;

public class Destination extends Reservation {
    private String location;

    
    public Destination( String title, int code, int rating, int num,String location) {
        super(title, code, rating, num);
        this.location = location;
    }

    public String getLocation() { return location; }
    @Override
    public String toString() {
        return String.format("Destination{title='%s', code=%d, rating=%d, num=%d, location='%s'\n}", 
                      getTitle(), getCode(), getRating(), getCost1(), location);
    }
}
