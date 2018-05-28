package com.wanlong.seday06;
import java.io.File;
import java.io.IOException;
/**
 * 使用File创建一个新文件
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileCreateNewFile {
    public static void main(String[] args) throws IOException {
        /**
         * 在当前目录下创建文件:test.txt
         * 不写路径默认就是当前目录
         */
        File file = new File("text.txt");
        /**
         * boolean exists()
         * 判断当前File表示的文件或目录是否已经存在
         */
        if(!file.exists()){
            file.createNewFile();
            System.out.println("文件创建完毕!");
        }else{
            System.out.println("该文件已存在!");
        }

    }
}
