package co.edu.uptc.view.DashBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {

    private JButton btnStart;
    private JButton btnStop;
    private JButton btnUp;
    private JButton btnDown;
    private JButton btnLeft;
    private JButton btnRight;
    private DashBoard dashBoard;

    public MenuPanel(){
        initComponents();
    }

    public void initComponents(){
        setBounds(1, 1, 450, 50);
        createBtns();
        createBtnLeft();
        createBtnDown();
        createBtnUp();
        createBtnRigth();
        this.add(btnLeft);
        this.add(btnUp);
        this.add(btnStart);
        this.add(btnStop);
        this.add(btnDown);
        this.add(btnRight);
    }

    public void createBtns(){
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
    }

    public void createBtnLeft(){
        btnLeft = new JButton("<");
        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashBoard.workPanel.left();
            }
        });
    }

    public void createBtnUp(){
        btnUp = new JButton("^");
        btnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashBoard.workPanel.up();
            }
        });
    }

    public void createBtnDown(){
        btnDown = new JButton("v");
        btnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashBoard.workPanel.down();
            }
        });
    }

    public void createBtnRigth(){
        btnRight = new JButton(">");
        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashBoard.workPanel.rigth();
            }
        });
    }

    public void setDashBoard(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
    }
}
