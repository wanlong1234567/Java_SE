package com.wanlong.seday02;

/**
 * String支持正则表达式方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定
 * 的字符串
 *
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringreplaceAll {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        /**
         * 将数字部分替换为:#NUMBER#
         */
        str = str.replaceAll("\\d+", "#NUMBER#");
        System.out.println(str);
    }
}
