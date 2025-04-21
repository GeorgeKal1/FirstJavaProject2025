package tourismApp.classes;

public class rating {
    private String whatIsThisRating;
    private int stars;

    public rating(String whatIsThisRating, int stars) {
        this.whatIsThisRating = whatIsThisRating;
        this.stars = stars;
    }

    public String getWhatIsThisRating() { return whatIsThisRating; }
    public void setWhatIsThisRating(String whatIsThisRating) { this.whatIsThisRating = whatIsThisRating; }
    public int getStars() { return stars; }
    public void setStars(int stars) { this.stars = stars; }


    @Override
    public String toString() {
        return String.format("Rating: %s, Stars: %d/5", 
                             whatIsThisRating, stars);
    }
}
