package Lab10_KeyboardGame;

import javax.swing.JFrame;

public class KeyboardGameTesting {
    public static void main(String [] args) {
    JFrame frame = new JFrame(); //create an object of this frame
    KeyboardGame game = new KeyboardGame(); //create an object of KeyBoardGame
    frame.add(game); //add the created object from KeyBoardGame
    //Configure the frame
    frame.setTitle("My Keyboard Game"); //set Title of this frame
    frame.setSize(500, 300); //set a frame's size
    frame.setLocationRelativeTo(null); //set a location at center the frame
    frame.setVisible(true); //set visibility of this frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set default Close Operation
    }
}
