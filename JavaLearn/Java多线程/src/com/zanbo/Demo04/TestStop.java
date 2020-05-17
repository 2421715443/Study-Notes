package com.zanbo.Demo04;

public class TestStop implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("数第" + i++ + "秒");
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();

        new Thread(testStop).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("第" + i + "次");
            if (i == 90) {
                testStop.stop();
                System.out.println("停止");
            }
        }
    }
}
