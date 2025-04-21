package tourismApp.classes;

public class Client {
    private String name;
    private String email;
    private String food1;
    private String accomodation;
    private String ReservationName;
    private CustomDate date= new CustomDate();

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

    
}
