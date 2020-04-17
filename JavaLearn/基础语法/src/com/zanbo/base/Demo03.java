package com.zanbo.base;

public class Demo03 {
    public static void main(String[] args) {
        //============================
        //整数拓展：     进制      二进制0b       十进制     八进制0        十六进制0x
        //============================

        int i1 = 10;
        int i2 = 010;
        int i3 = 0x10;
        int i4 = 0b10;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);


        //============================
        //浮点数拓展
        //银行业务怎么表示 钱？
        //BigDecimal
        //============================
        //float     有限的     离散的     舍入误差    大约      接近但不等于
        //double
        float a = 0.1f;
        double b = 1.0/10;
        float c = 1234364183144567f;
        double d = c+1;

        System.out.println("==========================================");
        System.out.println(a==b);
        System.out.println(c==d);


        //============================
        //字符拓展（所有的字符本身还是数字）
        //============================
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0062';

        System.out.println("==========================================");
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println(c3);

        //转义字符
        //  \t
        //  \n

        String  qa = new String("hello");
        String  qb = new String("hello");
        String  qc = "hello";
        String  qd = "hello";

        System.out.println("==========================================");
        System.out.println(qa==qb);
        System.out.println(qc==qd);


    }
}
