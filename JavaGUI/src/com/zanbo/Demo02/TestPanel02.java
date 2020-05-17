package com.zanbo.Demo02;

import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel02 {
    public static void main(String[] args) {
        Frame frame = new Frame("窗口");

        Panel panel = new Panel();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");

        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(200,200,600,600);
        frame.setBackground(new Color(0xE3E3F3));
        frame.setResizable(false);
        frame.add(panel);

        panel.setVisible(true);
        panel.setBounds(0,30,600,30);
        panel.setBackground(new Color(0x4848EC));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
