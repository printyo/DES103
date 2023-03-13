package Lab06_Television;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;

public class ControlPanel extends JPanel{
    AdjustPanel panel_Ch = new AdjustPanel("Ch");
    AdjustPanel panel_Vol = new AdjustPanel("Vol");
    JPanel panel_onoff = new JPanel();
    JButton button_onoff = new JButton("On/Off");

    ControlPanel() {
        super();
        panel_onoff.setLayout(new GridLayout(1,1));
        panel_onoff.add(button_onoff);
        setLayout(new GridLayout(1,3));
        add(panel_Ch);
        add(panel_Vol);
        add(panel_onoff);

    }
}
