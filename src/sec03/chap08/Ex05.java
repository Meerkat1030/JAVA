package sec03.chap08;

import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame{
    public Ex05() {
        super("Ex05 문제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new GridLayout(4, 4));

        Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
                Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.BLACK,
                Color.DARK_GRAY, Color.WHITE, Color.PINK, Color.MAGENTA, Color.WHITE };

        JLabel [] label = new JLabel[16];
        int randNum = 0;
        for(int i = 0; i < 16; i++) {
            label[i] = new JLabel(Integer.toString(i));
            label[i].setOpaque(true);
            label[i].setBackground(color[i]);
            c.add(label[i]);
        }
        this.setSize(500, 250);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Ex05();
    }
}
