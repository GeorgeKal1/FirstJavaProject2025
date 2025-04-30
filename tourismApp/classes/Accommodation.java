package tourismApp.classes;

import java.io.Serializable;

public class Accommodation implements Serializable{
    private String name;
    private Cost cost1 = new Cost(0);
    private int customers;

    public Accommodation(String name,int num,int customers) {
        this.name=name;
        this.cost1.setCost(num);
        this.customers=customers;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getCost1() {return cost1.getCost();}
    public void setCost1(int num) {this.cost1.setCost(num);}
    
    public int getMaxCustomers() {return customers;}
    public void setCustomers(int customers) {this.customers = customers;}

    @Override
public String toString() {
    return String.format(" Accommodation Name: %s, Cost: %d, Max Customers: %d\n", name, cost1.getCost(), customers);
}

}
