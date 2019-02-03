// Class CritterPanel näyttää olioiden verkoston

import javax.swing.*;
import java.awt.Point;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CritterPanel extends JPanel {
    private CritterModel myModel;
    private Font myFont;
    private static boolean created;

    public static final int FONT_SIZE = 12;

    public CritterPanel(CritterModel model) {
        // estää tekemästä kopion GUI komponentista
        if (created)
            throw new RuntimeException("Only one world allowed");
        created = true;

        myModel = model;
        // rakenne fontti ja laskettu merkin leveys kerran konstruktorille tehokkuuden lisäämiseksi
        myFont = new Font("Monospaced", Font.BOLD, FONT_SIZE + 4);
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(FONT_SIZE * model.getWidth() + 20,
                                       FONT_SIZE * model.getHeight() + 20));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(myFont);
        Iterator<Critter> i = myModel.iterator();
        while (i.hasNext()) {
            Critter next = i.next();
            Point p = myModel.getPoint(next);
            String appearance = myModel.getAppearance(next);
            g.setColor(Color.BLACK);
            g.drawString("" + appearance, p.x * FONT_SIZE + 11,
                         p.y * FONT_SIZE + 21);
            g.setColor(myModel.getColor(next));
            g.drawString("" + appearance, p.x * FONT_SIZE + 10,
                         p.y * FONT_SIZE + 20);
        }
    }
}
