package com.wanlong.seday07;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 缓冲流
 * BufferedInputStream:缓冲字节输入流
 * BufferedOutputStream:缓冲字节输出流
 *
 * 缓冲流是一对高级流，功能是加快读写效率。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream("music.mp3");
        BufferedInputStream bis
                = new BufferedInputStream(fis);


        FileOutputStream fos
                = new FileOutputStream("music_cp5.mp3");
        BufferedOutputStream bos
                = new BufferedOutputStream(fos);

        int d = -1;

        long start = System.currentTimeMillis();
        /**
         * 缓冲流内部维护了一个字节数组。
         * 所以实际上缓冲流还是靠提高读写的数据量
         * 减少实际的读写次数提高的读写效率。
         * bis.read()方法在第一次读取时实际读取了
         * 一组字节，并将第一个字节返回。当再次
         * 调用该方法读取一个字节时会将第二个字节
         * 直接返回。直到所有的字节都返回过后才会
         * 再次实际读取一组字节回来。
         */
        while((d = bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        bis.close();
        bos.close();
    }
}
