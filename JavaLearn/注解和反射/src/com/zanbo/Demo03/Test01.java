package com.zanbo.Demo03;

public class Test01 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);

        /*
        加载到内存，产生class对象
        堆与方法区链接，m=0
        然后初始化
            <clinit>(){
                m=100;
                m=10;
            }
         */

    }

}


class A {
    static {
        System.out.println("静态代码块");
        m = 100;
    }
    /*
    构造器<clinit>()是由方法自动收集类中的类变量赋值和静态代码块的语句合并产生的
     */

    static int m = 10;
    public A(){
        System.out.println("无参构造器");
    }
}