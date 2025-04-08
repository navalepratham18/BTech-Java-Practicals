import javax.swing.*; // Import Swing components for GUI
import java.awt.*; // Import AWT package for layout management
import java.awt.event.*; // Import event package for handling events

public class practical10 extends JFrame implements ActionListener {
    private JButton button; // Declare a button component
    private JTextField textField; // Declare a text field component

    // Constructor to set up GUI components
    public practical10() {
        setTitle("Event Handling Example"); // Set frame title
        setSize(300, 200); // Set frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setLayout(new FlowLayout()); // Set layout manager

        textField = new JTextField(15); // Create text field with 15 columns
        button = new JButton("Click Me"); // Create button with label

        button.addActionListener(this); // Register button with ActionListener

        add(textField); // Add text field to frame
        add(button); // Add button to frame

        setVisible(true); // Make frame visible
    }

    // Override actionPerformed method to handle button click event

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Button Clicked!"); // Set text when button is clicked
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new practical10(); // Create instance of EventHandlingExample
    }
}