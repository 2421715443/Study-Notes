package com.zanbo.Demo01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {

        //窗口
        Frame frame = new Frame("窗口");

        //设置窗口可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400, 400);

        //设置背景颜色    Color类
        frame.setBackground(new Color(0x1B5DAD));

        //设置弹出位置
        frame.setLocation(200, 200);

        //设置大小固定
        frame.setResizable(false);

    }
}
