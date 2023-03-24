package Lab07_ElectricFan;

import javax.swing.*;
import java.awt.*;

public class ElectricFan extends JPanel{
    ElectricFan() {
        
    }

    public void paintComponent(Graphics g) {
        //Exercise 1
        g.setColor(Color.GRAY);
        g.fillOval(295, 95, 210, 210);
        g.setColor(Color.WHITE);
        g.fillOval(300, 100, 200, 200);

        //Exercise 2
        g.setColor(Color.ORANGE);
        g.fillArc(310, 110, 180, 180, 0, 36);
        g.fillArc(310, 110, 180, 180, 72, 36);
        g.fillArc(310, 110, 180, 180, 144, 36);
        g.fillArc(310, 110, 180, 180, 216, 36);
        g.fillArc(310, 110, 180, 180, 288, 36);

        //Exercise 3
        g.setColor(Color.GRAY);
        g.fillRect(380, 300, 45, 150);

        //Exercise 4
        g.setColor(Color.BLUE);
        int [] x = {350, 450, 500, 300};
        int [] y = {450, 450, 550, 550};
        g.fillPolygon(x, y, 4);

        //Exercise 5
        g.setColor(Color.RED);
        g.fillRoundRect(360, 500, 17, 20, 20, 20);
        g.fillRoundRect(380, 500, 17, 20, 20, 20);
        g.fillRoundRect(400, 500, 17, 20, 20, 20);
        g.fillRoundRect(420, 500, 17, 20, 20, 20);

        g.setColor(Color.WHITE);
        g.drawString("0", 366, 514);
        g.drawString("1", 386, 514);
        g.drawString("2", 406, 514);
        g.drawString("3", 426, 514);
    }
}
