package com.zanbo.exception.myexception;

//自定义异常类
public class MyException extends Exception {

    //传递数字>10
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
