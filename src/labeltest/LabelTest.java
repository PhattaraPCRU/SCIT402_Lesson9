package labeltest;
import java.awt.*;
import javax.swing.*;

public class LabelTest {
    public static void main(String[] args) {
        Font fn = new Font("Courier New", Font.BOLD, 20);
        JFrame f = new JFrame("Label Test");
        JPanel p = new JPanel();
        Icon ani = new ImageIcon("bee.png");
        JLabel l1 = new JLabel("Label Test", ani, SwingConstants.CENTER);
        JLabel l2 = new JLabel(ani, SwingConstants.CENTER);
        JLabel l3 = new JLabel("I am JAVA", SwingConstants.CENTER);
        JLabel l4 = new JLabel("I am JAVA", ani, SwingConstants.CENTER);
        l1.setFont(fn);
        l2.setFont(fn);
        l3.setFont(fn);
        l4.setFont(fn);
        l1.setPreferredSize(new Dimension(170, 30));
        l2.setPreferredSize(new Dimension(170, 30));
        l3.setPreferredSize(new Dimension(170, 30));
        l4.setPreferredSize(new Dimension(170, 30));
        l1.setForeground(Color.BLUE);
        l3.setForeground(Color.BLUE);
        l2.setOpaque(true);
        l3.setOpaque(true);
        l4.setOpaque(true);
        l2.setBackground(Color.WHITE);
        l3.setBackground(Color.CYAN);
        l4.setBackground(Color.WHITE);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
