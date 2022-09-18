package closebuttontest;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;

public class CloseButtonTest extends JFrame {
    private JPanel p; Icon ani; JButton b;
    public CloseButtonTest(String title){
        super(title);
        p = new JPanel();
        ani = new ImageIcon("src/labeltest/bee.png");
        b = new JButton("Close",ani);
        b.addActionListener(new ButtonListener());
        p.add(b);
        add(p);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == b){
                JOptionPane.showMessageDialog(null, "See You Again !!!");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        CloseButtonTest frame = new CloseButtonTest("Close Button Test");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
