package com.github.andydrew.dataStructure.dataTransmission;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //1、创建DatagramSocket对象（快递公司）,配置接收端口,必须与发送端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);
        //2、创建DatagramPocket对象,接收包裹
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //3、接收数据,拆包
        System.out.println("开始接收信息");
        ds.receive(dp);
        System.out.println("已经收到信息");
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data, 0, len));
        System.out.println("刚刚" + dp.getAddress() + "从" + dp.getPort() + "发送了一条信息给我!");
        //4、释放资源
        ds.close();
    }
}
