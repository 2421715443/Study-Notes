package com.zanbo.exception;

public class Demo03 {
    public static void main(String[] args) throws ArithmeticException {
        int a = 1;
        int b = 0;

        //Ctrl+alt+T
        try {
            if (b == 0) { //throw主动抛出异常
                throw new ArithmeticException();
            }
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();        //打印错误栈信息
        } finally {
        }
    }
}
