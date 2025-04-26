package tourismApp.classes;

public class Route extends Reservation {
    private float duration;

    // Constructor for Route
    public Route(String Title, int code, int Rating, int num, float duration) {
        super(Title, code, Rating, num);
        this.duration = duration;
    }

    public float getDuration() { return duration; }
    public void setDuration(float duration) { this.duration = duration; }

    @Override
    public String toString() {
        return String.format("Route{title='%s', code=%d, rating=%d, num=%d, duration=%.2f}\n", 
            getTitle(), getCode(), getRating(), getCost1(), duration);
    }
}
