
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class practical10 extends JFrame implements ActionListener {
    private JButton button1;
    private JTextField textField1;
    // private JLabel label1;

    public practical10() {
        setTitle("Event Handling Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField1 = new JTextField(20);
        button1 = new JButton("Click Me");
        button1.addActionListener(this);
        // label1 = new JLabel("\nLabel");
      
        add(button1);
        add(textField1);
        // add(label1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        textField1.setText("Button Clicked!");
        // label1.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new practical10();
    }
}
