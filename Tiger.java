import java.awt.*;
import java.util.*;


public class Tiger extends Critter {
    private int colorMoves;
    Color tigerColor;
    Random rand = new Random();

    public Tiger(){
        colorMoves=0;//1,2,3
        getColor();
    }

    public Color getColor() {
        //värin satunnaismuuttuminen.
        if (colorMoves%3==0){ // asettaa uuden värin.
            int x=0;
            while (x==0){
                int i=rand.nextInt(3); //0.Punainen 1.Vihreä 2.Musta
                if (i==0 && this.tigerColor!=Color.RED){
                    this.tigerColor= Color.RED;
                    x++;
                } if (i==1 && tigerColor!=Color.GREEN){
                    this.tigerColor=Color.GREEN;
                    x++;
                } if (i==2 && tigerColor!=Color.BLUE){
                    this.tigerColor=Color.BLUE;
                    x++;
                }
            }

        }
        return tigerColor;
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        //aina infektoituu, kun eläin on edessä.
        // muuten aina kun aidan lähellä olessa.
        // muuten jos ystäväleijoja on lähellä tapahtuu hyppy.
        colorMoves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
