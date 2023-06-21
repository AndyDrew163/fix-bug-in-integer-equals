package com.github.andydrew.dataStructure.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\美剧\\aaa.txt");//创建file文件
        FileInputStream fis = new FileInputStream(file);//若文件不存在回报异常
        int len;                           //从文件开头开始读取，每次读取完1个字节之后指针位于当前位置不变。
        while ((len = fis.read()) != -1) {//一个一个字节的读取，方法返回每个字节对应的ascll码,读不到数据会返回-1。
            System.out.println((char) len);//强转为字符
        }
        fis.close();
    }
}
