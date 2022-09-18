package borderlayouttest;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        Font fn = new Font("Courier New", Font.BOLD, 14);
        JFrame f = new JFrame("BorderLayOut Test");
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        JButton a = new JButton("One");
        JButton b = new JButton("Two");
        JButton c = new JButton("Three");
        JButton d = new JButton("Four");
        JButton e = new JButton("Five");
        JButton g = new JButton("Six");
        JButton h = new JButton("Seven");
        JButton i = new JButton("Eight");
        JButton j = new JButton("Nine");
        a.setFont(fn); b.setFont(fn); c.setFont(fn); d.setFont(fn);
        e.setFont(fn); g.setFont(fn); h.setFont(fn); i.setFont(fn);
        j.setFont(fn);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p.add(p1, BorderLayout.NORTH);
        p1.add(a, BorderLayout.WEST); p1.add(b, BorderLayout.CENTER);
        p1.add(c, BorderLayout.EAST); p1.add(d, BorderLayout.WEST);
        p.add(p2, BorderLayout.CENTER);
        p2.add(e, BorderLayout.NORTH); p2.add(g, BorderLayout.CENTER);
        p2.add(g, BorderLayout.CENTER); p2.add(i, BorderLayout.CENTER);
        p2.add(h, BorderLayout.SOUTH);
        p.add(j, BorderLayout.SOUTH);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 180);
        f.setVisible(true);

    }
}
