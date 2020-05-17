package com.zanbo.Demo01;

import java.util.ArrayList;
import java.util.List;

public class Test01 extends Object {

    @Override   //重写注解，标注的方法必须在父类中声明
    public String toString() {
        return super.toString();
    }


    @Deprecated     //不推荐使用的注解
    public static void test01() {
        System.out.println("废弃");
    }


    @SuppressWarnings("all")    //镇压警告注解
    public void test02() {
        List list = new ArrayList();
    }


    public static void main(String[] args) {
        test01();
    }

}
