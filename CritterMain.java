// EdX.org - CSE 142 Homework 9 (Critters)
// modified Juha Luukkonen
//
// Critter koostuu simuloiduista oliomoduuleista 5kpl., jotka kamppailevat elintilastaan olosuhdemoduulien kanssa 3kpl..

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        //Olioiden elinkaarta säätelee säädettävät elinvoimaisuuden indeksit.
        frame.add(40, Bear.class);
        frame.add(40, Tiger.class);
        frame.add(40, WhiteTiger.class);
        frame.add(40, Giant.class);
        frame.add(40, NinjaCat.class);

        frame.add(40, FlyTrap.class);
        frame.add(40, Food.class);

        frame.start();
    }
}
