package com.wanlong.seday06;
import java.io.File;
import java.io.FileFilter;
/**
 * File提供了一个重载的listFiles方法，允许传入
 * 一个过滤器，该方法只会将File表示的目录中满足
 * 该过滤器要求的子项返回。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileListFiles2 {
    public static void main(String[] args) {
        /**
         * 获取当前目录中的"文件"
         */
        File dir = new File(".");

        FileFilter filter = new FileFilter(){
            /**
             * 定义过滤条件，当认为参数file满足
             * 过滤要求时accept方法应当返回true
             */
            @Override
            public boolean accept(File file){
                return file.isFile();
            }

        };

        File[] subs = dir.listFiles(filter);
        for(File sub : subs){
            System.out.println(sub.getName());
        }

    }
}
