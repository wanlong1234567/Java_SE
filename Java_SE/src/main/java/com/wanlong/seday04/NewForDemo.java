package com.wanlong.seday04;

/**
 * 新循环
 * 新循环又称为:增强for循环，for each
 * 新循环的作用是用来遍历集合或数组
 *
 * 新循环是JDK1.5之后推出的一个新特性
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};

        for(int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }

        for(String str : array){
            System.out.println(str);
        }
    }
}
