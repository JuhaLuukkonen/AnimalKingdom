// The CritterInfo rajapinta määrittelee metodit Critter simulaation tilasta.
// Tätä tiedostoa ei kannata muuttaa

public interface CritterInfo {
    public Critter.Neighbor getFront();
    public Critter.Neighbor getBack();
    public Critter.Neighbor getLeft();
    public Critter.Neighbor getRight();
    public Critter.Direction getDirection();
    public boolean frontThreat();
    public boolean backThreat();
    public boolean leftThreat();
    public boolean rightThreat();
}
