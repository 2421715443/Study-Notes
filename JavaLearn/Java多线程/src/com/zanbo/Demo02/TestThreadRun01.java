package com.zanbo.Demo02;

//实现Runable接口
public class TestThreadRun01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("hello" + i);
        }
    }

    public static void main(String[] args) {
        TestThreadRun01 testThreadRun = new TestThreadRun01();
        new Thread(testThreadRun).start();
        new Thread(testThreadRun).start();
        new Thread(testThreadRun).start();
    }

}
