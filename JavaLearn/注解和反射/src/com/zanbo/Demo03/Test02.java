package com.zanbo.Demo03;

public class Test02 {

    public static void main(String[] args) throws ClassNotFoundException {
//        new Son();

        //反射产生主动引用，有区别不调用构造方法
//        Class.forName("com.zanbo.Demo03.Son");

        //不会产生类的引用
//        System.out.println(Son.a);  //子类未被加载
        Son[] array = new Son[10];
        System.out.println(Son.A);


    }

}


class Father {

    static {
        System.out.println("父类被加载1.1");
    }

    static int a = 10;
    static final int A = 100;

    public Father() {
        System.out.println("父类被加载1.2");
    }
}

class Son extends Father {

    static {
        System.out.println("子类被加载2.1");
    }

    static int b = 100;

    public Son() {
        System.out.println("子类被加载2.2");
    }
}