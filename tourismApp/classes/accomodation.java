package tourismApp.classes;

public class Accomodation {
    private String name;
    private Cost cost1 = new Cost(0);
    private int customers;

    public Accomodation(String name,int num,int customers) {
        this.name=name;
        this.cost1.setCost(num);
        this.customers=0;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getCost1() {return cost1.getCost();}
    public void setCost1(int num) {this.cost1.setCost(num);}
    
    public void numOfCustomers(int action){//gia tin lista me ta accomodations
        if (action==1){
            customers++;
        }else if (action==2 && customers>0){
            customers--;
        }
    }
}
