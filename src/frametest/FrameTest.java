package frametest;
import javax.swing.*;

public class FrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}
