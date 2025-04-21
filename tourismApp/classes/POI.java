package tourismApp.classes;

import java.util.LinkedList;

public class POI extends Reservation{
    private LinkedList<String> comments;


    public POI(String Title, int code, int Rating, int num) {
        super(Title, code, Rating, num);
    }

    public void addComment(String comment){
        comments.addLast(comment);
    }

    public LinkedList<String> showComments(){
        return comments;
    };
    
}
