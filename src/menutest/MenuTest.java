package menutest;
import javax.swing.*;
import java.awt.*;

public class MenuTest {
    public static void main(String[] args) {
        Font fn = new Font("Courier New", Font.BOLD, 16);
        JFrame f; JMenuBar menubar; JMenu menuFile, menuNew, menuAbout;
        JMenuItem menuN1, menuN2, menuOpen, menuExit;
        f = new JFrame("Menu Test"); menubar = new JMenuBar();
        menuFile = new JMenu("File"); menuAbout = new JMenu("About");
        menuNew = new JMenu("New"); menuN1 = new JMenuItem("Java");
        menuN2 = new JMenuItem("C/C++"); 
        menuNew.add(menuN1); menuNew.addSeparator(); menuNew.add(menuN2);
        menuOpen = new JMenuItem("Open");
        menuExit = new JMenuItem("Exit");
        menuFile.setFont(fn); menuNew.setFont(fn); menuN1.setFont(fn);
        menuN2.setFont(fn); menuOpen.setFont(fn); menuExit.setFont(fn);
        menuAbout.setFont(fn);
        menuFile.add(menuNew); menuFile.addSeparator(); menuFile.add(menuOpen);
        menuFile.add(menuExit); menubar.add(menuFile); menubar.add(menuAbout);
        f.setJMenuBar(menubar);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 250);
        f.setVisible(true);
    }
}
