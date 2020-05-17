package com.zanbo.Demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

//测速IP
public class TestInetAddress {

    public static void main(String[] args) {
        try {
            InetAddress name1 = InetAddress.getByName("127.0.0.1");
            System.out.println(name1);
            InetAddress name2 = InetAddress.getByName("www.baidu.com");
            System.out.println(name2);
            InetAddress name3 = InetAddress.getLocalHost();
            System.out.println(name3);

            System.out.println(name2.getAddress());
            System.out.println(name2.getCanonicalHostName());
            System.out.println(name2.getHostAddress());
            System.out.println(name2.getHostName());
            System.out.println(name3.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
