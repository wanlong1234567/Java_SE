package com.wanlong.seday06;

import java.io.File;
/**
 *
 * 买汽水，1块钱可以买1瓶汽水，2个空瓶可以换
 * 一瓶汽水，3个瓶盖可以换一瓶汽水，问:20块钱
 * 可以买到多少瓶汽水?
 *
 * 编写一段代码，完成1+2+3+4+....100
 * 并输出结果。
 * 在这段代码中不得出现for,while关键字
 *
 *
 * 方法内部调用当前方法的现象称为递归调用
 * 递归解决在某段代码执行过程中需要整体所有
 * 代码重复执行时使用。
 *
 * 递归调用需要注意，必须要有分支进行判断，不能
 * 100%进行，否则是死循环。
 * 递归应当尽量避免，递归层数越多内存消耗约大，
 * 并且执行速度慢。
 *
 *
 *
 * 编写方法，将给定的File表示的文件或目录删除
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        File dir = new File("a");
        deleteFile(dir);
        System.out.println("删除完成！");
    }
    public static void deleteFile(File file){
        if(file.isDirectory()){
            //现将该目录清空
            File[] subs = file.listFiles();
            for(File sub : subs){
                deleteFile(sub);
            }

        }
        file.delete();
    }
}
