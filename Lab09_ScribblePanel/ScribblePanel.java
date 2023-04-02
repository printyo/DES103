package Lab09_ScribblePanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener{

    int r = 20;
    int x = 0;
    int y = 0;

    ScribblePanel() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }


    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        
        if(e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
            g.setColor(Color.BLACK);
            g.drawLine(x, y, e.getX(), e.getY());
        }
        else {
            g.setColor(getBackground());
            g.fillOval(e.getX()-r, e.getY()-r, 2*r, 2*r);
        }
        x = e.getX();
        y = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
    }

}
