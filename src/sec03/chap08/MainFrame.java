package sec03.chap08;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title){
        super(title);
        final MainPanel mainPanel = new MainPanel();
        setLayout(new BorderLayout());//창에 컴포넌트(Button, Label 등) 들을 붙이기 위함
//        JPanel panel = new JPanel();//JPanel 생성
//        panel.setBackground(Color.ORANGE);//배경색
        add(mainPanel, BorderLayout.CENTER);//메인프레임 중앙(가운데) 위치
        add(new ToolBar(mainPanel), BorderLayout.NORTH);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
