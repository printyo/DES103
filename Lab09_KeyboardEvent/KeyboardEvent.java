package Lab09_KeyboardEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class KeyboardEvent extends JPanel implements KeyListener {

    String message = "";

    KeyboardEvent() {
        addKeyListener(this);
        setFocusable(true);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Verdana", Font.BOLD, 50));
        g.drawString(message, 0, 100);
    }
    public void keyTyped(KeyEvent e) {
        message += e.getKeyChar();
        repaint();
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
    
}
