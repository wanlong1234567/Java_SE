package com.wanlong.seday06;
import java.io.File;

/**
 * 使用File获取一个目录中的所有子项
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileListFiles {
    public static void main(String[] args) {
        /**
         * 获取当前目录中的所有子项
         */
        File dir = new File(".");
        /**
         * 判断File表示的是文件还是目录
         * boolean isFile()
         * boolean isDirectory()
         */
        if(dir.isDirectory()){
            /**
             * File[] listFiles()
             * 获取当前File表示的目录中的所有子项
             * 返回的数组中每个元素为该目录中的一个
             * 子项。
             */
            File[] subs = dir.listFiles();
            for(File sub : subs){
                if(sub.isFile()){
                    System.out.print("文件:");
                }
                if(sub.isDirectory()){
                    System.out.print("目录:");
                }
                System.out.println(sub.getName());
            }
        }

    }
}
