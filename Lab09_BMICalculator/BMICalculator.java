package Lab09_BMICalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMICalculator extends JPanel{

    ActionInterpreter listener = new ActionInterpreter();

    JPanel panel1_UserInformation = new JPanel();
    JPanel panel2_HeightAndWeight = new JPanel();
    JPanel panel3_BMIResult = new JPanel();

    JLabel topLabel = new JLabel("Enter your information");
    
    JLabel heightLabel = new JLabel("Your height(cm):");
    JLabel weightLabel = new JLabel("Your weight(kg):");
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);

    JButton computeButton = new JButton("Compute BMI");
    JLabel bmiLabel = new JLabel("BMI = ");
    BMICalculator() {
        setLayout(new GridLayout(3,1));
        add(panel1_UserInformation);
        add(panel2_HeightAndWeight);
        add(panel3_BMIResult);
        panel1_UserInformation.setLayout(new GridLayout(1,1));
        panel1_UserInformation.add(topLabel);

        panel2_HeightAndWeight.setLayout(new GridLayout(2,2));
        panel2_HeightAndWeight.add(heightLabel);
        panel2_HeightAndWeight.add(tf1);
        panel2_HeightAndWeight.add(weightLabel);
        panel2_HeightAndWeight.add(tf2);

        panel3_BMIResult.setLayout(new GridLayout(2,1));
        panel3_BMIResult.add(computeButton);
        panel3_BMIResult.add(bmiLabel);

        computeButton.addActionListener(listener);
    }

    public class ActionInterpreter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double height = Double.parseDouble(tf1.getText())/100;
            double weight = Double.parseDouble(tf2.getText());
    
            double bmi = weight / (Math.pow(height,2));
            bmiLabel.setText("BMI = " + bmi);
        }
    }
    
}

