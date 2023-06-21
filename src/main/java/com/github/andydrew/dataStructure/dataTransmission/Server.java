package com.github.andydrew.dataStructure.dataTransmission;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1、创建TCP协议服务端Socket对象,端口需和客户端配置的发送端口保持一致
        ServerSocket ss = new ServerSocket(10000);
        //2、等待客户端发送请求,accept()会返回客户端的Socket对象并进行监听
        Socket socket = ss.accept();
        //3、获取输入流对象,获取客户端发送过来的数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }
        //4、释放资源
        isr.close();
        socket.close();
        ss.close();
    }
}
