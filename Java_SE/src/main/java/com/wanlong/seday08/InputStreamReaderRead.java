package com.wanlong.seday08;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 转换流
 * java.io.InputStreamReader
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class InputStreamReaderRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream("osw.txt");

        InputStreamReader isr
                = new InputStreamReader(fis,"UTF-8");

//		int d = -1;
//		while((d = isr.read()) != -1){
//			System.out.print("ddddddd:"+(char)d);
//		}

        char[] data = new char[100];
        int len = isr.read(data);
       String sss=new String(data,0,len);
        System.out.println("sss:"+sss);
        String str = String.valueOf(
                data, 0, len
        );
        System.out.println(str);

        isr.close();
    }
}
