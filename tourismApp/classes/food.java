package tourismApp.classes;

public class Food {
    private String name;
    private Cost cost1 = new Cost(0);


    public Food(String name,int num){
        this.name=name;
        this.cost1.setCost(num);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getCost1() {return cost1.getCost();}
    public void setCost1(Cost cost1) {this.cost1 = cost1;}
    
}
