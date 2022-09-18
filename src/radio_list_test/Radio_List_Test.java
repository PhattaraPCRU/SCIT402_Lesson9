package radio_list_test;
import javax.swing.*;
import java.awt.*;

public class Radio_List_Test {
    public static void main(String[] args) {
        JFrame f; JPanel p; ButtonGroup bg; JRadioButton n1, n2; JList AList;
        String AniList[] = {"Dog", "Cat", "Bird", "Fish", "Snake", "Lizard"};
        Font fn = new Font("Courier New", Font.BOLD, 16);
        f = new JFrame("Select Component Test");
        p = new JPanel();
        bg = new ButtonGroup();
        n1 = new JRadioButton("MALE", true);
        n2 = new JRadioButton("FEMALE");
        bg.add(n1); bg.add(n2);
        n1.setFont(fn); n2.setFont(fn);
        AList = new JList<>(AniList);
        AList.setPreferredSize(new Dimension(135,140));
        AList.setVisibleRowCount(5);
        AList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane panelist = new JScrollPane(AList);
        p.add(n1); p.add(n2); p.add(panelist);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(230, 200);
        f.setVisible(true);
    }
}
