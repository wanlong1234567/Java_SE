package com.wanlong.seday01;

/**
 *
 * String toLowerCase()
 * String toUpperCase()
 * 将当前在字符串中的英文部分转换为全大写和全小写
 *
 * @author wanlong
 *  Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class String_toLowCase_toUpperCase {
    public static void main(String[] args) {
        String str = "我爱Java";

        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);
    }
}
