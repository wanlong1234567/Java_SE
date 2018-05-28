package com.wanlong.seday01;

/**
 *
 *  String trim()
 * 去除当前字符串两边的空白字符
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringTrim {
    public static void main(String[] args) {
        String str = "  hello		";
        System.out.println(str);

        String trim = str.trim();
        System.out.println(trim);
    }
}
