package Lab09_BMICalculator;

import javax.swing.JFrame;

public class BMICalculatorTesting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My BMI Calculator");  
           BMICalculator calc = new BMICalculator();
           frame.add(calc); 
           frame.setSize(400, 200); 
           frame.setLocationRelativeTo(null); 
           frame.setVisible(true); 
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
}
