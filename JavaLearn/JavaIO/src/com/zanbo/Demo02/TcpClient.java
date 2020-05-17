package com.zanbo.Demo02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TcpClient {

    public static void main(String[] args) {

        InetAddress serverIP=null;
        Socket socket=null;
        OutputStream os=null;

        //1.要知道服务器的地址
        try {
            serverIP = InetAddress.getByName("127.0.0.1");
            //2.端口号
            int port = 9999;
            //3.创建一个Socket连接
            socket = new Socket(serverIP, port);
            for (int i = 0; i <5 ; i++) {
                //4.发送消息
                os = socket.getOutputStream();
                os.write("你好\n".getBytes());
            }



        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
