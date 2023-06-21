package com.github.andydrew.dataStructure.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\美剧\\bbb.txt");//创建file对象
        FileOutputStream fos = new FileOutputStream(file);//父级路径必须存在，子级路径可以不存，若不存在会自行创建。
        byte[] bytes = "0123456789abcdefghijklnmopqrstuvwxyz".getBytes();
        fos.write(bytes);//将 bytes.length字节从指定的字节数组写入此输出流。
        fos.write(20170);//注意：数据写入文件每次写一个字节，如果写入的数据类型是大于1个字节的，默认写低八位。
        fos.close();//关闭资源
    }
}
