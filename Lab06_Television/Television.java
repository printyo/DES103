package Lab06_Television;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Television extends JFrame{
    JButton button_screen = new JButton();
    BarPanel panel_bar = new BarPanel();
    Television(String title) {
        super(title);
        setLayout(new BorderLayout());
        add(button_screen, BorderLayout.CENTER);
        add(panel_bar, BorderLayout.SOUTH);
        
    }
}
