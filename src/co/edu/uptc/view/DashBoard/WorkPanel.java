package co.edu.uptc.view.DashBoard;

import javax.swing.*;
import java.awt.*;

public class WorkPanel extends JPanel {

    private int x = 300;
    private int y = 300;
    private int xImage = 450;
    private int yImage = 100;
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

        Image image = new ImageIcon("src/data/jorge.jpg").getImage();
        g.drawImage(image, xImage, yImage, 40, 40, null);
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

    public void leftImage(){
        xImage = xImage - 10;
        repaint();
    }

    public void rigthImage(){
        xImage = xImage + 10;
        repaint();
    }

    public void upImage(){
        yImage = yImage - 10;
        repaint();
    }

    public void downImage(){
        yImage = yImage + 10;
        repaint();
    }
}
