package Lab06_Television;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class BarPanel extends JPanel{
    JTextField textfield_channel = new JTextField("Ch 35 Vol 45");
    ControlPanel panel_control = new ControlPanel();
    BarPanel() {
        super();
        setLayout(new BorderLayout());
        add(textfield_channel, BorderLayout.CENTER);
        add(panel_control, BorderLayout.EAST);
    }
    
}
