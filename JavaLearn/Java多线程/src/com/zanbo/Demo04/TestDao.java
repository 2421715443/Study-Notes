package com.zanbo.Demo04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDao implements Runnable {

    @Override
    public void run() {
        int i = 10;
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("倒1计时第" + i-- + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i < 0) {
                break;
            }
        }
    }

    public static void dao() throws InterruptedException {
        int i = 10;
        while (true) {
            Thread.sleep(1000);
            System.out.println("倒2计时第" + i-- + "秒");
            if (i < 0) {
                break;
            }
        }
    }

    public static void dao0(){
        Date  date = new Date(System.currentTimeMillis());
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestDao testDao = new TestDao();

        new Thread(testDao).start();

        try {
            dao();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            dao0();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
