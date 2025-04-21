package src.tourismApp.classes;

import tourismApp.classes.cost.cost;



public class accomodation {
    private String name;
    private cost cost1;
    
    public accomodation(String name,cost cost1) {
        this.name=name;
        this.cost1=cost1;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public cost getCost1() {return cost1;}
    public void setCost1(cost cost1) {this.cost1 = cost1;}
    
    
}
