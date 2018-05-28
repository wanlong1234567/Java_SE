package com.wanlong.seday06;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 通过提高每次实际读写的数据量，减少读写次数
 * 来达到读写效率的提高。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src
                = new RandomAccessFile(
                "movie.mp4","r"
        );

        RandomAccessFile desc
                = new RandomAccessFile(
                "movie_cp2.mp4","rw"
        );

        /**
         * int read(byte[] data)
         * 一次性从文件中读取给定字节数组总长度的
         * 字节量，并存入到该数组中，返回值为实际
         * 读取到的字节量，若返回值为-1，则表示
         * 本次没有读取到任何字节(文件末尾读取)
         */

        byte[] buf = new byte[1024*10];//10k
        int len = -1;

        long start = System.currentTimeMillis();
        while((len = src.read(buf))!=-1){
            /**
             * void write(byte[] date)
             * 将给定的字节数组中所有字节一次性写出
             *
             * void write(byte[] data,int offset,int len)
             * 将给定字节数组从下标offset处开始的连续len个
             * 字节一次性写出
             */
            desc.write(buf,0,len);
        }
        long end = System.currentTimeMillis();

        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        src.close();
        desc.close();
    }
}
