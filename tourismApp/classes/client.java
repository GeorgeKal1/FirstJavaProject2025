package tourismApp.classes;

import java.io.Serializable;

public class Client implements Serializable{
    private String name;
    private String email;
    private String food1;
    private String accomodation;
    private String ReservationName;
    private CustomDate date = new CustomDate();

    public Client(String name, String email, String food1, String accomodation, String ReservationName, int day, int month, int year) {
        this.name = name;
        this.email = email;
        this.food1 = food1;
        this.accomodation = accomodation;
        this.ReservationName = ReservationName;
        this.date.setDay(day);
        this.date.setMonth(month);
        this.date.setYear(year);
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getFood1() {return food1;}
    public String getAccomodation() {return accomodation;}
    public String getReservationName() {return ReservationName;}
    public CustomDate getDate() {return date;}

    @Override
    public String toString() {
        return String.format(
            "Client{name='%s', email='%s', food1='%s', accomodation='%s', ReservationName='%s', date='%s'}\n",
            name, email, food1, accomodation, ReservationName, date.toString()
        );
    }
}
