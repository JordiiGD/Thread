package co.edu.uptc.view.DashBoard;

import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame {

    public MenuPanel menuPanel;
    public WorkPanel workPanel;
    public DashBoard(){
        setLayout(new BorderLayout());
        initComponents();
    }

    private DashBoard getInstance(){
        return this;
    }

    public void initComponents(){
        setBounds(1, 1, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPanel = new MenuPanel();
        menuPanel.setDashBoard(getInstance());
        this.add(menuPanel, BorderLayout.NORTH);

        workPanel = new WorkPanel();
        this.add(workPanel, BorderLayout.CENTER);
    }

    public void run(){
        setVisible(true);
    }
}
