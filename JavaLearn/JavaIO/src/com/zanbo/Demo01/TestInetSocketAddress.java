package com.zanbo.Demo01;


import java.net.InetSocketAddress;

public class TestInetSocketAddress {

    public static void main(String[] args) {

        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com", 443);
        System.out.println(inetSocketAddress.getAddress());

    }

}
