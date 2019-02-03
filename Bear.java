//karhu on yleensä dominoivin, olenko muuttanut flytrapin:n parametrejä niin, että estän sen toiminnan? näin ei ollut aiemmin?
import java.awt.*;
import java.util.*;

public class Bear extends Critter {
    private boolean polar;
    private int moves;

    public Bear(boolean polar){
        this.polar=polar;
        getColor();
    }

    public Color getColor() {
        //Color.WHITE kun tosi ja jääkarhu
        //Color.BLACK kun epätosi ja mustakarhu
        if (this.polar){
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString(){
        //Karhun liikkeet
        if (moves%2==0){
            return "/";
        } else {
            return "\\";
        }

    }

    public Action getMove(CritterInfo info){
        //lisää liikkeitä ja selviytymiseen liittyviä parametrejä.
        moves++;
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return super.getMove(info);
        }
    }

}
