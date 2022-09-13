package paneltest;
import javax.swing.*;
import java.awt.*;

public class PanelTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Panel Test");
        JPanel p = new JPanel();
        p.setBackground(Color.CYAN);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 150);
        f.setVisible(true);
    }
}
