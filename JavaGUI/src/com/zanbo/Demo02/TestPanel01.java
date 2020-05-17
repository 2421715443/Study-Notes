package com.zanbo.Demo02;

import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel01 {

    public static void main(String[] args) {

        Frame frame = new Frame("窗口");

        //布局的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        frame.setVisible(true);
        frame.setBounds(200,200,400,400);
        frame.setBackground(new Color(0x4545C1));
        frame.setResizable(false);
        frame.add(panel);

        panel.setBounds(0,30,400,20);
        panel.setVisible(true);
        panel.setBackground(new Color(0x0EE00E));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}
