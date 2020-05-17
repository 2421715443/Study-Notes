package com.zanbo.Demo04;

public class TestSleep implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticket-- + "张票");
        }
    }

    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();

        new Thread(testSleep,"小明").start();
        new Thread(testSleep,"小黄").start();
        new Thread(testSleep,"小红").start();
    }

}
