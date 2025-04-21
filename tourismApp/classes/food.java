package src.tourismApp.classes;

public class food {
    private String name;
    private cost cost1;

    public food(String name,cost cost1){
        this.name=name;
        this.cost1=cost1;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public cost getCost1() {return cost1;}
    public void setCost1(cost cost1) {this.cost1 = cost1;}
    
}
