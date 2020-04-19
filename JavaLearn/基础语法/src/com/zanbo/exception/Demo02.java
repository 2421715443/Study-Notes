package com.zanbo.exception;

public class Demo02 {

    public static void main(String[] args) {


        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("程序出现异常");
        } finally {
            System.out.println("最终");
        }

        //捕获多级异常，从小到大
        try {
            System.out.println(a / b);
        } catch (Error e) {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println("Throwable");
        }

        try {
            new Demo02().a();
        } catch (Error e) {
            System.out.println("栈异常");
        }
    }

    public void a() {
        b();
    }

    public void b() {
        a();
    }

}
