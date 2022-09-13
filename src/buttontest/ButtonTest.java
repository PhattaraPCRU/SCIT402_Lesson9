package buttontest;
import javax.swing.*;

public class ButtonTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Test");
        JPanel p = new JPanel();
        JButton b1 = new JButton("Confirm");
        JButton b2 = new JButton("Cancel");
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 150);
        f.setVisible(true);
    }
}
