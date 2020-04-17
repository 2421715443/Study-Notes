package com.zanbo.method;


public class Demo02 {

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.test(101,51,55,3514,13,31);
    }

    //可变参数
    public void test(int j,int... i){
        for (int k = 0;k < i.length;k++ )
            System.out.println(i[k]);
        System.out.println(j);
    }

}
