package sec03.chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex04 extends JFrame {
    private JLabel la = new JLabel("Love Java");
    public Ex04(){
        super("+,- 키로 폰트 사이즈 조정");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());
        la.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(la);
        la.setSize(300, 300);
        setSize(200,200);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            Font f = la.getFont();
            int size = f.getSize();
            if (e.getKeyChar() == '+'){
                la.setFont(new Font("Arial", Font.PLAIN, size+5));
            }else if(e.getKeyChar() == '-' && size > 10){
                la.setFont(new Font("Arial", Font.PLAIN, size-5));
            }
        }
    }

    public static void main(String[] args) {
        new Ex04();
    }
}
