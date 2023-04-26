package Lab10_KeyboardGame;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class KeyboardGame extends JPanel implements ActionListener, KeyListener{
    char displayedChar = 'Z';
    char typed = '?';
    int score = 0;
    Timer timer = new Timer(1000, this);
    KeyboardGame () { 
        setFocusable(true);
        timer.start();
        addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString(("Letter: " + displayedChar), 75, 75);
        g.drawString("You typed", 75, 150);
        g.drawString(("Your Score = " + score), 75, 225);
        g.setColor(Color.BLUE);
        g.drawString(""+typed, 350, 150);
    }


    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        displayedChar = (char) ('A' + random.nextInt(26));
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        typed = (char) (e.getKeyChar()-32);
        if (e.getKeyChar() == displayedChar+32) {
            score ++;
        }
        repaint();
    }
    public void keyPressed(KeyEvent e) {
    }
    public void keyReleased(KeyEvent e) {
    }
}
