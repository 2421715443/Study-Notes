package com.zanbo.scanner;

import java.util.Scanner;

public class Demo02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float j = 0.0f;

        System.out.println("请输入整数");

        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整型数据"+i);
        }else {
            System.out.println("error");
        }


        System.out.println("请输入小数");

        if(scanner.hasNextFloat()){
            j = scanner.nextFloat();
            System.out.println("浮点型数据"+j);
        }else {
            System.out.println("error");
        }

        scanner.close();

    }

}
