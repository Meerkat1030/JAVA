package sec03.chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex02 extends JFrame {
    private JLabel la = new JLabel("keypress");
    public Ex02(){
        super("keypress");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(la);
        c.addKeyListener(new MeyKeyListener());
        setSize(250, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
        c.setBackground(Color.cyan);

    }
    class MeyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            if (e.getKeyChar() == 'R'){
                getContentPane().setBackground(Color.red);
            }
        }
        public void keyReleased(KeyEvent e){
            if (e.getKeyChar() == 'R'){
                getContentPane().setBackground(Color.cyan);
            }
        }
    }

    public static void main(String[] args) {
        new Ex02();
    }
}
