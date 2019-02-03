//NinjaKissan elinparametrit
import java.awt.*;
import java.util.*;

public class NinjaCat extends Tiger {

    public boolean hasInfected;

    public NinjaCat (){
        hasInfected=false;
    }

    public Color getColor() {
        if (hasInfected){
            return Color.MAGENTA;
        } else {
            return Color.orange;
        }

    }


    public String toString() {
        if (hasInfected){
            return "NC";
        } else {
            return "nc";
        }

    }


    public Action getMove(CritterInfo info) {
        //sama kuin tiikerillä, mutta vaihtaa väriä infektoituneena.
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);

    }
}
