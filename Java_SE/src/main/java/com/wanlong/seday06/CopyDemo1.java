package com.wanlong.seday06;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 使用RAF复制文件
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src
                = new RandomAccessFile(
                "movie.mp4","r"
        );

        RandomAccessFile desc
                = new RandomAccessFile(
                "movie_cp.mp4","rw"
        );

        int d = -1;//记录每次读取到的字节

        long start = System.currentTimeMillis();
        while((d = src.read())!=-1 ){
            desc.write(d);
        }
        long end = System.currentTimeMillis();

        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        src.close();
        desc.close();

    }
}
