package com.wanlong.seday01;

/**
 *int indexOf(String str)
 * 返回给定字符串在当前字符串中的位置，若当前
 * 字符串不含有给定字符串内容时返回值为-1
 *
 *
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringIndexOf {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";

        int index = str.indexOf("in");
        System.out.println("index:"+index);

        index = str.indexOf("in", 3);
        System.out.println("index:"+index);

        index = str.lastIndexOf("in");
        System.out.println("index:"+index);
    }
}
