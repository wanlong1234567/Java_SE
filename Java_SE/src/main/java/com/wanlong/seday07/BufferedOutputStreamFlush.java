package com.wanlong.seday07;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 缓冲输出流的缓冲区问题
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class BufferedOutputStreamFlush {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos
                = new FileOutputStream("bos.txt");
        BufferedOutputStream bos
                = new BufferedOutputStream(fos);

        String str = "该配合你演出的我演视而不见.";
        byte[] buf = str.getBytes("UTF-8");
        bos.write(buf);
        /**
         * void flush()
         * 将缓冲区中已经缓冲的数据一次性写出
         */
        bos.flush();
        System.out.println("写出完毕!");

        bos.close();
    }
}
