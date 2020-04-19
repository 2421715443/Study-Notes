package com.zanbo.method;

public class Demo03 {

//    public static void main(String[] args) {
//        Demo03 test = new Demo03();
//        test.test();
//    }
//
//    public void test(){
//
//    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }

    //阶乘，基数较少时使用
    public static int f(int n) {
        if (n == 1)
            return 1;
        else
            return n * f(n - 1);
    }

}
