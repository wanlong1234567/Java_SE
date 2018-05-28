package com.wanlong.seday06;

import java.io.File;

/**
 * 使用File创建一个目录
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileMkdir {
    public static void main(String[] args) {
        /**
         * 在当前目录下创建一个目录:demo
         */
        File dir = new File("demo");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("目录已创建!");
        }else{
            System.out.println("目录已存在!");
        }

    }
}
