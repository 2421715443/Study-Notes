package com.zanbo.scanner;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("使用next接受");

        if (scanner.hasNext()) {
            //用next方式接收
            String str = scanner.next();
            System.out.println("用户输入为：" + str);

            str = scanner1.nextLine();
            System.out.println("用户输入为：" + str);
        }

        //属于IO流的类最好关闭，否则占用资源
        scanner.close();

    }

}
