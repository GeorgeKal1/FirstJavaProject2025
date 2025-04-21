package tourismApp.classes;

public class Destination extends Reservation {
    private String location;

    
    public Destination(String location, String title, int code, int rating, int num) {
        super(title, code, rating, num);
        this.location = location;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
