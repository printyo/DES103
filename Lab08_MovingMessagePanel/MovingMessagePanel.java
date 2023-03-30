package Lab08_MovingMessagePanel;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener{

    JFrame f;

    String message = "";
    int x = 80;
    int y = 100;
    Color textColor = Color.BLACK;
    Color bgColor = Color.WHITE;

    JPanel messagePanel = new JPanel();
    JLabel messageLabel = new JLabel("Message to be displayed");
    JTextField messageTextField = new JTextField(50);

    JPanel colorPanel = new JPanel();
    JLabel colorLabel = new JLabel("Background Color");
    JRadioButton whiteRB = new JRadioButton("white");
    JRadioButton blackRB = new JRadioButton("black");

    JRadioButton mouseRB = new JRadioButton("Use Mouse");

    JPanel directionPanel = new JPanel();
    JButton leftButton = new JButton("Left");
    JButton rightButton = new JButton("Right");
    JButton upButton = new JButton("Up");
    JButton downButton = new JButton("Down");

    MovingMessagePanel() {
        f = new JFrame();

        messagePanel.setLayout(new FlowLayout());
        messagePanel.add(messageLabel);
        messagePanel.add(messageTextField);

        colorPanel.setLayout(new GridLayout(3,1));
        colorPanel.add(colorLabel);
        colorPanel.add(whiteRB);
        colorPanel.add(blackRB);

        directionPanel.setLayout(new FlowLayout());
        directionPanel.add(leftButton);
        directionPanel.add(rightButton);
        directionPanel.add(upButton);
        directionPanel.add(downButton);

        messageTextField.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        upButton.addActionListener(this);
        downButton.addActionListener(this);

        whiteRB.addItemListener(this);
        blackRB.addItemListener(this);
        mouseRB.addItemListener(this);
        

        f.setLayout(new BorderLayout());
        f.add(messagePanel, BorderLayout.NORTH);
        f.add(colorPanel, BorderLayout.WEST);
        f.add(mouseRB, BorderLayout.EAST);
        f.add(directionPanel, BorderLayout.SOUTH);
        f.add(this, BorderLayout.CENTER);

        f.setSize(800, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("SanSerif", Font.BOLD, 32));
        g.setColor(textColor);
        g.drawString(message, x, y);
        setBackground(bgColor);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == messageTextField) {
            message = e.getActionCommand();
        }
        else if (e.getSource() == leftButton) {
            x -= 10;
        }
        else if (e.getSource() == rightButton) {
            x += 10;
        }
        else if (e.getSource() == upButton) {
            y -= 10;
        }
        else if (e.getSource() == downButton) {
            y += 10;
        }
        repaint();
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == whiteRB) {
            if (whiteRB.isSelected()) {
                bgColor = Color.WHITE;
                textColor = Color.BLACK;
                blackRB.setSelected(false);
            }
        }
        else if (e.getSource() == blackRB) {
            if (blackRB.isSelected()) {
                bgColor = Color.BLACK;
                textColor = Color.PINK;
                whiteRB.setSelected(false);
            }
        }
        else if (e.getSource() == mouseRB) {
            if (mouseRB.isSelected()) {
                this.addMouseMotionListener(this);
            }
            else {
                this.removeMouseMotionListener(this);
            }
        }
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }
}
