package com.github.andydrew.dataStructure.file;

import java.io.*;

public class MyFilesCopy {
    public static void main(String[] args) throws IOException {
        File scr = new File("D:\\videos");//创建文件对象
        File dest = new File("F:\\user");
        MyFilesCopy myFilesCopy = new MyFilesCopy();
        myFilesCopy.copyAll(scr, dest);
    }

    public void copyAll(File scr, File dest) throws IOException {
        dest.mkdirs();//父级路径必须存在，子级路径若不存在会自行创建。
        File[] files = scr.listFiles();
        if (files != null) {//当路径不存在及权限文件不能访问和该路径为文件时，值会为null。避免空指针异常
            for (File file : files) {
                if (file.isFile()) {
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));//打开通道连接文件用于写
                    FileInputStream fis = new FileInputStream(file);//导入文件到jvm用于读
                    byte[] bytes = new byte[1024 * 1024 * 100];//创建一个数组
                    int len;
                    while ((len = fis.read(bytes)) != -1) {//每次尽可能读的数据，填满数组。该方法每次返回读取的字节数，当数据读完后会返回-1。
                        fos.write(bytes, 0, len);//将数组中的数据写入fos指定的文件中。
                    }
                    fos.close();//关闭通道或指关闭资源，关闭时会将缓存区的所有数据都写入目的地
                    fis.close();
                } else {
                    //递归
                    copyAll(file, new File(dest, file.getName()));
                }
            }
        }
    }
}
