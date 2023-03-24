package Lab07_ElectricFan;

import javax.swing.*;

public class ElectricFanTesting{
    public static void main(String [] args) {
        JFrame ef = new JFrame("Electric Fan");
        ef.add(new ElectricFan());
        ef.setVisible(true);
        ef.setSize(800,800);
        ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
