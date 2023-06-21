package com.github.andydrew.dataStructure.zipOutputStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CopyZip {
    public static void main(String[] args) throws IOException {
        File scr = new File("F:\\user");//需要压缩的文件或文件夹路径
        File dest = new File(scr.getParent(), scr.getName() + ".zip");//压缩包存储路径
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));//创建一个压缩输出流对象
        toZip(scr, zos, scr.getName());
        zos.close();//释放资源
    }

    /*
    参数一：原数据路径
    参数二：压缩流关联压缩包对象
    参数三：写入压缩文件中的文件或者文件夹名
     */
    public static void toZip(File scr, ZipOutputStream zos, String name) throws IOException {
        File[] files = scr.listFiles();
        for (File file : files) {//循环遍历原路径里面的所有数据
            if (file.isFile()) {//判断是否为文件，若为文件直接写入压缩包中
                FileInputStream fis = new FileInputStream(file);//创建一个输入流，读取数据
                byte[] bytes = new byte[1024 * 1024 * 20];
                int len;
                while ((len = fis.read(bytes)) != -1) {//read方法返回每次读取字节的个数，若数据读完则返回-1.
                    //创建：ZipEntry对象，参数为应放入压缩包的文件夹或文件的名字，可多级创建。
                    ZipEntry zipEntry = new ZipEntry(name + "\\" + file.getName());
                    zos.putNextEntry(zipEntry);//将ZipEntry对象放入压缩包中，该对象对应的就是路径
                    zos.write(bytes, 0, len);//用压缩输出流将数据写入ZipEntry对象指定路径的文件中
                }
                fis.close();//释放资源
                zos.closeEntry();//表示当前文件书写完毕，释放资源
            } else {
                //创建：ZipEntry对象，参数为应放入压缩包的文件夹或文件的名字，可多级创建。
                ZipEntry zipEntry = new ZipEntry(name + "\\" + file.getName() + "\\");
                zos.putNextEntry(zipEntry);//将ZipEntry对象放入压缩包中，该对象对应的就是路径
                zos.closeEntry();//表示当前文件书写完毕，释放资源
                toZip(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
