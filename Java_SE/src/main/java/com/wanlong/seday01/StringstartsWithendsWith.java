package com.wanlong.seday01;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是以指定字符串开始或结束的
 *
 *
 * @author wanlong
 *  Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringstartsWithendsWith {
    public static void main(String[] args) {
        String str = "thinking in java";
        boolean starts = str.startsWith("thi");
        System.out.println("starts:"+starts);
        boolean ends = str.endsWith("va");
        System.out.println("ends:"+ends);
    }
}
