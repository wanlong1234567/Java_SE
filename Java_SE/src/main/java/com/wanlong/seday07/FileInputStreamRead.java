package com.wanlong.seday07;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * java.io.FileInputStream
 * 文件输入流，用于从文件中读取数据的流
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileInputStreamRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream(
                "fos.txt"
        );

        byte[] data = new byte[100];
        int len = fis.read(data);
      //  String s =new String("2");
        String str = new String(data,0,len,"UTF-8");
        System.out.println(str);


        fis.close();

    }
}
