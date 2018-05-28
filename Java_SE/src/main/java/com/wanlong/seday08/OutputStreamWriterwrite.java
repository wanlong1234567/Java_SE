package com.wanlong.seday08;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * java根据流读写数据的单位划分为:字节流，字符流
 * 字节流以字节为单位读写数据。
 * 字符流以字符(unicode)为单位读写数据，但是底层
 * 本质上还是读写字节，只是字节与字符的转换工作由
 * 字符流完成
 *
 * Writer与Reader是所有字符流的父类，它们是一对
 * 抽象类，规定了所有字符流都要具备的读写字符方法。
 *
 * 转换流
 * OutputStreamWriter与InputStreamReader是
 * 字符流的一对常见实现类。
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class OutputStreamWriterwrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos
                = new FileOutputStream("osw.txt");
        /**
         * OSW的构造方法支持第二个参数，可以指定
         * 字符集，这样通过该流写出的字符都会按照
         * 指定的字符集转换。若不指定第二个参数则
         * 按照系统默认字符集转换。
         */
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");

        osw.write("我的滑板鞋,");
        osw.write("时尚时尚最时尚。");
        osw.write("在那光滑的马路牙子上打出溜滑!");

        System.out.println("写出完毕!");
        osw.close();
    }
}
