import javax.swing.*;
import java.awt.event.*;

public class ButtonClickExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Button Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the button
        JButton button = new JButton("Click Me!");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Add button to frame and set visible
        frame.add(button);
        frame.setVisible(true);
    }
}
