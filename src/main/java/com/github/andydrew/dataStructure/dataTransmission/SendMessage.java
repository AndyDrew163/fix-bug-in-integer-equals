package com.github.andydrew.dataStructure.dataTransmission;

import java.io.IOException;
import java.net.*;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        //UDP协议：无连接发送，传输快最多发送64K，数据不安全容易丢失
        //1、创建UDP对象
        DatagramSocket ds = new DatagramSocket();
        //2、创建DatagramPocket对象打包数据
        byte[] bytes = "你好吗？我亲爱的未来老婆,我很想你,因为我很孤单,需要人陪伴!".getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, 10086);
        //3、发送数据
        ds.send(dp);
        //4、释放资源
        ds.close();
    }

}
