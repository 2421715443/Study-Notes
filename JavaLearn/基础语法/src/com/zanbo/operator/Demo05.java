package com.zanbo.operator;

public class Demo05 {
    public static void main(String[] args) {

        //短路运算  &&之前为错，后不走
        int a = 5;
        boolean flag = (a < 4) && (a++ < 4);
        System.out.println(flag);
        System.out.println(a);
    }
}
