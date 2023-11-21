package sec03.chap08;

import java.awt.*;
import javax.swing.*;

public class Ex03 extends JFrame {
    public Ex03() {
        this.setTitle("FlowLayout Practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        c.add(new JLabel("100 + 200"));
        c.add(new JButton("="));
        c.add(new JLabel("300"));

        this.setSize(400, 100);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Ex03();
    }
}