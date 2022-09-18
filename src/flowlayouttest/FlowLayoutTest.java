package flowlayouttest;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutTest {
    public static void main(String[] args) {
        Font fn = new Font("Courier New", Font.BOLD, 14);
        JFrame f = new JFrame("FlowLayout Test");
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
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
        p.add(a); p.add(b); p.add(c); p.add(d); p.add(e); p.add(g);
        p.add(h); p.add(i); p.add(j);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 180);
        f.setVisible(true);

    }
}
