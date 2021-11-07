package Prac09;

import javax.swing.*;
import java.awt.*;

public class Q6 extends JFrame {
    public Q6() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        Container c = getContentPane();
        c.setLayout(null);

        for(int i = 0; i < 20; i++) {
            JLabel label = new JLabel(Integer.toString(i));
            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;
            label.setLocation(x, y);
            label.setSize(10, 10);
            label.setOpaque(true);
            label.setBackground(Color.blue);
            c.add(label);
        }
    }
    public static void main(String[] args) {
        new Q6();
    }
}
