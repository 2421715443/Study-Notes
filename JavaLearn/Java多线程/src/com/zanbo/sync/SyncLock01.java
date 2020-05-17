package com.zanbo.sync;

public class SyncLock01 {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"1号").start();
        new Thread(buyTicket,"2号").start();
        new Thread(buyTicket,"3号").start();
    }

}


class BuyTicket implements Runnable {

    private int ticket = 10;
    boolean flag = true;

    private synchronized void buy() throws InterruptedException {
        if (ticket < 1) {
            flag = false;
//            return;
        }

//        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName() + "买了第" + ticket-- + "张票");
    }

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}