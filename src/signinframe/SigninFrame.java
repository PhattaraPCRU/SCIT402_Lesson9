package signinframe;
import java.awt.*;
import javax.swing.*;

public class SigninFrame {
    public static void main(String[] args) {
        JFrame f; JPanel p; JLabel mlbl, ulbl, pwlbl; JTextField usertxt;
        JPasswordField pwtxt; JButton signinbtn, resetbtn;
        Font fn1 = new Font("Tahoma", Font.BOLD, 12);
        Font fn2 = new Font("Courier New", Font.BOLD, 14);
        f = new JFrame("Sign In"); p = new JPanel();
        mlbl = new JLabel("Please Enter User & Password");
        ulbl = new JLabel("Username");
        pwlbl = new JLabel("Password");
        usertxt = new JTextField(10); pwtxt = new JPasswordField(10);
        signinbtn = new JButton("Sign In"); resetbtn = new JButton("Reset");
        mlbl.setForeground(Color.BLUE);
        mlbl.setFont(fn1); ulbl.setFont(fn2); pwlbl.setFont(fn2);
        usertxt.setFont(fn2); pwtxt.setFont(fn2); signinbtn.setFont(fn2);
        resetbtn.setFont(fn2);
        p.add(mlbl); p.add(ulbl); p.add(usertxt); p.add(pwlbl);
        p.add(pwtxt); p.add(signinbtn); p.add(resetbtn);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 150);
        f.setVisible(true);
    }
}
