//flytrap vaikuttaa kuluttavasti muiden olioiden elinkaareen.
import java.util.*;
import java.awt.*;

public class FlyTrap extends Critter {
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else {
            return Action.LEFT;
        }
    }

    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        return "FT";
    }
}