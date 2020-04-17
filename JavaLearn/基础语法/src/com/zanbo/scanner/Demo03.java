package com.zanbo.scanner;

import java.util.Scanner;

public class Demo03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int t = 0;
        System.out.println("请输入");

        for (;scanner.hasNextDouble();t++){
            double v = scanner.nextDouble();
            sum+=v;

        }

        System.out.println(t + "和为" + sum);
        System.out.println(t + "平均值为" + (sum/t));


    }

}
