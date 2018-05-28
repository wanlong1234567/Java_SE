package com.wanlong.seday01;

/**
 *  频繁修改字符串的性能损耗问题
 *
 * @author wanlong
 *Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class SrtingDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for(int i=0;i<10000000;i++){
            str += str;
        }
        System.out.println("完成!");

    }

}
