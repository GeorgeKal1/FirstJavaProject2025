package tourismApp.classes;

import java.io.Serializable;

public class Cost implements Serializable{
    private  int cost;

    public Cost(int num){
        this.cost=num;
    }

    public int getCost() {return cost;}
    public void setCost(int cost) {this.cost = cost;}

    
} 
