package exitmenutest;
import javax.swing.*;
import java.awt.event.*;

public class ExitMenuTest extends JFrame {
    JMenuBar menubar; JMenu menuFile; JMenuItem menuExit;
    public ExitMenuTest(String title){
        super(title);
        menubar = new JMenuBar();
        menuFile = new JMenu("File");
        menuExit = new JMenuItem("Exit",new ImageIcon("src/labeltest/bee.png"));
        menuExit.addActionListener(new MenuListener());
        menuFile.add(menuExit);
        menubar.add(menuFile);
        setJMenuBar(menubar);
    }
    private class MenuListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            if(source == menuExit){
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        ExitMenuTest frame = new ExitMenuTest("Exit Menu Test");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
