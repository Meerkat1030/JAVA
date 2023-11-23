package sokoban;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MySokoban extends JFrame implements KeyListener, ActionListener{

    final int IXSize = 60; //Image X Size
    final int IYSize = 60; //Image Y Size
    final int BXSize = 14; //Box X Size
    final int BYSize = 10; //Box Y Size
    final int DXSize = IXSize * BXSize; //Display X Size
    final int DYSize = IYSize * BYSize; //Display X Size
    final int LThick = 3; //Line Thikenss
    final int MXSize = LThick*LThick; //Margin X Size;  (Left + Right)
    final int MYUpsize = 23+LThick; //Margin Y Size(Title + Top)
    final int MYSize = MYUpsize*LThick; //Margin X Size; (Title + Top + Bottom)

    final String TITLE = "Sokoban";

    Image Wall = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Wall.png");
    Image ManF = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManF.png");
    Image ManB = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManB.png");
    Image ManL = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManL.png");
    Image ManR = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManR.png");
    Image Dot = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Dot.png");
    Image Box = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Box.png");
    Image Road = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Road.png");

    int stage = 0;
    int iXMan = 0;
    int iYMan = 0;

    boolean bEndGame = true;
    int iScore = 0;

    JButton btnReset;
    JButton btnUP;
    JButton btnDOWN;
    JButton btnLEFT;
    JButton btnRIGHT;
    JLabel TitleLabel;

    char[][] Map = new char[BYSize][BXSize];

    String [][] Stage = {
            //stage1
            {"  ####",
             "  #  ###",
             "  #    #",
             "  # $  #",
             "### ###",
             "# $ $ #",
             "#..@..#",
             "#  $  #",
             "###  ##",
             "####",
            },
            //stage2
            {"#####",
             "#  @####",
             "#  $.  #",
             "###$.# #",
             "#  $.# #",
             "# #$.  #",
             "#    ###",
             "######",
            },

    };

    public MySokoban(){
        this.setTitle(TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(null);

        btnUP = new JButton("UP");
        btnUP.setFont(new Font("Arial", Font.BOLD, 15));
        btnUP.setLocation(890, 290);
        btnUP.setSize(100, 50);
        btnUP.addActionListener(this);
        c.add(btnUP);

        btnDOWN = new JButton("DOWN");
        btnDOWN.setFont(new Font("Arial", Font.BOLD, 15));
        btnDOWN.setLocation(890, 390);
        btnDOWN.setSize(100, 50);
        btnDOWN.addActionListener(this);
        c.add(btnDOWN);

        btnLEFT = new JButton("LEFT");
        btnLEFT.setFont(new Font("Arial", Font.BOLD, 15));
        btnLEFT.setLocation(850, 340);
        btnLEFT.setSize(100, 50);
        btnLEFT.addActionListener(this);
        c.add(btnLEFT);

        btnRIGHT = new JButton("RIGHT");
        btnRIGHT.setFont(new Font("Arial", Font.BOLD, 15));
        btnRIGHT.setLocation(940, 340);
        btnRIGHT.setSize(100, 50);
        btnRIGHT.addActionListener(this);
        c.add(btnRIGHT);

        btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Arial", Font.BOLD, 15));
        btnReset.setLocation(890, 150);
        btnReset.setSize(100, 50);
        btnReset.addActionListener(this);
        c.add(btnReset);

        TitleLabel = new JLabel();
        TitleLabel.setFont(new Font("굴림", Font.BOLD, 25));
        TitleLabel.setLocation(880, 50);
        TitleLabel.setSize(200,50);
        c.add(TitleLabel);

        c.addKeyListener(this);
        c.setFocusable(true);
        c.requestFocus();

        this.setSize(DXSize+MXSize+200, DYSize+MYSize);
        this.setResizable(false);
        this.setVisible(true);

        TitleLabel.setText("Score : " + iScore);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}



public class MyGame {
    public static void main(String[] args) {
        MySokoban sokoban = new MySokoban();
    }
}