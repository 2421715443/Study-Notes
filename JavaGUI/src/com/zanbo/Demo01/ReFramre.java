package com.zanbo.Demo01;

import java.awt.*;

public class ReFramre {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(200, 200, 400, 400, new Color(0xDABF18BF));
        MyFrame myFrame2 = new MyFrame(600, 200, 400, 400, new Color(0xDABF18BF));
        MyFrame myFrame3 = new MyFrame(200, 600, 400, 400, new Color(0xDABF18BF));
        MyFrame myFrame4 = new MyFrame(600, 600, 400, 400, new Color(0xDABF18BF));
    }
}

class MyFrame extends Frame {
    //窗口计数器
    static int id = 1;

    public MyFrame(int x, int y, int w, int h,Color color) throws HeadlessException {
        super("第" + id++ + "个窗口");
        setVisible(true);
        setBounds(x, y, w, h);
        setBackground(color);
        setResizable(false);
    }
}
