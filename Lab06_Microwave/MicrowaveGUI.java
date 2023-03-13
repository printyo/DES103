package Lab06_Microwave;

import javax.swing.JFrame;

public class MicrowaveGUI {
   public static void main(String[] args) {
        Microwave mv = new Microwave("The Front View of a Microwave");
        mv.setVisible(true);
        mv.setSize(550,250);
        mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
