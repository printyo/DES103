package Lab06_Television;

import javax.swing.*;
import java.awt.*;

public class AdjustPanel extends JPanel {
    JButton button_Decrease = new JButton("<<");
    JButton button_Increase = new JButton(">>");
    AdjustPanel(String title) {
        super();
        JButton button_Text = new JButton(title);
        setLayout(new GridLayout(1,3));
        add(button_Decrease);
        add(button_Text);
        add(button_Increase);
    }
}