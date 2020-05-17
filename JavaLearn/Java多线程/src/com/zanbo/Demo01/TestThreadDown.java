package com.zanbo.Demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThreadDown implements Runnable {

    private String url;
    private String name;

    public TestThreadDown(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了" + name);
    }


    public static void main(String[] args) {

        TestThreadDown t1 = new TestThreadDown("http://i0.hdslb.com/bfs/archive/2a1f16dcd917e2228743898920234a92e0c39f88.jpg@880w_388h_1c_95q", "1.jpg");
        TestThreadDown t2 = new TestThreadDown("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1587491359942&di=d05b3fd597720ffeaf2669638907d57c&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg", "2.jpg");
        TestThreadDown t3 = new TestThreadDown("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1587491453230&di=501837eb4e2559e02727f432587bfb4a&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fd62a6059252dd42a1c362a29033b5bb5c9eab870.jpg", "3.jpg");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
//        WebDownloader webDownloader = new WebDownloader();
//        for (int i = 1; i < 627; i++) {
//            webDownloader.downloader("https://api.isoyu.com/uploads/beibei/beibei_"+String.format("%04d",i)+".jpg",String.format("%04d",i)+".jpg");
//        }

    }

}


class WebDownloader {

    public void downloader(String url, String name) {

        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}