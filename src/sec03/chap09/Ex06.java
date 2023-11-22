package sec03.chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex06 extends JFrame {
    private JLabel label[] = new JLabel[12];
    private int r, g, b;
    public Ex06(){
        super("3*4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new GridLayout(4,3));

        for(int i=0; i<12; i++){
            label[i] = new JLabel(Integer.toString(i));
            label[i].setBackground(Color.WHITE);
            label[i].addMouseListener(new MyMouseListener());

            c.add(label[i]);
        }
        setSize(300,300);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener{
        public void mouseClicked(MouseEvent e){
            JLabel la = (JLabel)e.getSource();

            r = (int)(Math.random()*256);
            g = (int)(Math.random()*256);
            b = (int)(Math.random()*256);

            la.setOpaque(true);
            la.setBackground(new Color(r, g, b));
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new Ex06();
    }
}
