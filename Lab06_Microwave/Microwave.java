package Lab06_Microwave;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class Microwave extends JFrame {
    JPanel panel01_MicrowaveLayout = new JPanel();
    JPanel panel02_MicrowaveLayout = new JPanel();
    JTextField textfield_Time = new JTextField("Microwave Time Display");
    JButton button_Foods = new JButton("Food to be placed here");
    JButton button_Stop = new JButton("Stop");
    JButton button_0 = new JButton("0");
    JButton button_Start = new JButton("Start");
    public Microwave(String title) {
        super(title);
        panel01_MicrowaveLayout.setLayout(new GridLayout(4,3));
        for (int i=1; i<10; i++) {
            panel01_MicrowaveLayout.add(new JButton("" + i));
        }
        panel01_MicrowaveLayout.add(button_Stop);
        panel01_MicrowaveLayout.add(button_0);
        panel01_MicrowaveLayout.add(button_Start);

        panel02_MicrowaveLayout.setLayout(new BorderLayout());
        panel02_MicrowaveLayout.add(panel01_MicrowaveLayout, BorderLayout.CENTER);
        panel02_MicrowaveLayout.add(textfield_Time, BorderLayout.NORTH);

        setLayout(new BorderLayout());
        add(button_Foods, BorderLayout.CENTER);
        add(panel02_MicrowaveLayout, BorderLayout.EAST);
    }
}