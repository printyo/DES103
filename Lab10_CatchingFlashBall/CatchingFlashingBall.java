package Lab10_CatchingFlashBall;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CatchingFlashingBall extends JPanel{
    int randX = 0;
    int randY = 0;
    int w = 20;
    int xcenter;
    int ycenter;
    TimerListener tl = new TimerListener();
    Timer timer = new Timer(1000, tl);
    CatchingFlashingBall() {
        timer.start();
        addMouseListener(new Catcher());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.ORANGE);
        g.fillOval(randX, randY, w , w);
    }

    
    public class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Random ran = new Random();
            randX = ran.nextInt(getWidth()-w);
            randY = ran.nextInt(getHeight()-w);
            xcenter = randX + (w/2);
            ycenter = randY + (w/2);
            repaint();
        }

    }

    public class Catcher implements MouseListener {
        double calculateDistance(int x1, int y1, int x2, int y2) {
            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); }

        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            if (calculateDistance(xcenter, ycenter, x, y) <= w/2) {
                timer.stop();
            }
            repaint();
        }
        public void mouseClicked(MouseEvent e) {
        }
        public void mouseReleased(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }

    }
}
