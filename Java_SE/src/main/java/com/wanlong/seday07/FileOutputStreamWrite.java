package com.wanlong.seday07;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * java IO操作
 *
 * IO流是用来读写数据的java标准操作。
 * 流分为两个方向:
 * 输入流，输出流。
 *
 * 输入流,InputStream:用于从数据源读取数据到程序
 * 中的流。负责读取数据操作。
 *
 * 输出流,OutputStream:用于从程序中将数据发送出去
 * 的流。负责写出数据操作。
 *
 * 流进行了两个分类：
 * 字节流，处理流。
 *
 * 字节流:读写数据一定是建立在字节流的基础上的，
 *       是实际建立在数据源与程序间的"管道"，负责
 *       实际搬运数据。
 * 处理流:处理流不能独立存在，顾名思义，用来处理
 *       其他流的流，处理其他流的目的是通过处理流
 *       可以简化对其处理流的读写操作（处理工作
 *       由处理流代劳）。
 *
 * 文件流
 * 文件流是一对低级流，文件输入流用于读取文件数据
 * 文件输出流用于向文件中写入数据。
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileOutputStreamWrite {
    public static void main(String[] args) throws IOException {
        /**
         * FileOutputStream支持两组常用的构造
         * 方法:
         * FileOutputStream(String path)
         * FileOutputStream(File file)
         * 创建针对指定文件的输出流，默认是覆盖
         * 模式，即:若指定的文件已经存在，会将该
         * 文件所有数据清除。然后通过该流写出的
         * 所有数据会作为这个文件的数据保存。
         *
         * FileOutputStream(String path,boolean append)
         * FileOutputStream(File file,boolean append)
         * 第二个参数为boolean值，若该值为true,则该输出
         * 流为追加模式，即，该文件原有数据保留，通过当前
         * 流写出的数据会全部追加到文件的末尾。
         */
        FileOutputStream fos
                = new FileOutputStream("fos.txt");

        String str = "丑八怪啊啊啊啊啊啊啊啊啊啊";
        byte[] data = str.getBytes("UTF-8");
        fos.write(data);

        str = ",在这暧昧的时代.";
        data = str.getBytes("UTF-8");
        fos.write(data);
        System.out.println("写出完毕!");




        fos.close();


    }
}
