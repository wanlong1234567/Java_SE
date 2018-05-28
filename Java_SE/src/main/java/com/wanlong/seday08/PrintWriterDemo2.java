package com.wanlong.seday08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
/**
 * PrintWriter在流链接中的应用
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos
                = new FileOutputStream("pw2.txt");

        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");

        PrintWriter pw
                = new PrintWriter(osw);

        pw.println("你还要我怎样，要怎样。");
        pw.println("你突然来的短信就够我悲伤。");

        System.out.println("写出完毕!");

        pw.close();
    }
}
