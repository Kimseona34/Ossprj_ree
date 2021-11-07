package Prac09;

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.LIGHT_GRAY);
        setOpaque(true);
        setLayout(new FlowLayout());
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}
class CenterPanel extends JPanel {
    public CenterPanel() {
        setBackground(Color.white);
        setLayout(null);
        for(int i = 0; i < 10; i++) {
            JLabel label = new JLabel("*");
            int x = (int)(Math.random()*200) + 10;
            int y = (int)(Math.random()*200) + 10;
            label.setLocation(x, y);
            label.setSize(30, 30);
            setOpaque(true);
            add(label);
        }
    }
}
class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        setOpaque(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Word Input"));
        add(new JTextField(15));
    }
}
public class Q8 extends JFrame{
    public Q8() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        Container c = getContentPane(); // 컨텐트팬은 디폴트로 BorderLayout 배치 관리자.
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        c.add(new SouthPanel(), BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new Q8();
    }
}

