package tourismApp.classes;
import java.io.Serializable;

public class CustomDate implements Serializable{
    private int day;
    private int month;
    private int year;
    
    public CustomDate(){this.day=1; this.month=1 ; this.year=2000;};
    
    public CustomDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString() {
        return String.format("Date: %02d/%02d/%04d", day, month, year);
    }

    public int getDay() {return day;}
    public void setDay(int day) {this.day = day;}

    public int getMonth() {return month;}
    public void setMonth(int month) {this.month = month;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
}
