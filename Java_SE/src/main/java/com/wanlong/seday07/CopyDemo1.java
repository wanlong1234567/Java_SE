package com.wanlong.seday07;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 使用文件流复制文件
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream("music.mp3");
        FileOutputStream fos
                = new FileOutputStream("music_cp3.mp3");
        byte[] data = new byte[1024*10];
        int len = -1;
        while((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕!");
        fis.close();
        fos.close();
    }
}
