import javax.swing.*;
import java.awt.event.*;

public class Application extends JFrame implements ActionListener {

    JButton myButton;

    public Application() {

        setTitle("Interface Example");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myButton = new JButton("Click Me");

        add(myButton);

        myButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Button was clicked!");
    }

    public static void main(String[] args) {
        new Application();
    }
}