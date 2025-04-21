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
}
