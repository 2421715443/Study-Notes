package com.zanbo.Demo02;



//多个线程操作同一资源时数据不安全
public class TestThreadRun02 implements Runnable {

    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "张票");
        }
    }


    public static void main(String[] args) {
        TestThreadRun02 testThreadRun02 = new TestThreadRun02();

        new Thread(testThreadRun02,"小红").start();
        new Thread(testThreadRun02,"张三").start();
        new Thread(testThreadRun02,"李四").start();
    }
}
