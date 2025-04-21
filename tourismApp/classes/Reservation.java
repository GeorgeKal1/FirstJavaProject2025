package tourismApp.classes;

public class Reservation {
    private String title;

    

    private int code;
    private int rating;
    private Cost cost1= new Cost(0);

    public Reservation(String Title,int code,int Rating,int num){
        this.title=Title;
        this.code= code;
        this.rating=Rating;
        this.cost1.setCost(num);
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public Cost getCost1() { return cost1; }
    public void setCost1(int num) { this.cost1.setCost(num); }

    
    @Override
    public String toString() {
        return String.format("Reservation{title='%s', code=%d, rating=%d, cost1=%d}", 
                              title, code, rating, cost1.getCost());
    }


    
}
