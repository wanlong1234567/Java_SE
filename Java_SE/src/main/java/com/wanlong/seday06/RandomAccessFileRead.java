package com.wanlong.seday06;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


import java.io.RandomAccessFile;
/**
 * 读取一个字节
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class RandomAccessFileRead {
    public static void main(String[] args) throws IOException {
        /**
         * 从raf.dat文件中读取一个字节
         */
        RandomAccessFile raf
                = new RandomAccessFile(
                "raf.dat","r"
        );
        /**
         * int read()
         * 读取1个字节，并以int形式返回。
         * 若返回值为-1,则表示读取到了文件末尾。
         *
         * 00000000 00000000 00000000 00000001
         */
        int d = raf.read();
        System.out.println(d);

        raf.close();
    }
}
