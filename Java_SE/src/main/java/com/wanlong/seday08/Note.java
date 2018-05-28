package com.wanlong.seday08;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 记事本功能
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scanner.nextLine();
        FileOutputStream fos
                = new FileOutputStream(fileName);
        OutputStreamWriter osw
                = new OutputStreamWriter(fos);
        /**
         * PrintWriter在流链接中的构造方法:
         * PrintWriter(OutputStream out)
         * PrintWriter(Writer out)
         * 使用上述构造方法是，有一个对应的重载构造
         * 方法要求传入第二个参数，该参数为boolean值
         * 若该值为true,则PW具有自动行刷新功能，即:
         * 每当使用pw.println()写出内容后都会自动
         * 进行flush操作。
         * PrintWriter(OutputStream out,boolean autoflush)
         * PrintWriter(Writer out,boolean autoflush)
         */
        PrintWriter pw
                = new PrintWriter(osw,true);
        System.out.println("请开始输入内容:");
        String line = null;
        while(true){
            line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
//			pw.flush();
        }
        System.out.println("再见!");
        pw.close();
    }
}
