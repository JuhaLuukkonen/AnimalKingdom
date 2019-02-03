import java.awt.*;
import java.util.*;

public class WhiteTiger extends Tiger {
    boolean hasInfected;

    public WhiteTiger(){
        hasInfected=false;
    }


    public Color getColor() {
        //Always Color.WHITE.
        return Color.WHITE;
    }


    public String toString() {
        if (hasInfected){
            return super.toString();
        } else {
            return "tgr";
        }
    }


    public Action getMove(CritterInfo info) {
        //Sama kuin tiikeri.
        //Huomio; täytyy ylikirjoittaa, mikäli haluat nähdä vaikutuksen toisiin olioihin.
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);

    }
}
