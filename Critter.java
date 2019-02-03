// Tämä on superluokka kaikille Critter luokille.  Lisätyt luokat/oliot
// ulottuvat tähän luokkaan.  Luokka tarjoaa seuraavanlaiset vakiot:
//
//    type Neighbor  : WALL, EMPTY, SAME, OTHER
//    type Action    : HOP, LEFT, RIGHT, INFECT
//    type Direction : NORTH, SOUTH, EAST, WEST
//
// Ylikirjoita seuraavat metodit vaihtaaksesi Critterin käyttäytymistä:
//
//     public Action getMove(CritterInfo info)
//     public Color getColor()
//     public String toString()
//
// The CritterInfo objektit välitetään getMove metodille seuraavasti
// saatavilla olevat metodit:
//
//     public Neighbor getFront();            neighbor in front of you
//     public Neighbor getBack();             neighbor in back of you
//     public Neighbor getLeft();             neighbor to your left
//     public Neighbor getRight();            neighbor to your right
//     public Direction getDirection();       direction you are facing
//     public boolean frontThreat();          threatening critter in front?
//     public boolean backThreat();           threatening critter in back?
//     public boolean leftThreat();           threatening critter to the left?
//     public boolean rightThreat();          threatening critter to the right?
import java.util.*;
import java.awt.*;

public class Critter {
    public static enum Neighbor {
        WALL, EMPTY, SAME, OTHER
    };

    public static enum Action {
        HOP, LEFT, RIGHT, INFECT
    };

    public static enum Direction {
        NORTH, SOUTH, EAST, WEST
    };

    // Tämä metodi pitäisi ylikirjoittaa (oletuksena toiminta on kääntyä vasemmalle)
    public Action getMove(CritterInfo info) {
        return Action.LEFT;
    }

    // Tämä metodi pitäisi ylikirjoittaa (oletuksena musta väri)
    public Color getColor() {
        return Color.BLACK;
    }

    // Tämä metodi pitäisi ylikirjoittaa(default display is "?")
    public String toString() {
        return "?";
    }

    // Tämä estää olioita yrittää uudelleen määrittää olion tasavertaisuutta, mikä on tärkeää simulaation toiminnan kannalta.
    public final boolean equals(Object other) {
        return this == other;
    }
}