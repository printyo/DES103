package Lab06_Television;

import javax.swing.JFrame;

public class TelevisionGUI {
    public static void main(String[] args) {
        Television mv = new Television("My Television");
        mv.setVisible(true);
        mv.setSize(800,400);
        mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
