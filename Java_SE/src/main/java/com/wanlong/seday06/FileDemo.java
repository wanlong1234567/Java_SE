package com.wanlong.seday06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * java.io.File
 * File用于表示文件系统中的一个文件或目录
 * 通过File可以:
 * 1:访问该文件或目录的属性信息(名字，大小，修改时间等)
 * 2:操作文件或目录(创建，删除)
 * 3:访问一个目录的子项
 * 但是不能读取文件数据。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File(
                "."+File.separator+"demo.txt"
        );

        String name = file.getName();
        System.out.println("name:"+name);

        long length = file.length();
        System.out.println("len:"+length);

        /**
         * 获取最后修改时间
         * 2017年8月29日,9:37:02
         */
        long time = file.lastModified();
        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "yyyy年M月d日,H:mm:ss"
        );
//		Date date = new Date(time);
//		System.out.println(sdf.format(date));
        System.out.println(sdf.format(time));

        boolean canWrite = file.canWrite();
        boolean canRead = file.canRead();
        System.out.println("可写:"+canWrite);

        boolean isHidden = file.isHidden();
        System.out.println("是否隐藏:"+isHidden);


    }
}
