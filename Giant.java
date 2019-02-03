import java.awt.*;
import java.util.*;

public class Giant extends Critter{
    private int moves;

    public Giant(){
        moves=1;
        getColor();
    }

    public Color getColor (){
        return Color.GRAY;
    }


    public String toString() {
        //Jättiläisen liikkeet.
        if (moves<=6){
            return "Gfee";
        } else if (moves<=12){
            return "Gfie";
        } else if (moves<=18){
            return "Gfoe";
        } else {
            return "Gfum";
        }
    }

    public Action getMove(CritterInfo info) {
        //Jättiläisen liikkeistä lisää
        if (info.getFront()==Neighbor.OTHER){
            countMoves();
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.EMPTY){
            countMoves();
            return Action.HOP;
        } else {
            countMoves();
            return Action.RIGHT;
        }
    }

    public void countMoves(){
        if (moves==24){
            moves=1;
        } else {
            moves++;
        }
    }
}
