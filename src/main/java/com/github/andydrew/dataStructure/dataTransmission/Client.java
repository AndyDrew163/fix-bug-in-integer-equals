package com.github.andydrew.dataStructure.dataTransmission;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1、创建TCP协议客户端Socket对象,参数为服务器IP地址和端口
        Socket socket = new Socket("127.0.0.1", 10000);
        //2、从服务器连接通道获取输出流对象
        OutputStream os = socket.getOutputStream();
        byte[] bytes = "风雨同周,深情不移!".getBytes();
        os.write(bytes);
        //3、释放资源
        os.close();
        socket.close();
    }
}
