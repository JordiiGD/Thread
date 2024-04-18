package co.edu.uptc.view.DashBoard;

import javax.swing.*;
import java.awt.*;

public class WorkPanel extends JPanel {

    private int x = 300;
    private int y = 300;
    public WorkPanel(){
        initComponents();
    }

    public void initComponents(){
        setBounds(100,100,450,300);
        setBackground(Color.BLUE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.LIGHT_GRAY);
        g.drawOval(x, y, 40,40);
    }

    public void left(){
        x = x - 10;
        repaint();
    }

    public void rigth(){
        x = x + 10;
        repaint();
    }

    public void up(){
        y = y - 10;
        repaint();
    }

    public void down(){
        y = y + 10;
        repaint();
    }
}
