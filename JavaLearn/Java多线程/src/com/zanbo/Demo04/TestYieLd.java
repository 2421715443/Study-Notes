package com.zanbo.Demo04;

public class TestYieLd {

    public static void main(String[] args) {
        MyYieLd myYieLd = new MyYieLd();

        new Thread(myYieLd,"第一").start();
        new Thread(myYieLd,"第二").start();
    }


}



class MyYieLd implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        Thread.yield();//线程礼让
        System.out.println(Thread.currentThread().getName()+"结束执行");
    }
}