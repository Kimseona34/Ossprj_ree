package Prac09;

import javax.swing.*;
import java.awt.*;
public class Q4 extends JFrame{
    public Q4() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(1, 10);
        grid.setVgap(1);
        Container c = getContentPane();
        c.setLayout(grid);
        for(int i = 0; i < 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setBackground(new Color(255, 255 - 20 * i, 20 * i));
            c.add(btn);
        }
        setSize(450, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Q4();
    }
}

