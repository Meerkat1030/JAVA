package sec03.chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListner extends JFrame {
    public EventListner(){
        setTitle("이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
//        btn.addActionListener(new MyActionListner()); // 액션리스너 달기
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource(); // 이벤트 소스 버튼 알아내기
                if(b.getText().equals("Action")){
                    b.setText("액션");
                }else {
                    b.setText("Action");
                }
                setTitle(b.getText());
            }
        });
        c.add(btn);

        setSize(250,120);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventListner();
    }
}

