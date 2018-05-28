package com.wanlong.seday02;

/**
 *  String支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串的内容按照满足正则表达式的部分进行
 * 拆分，将拆分后的若干段字符串存入一个数组后返回
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        /**
         * 若在拆分的过程中发现连续匹配了拆分
         * 部分，那么会在中间拆除一个空字符串。
         * 但是若在字符串末尾连续匹配，则所有
         * 拆分空字符串会被忽略。
         */
        String[] data = str.split("\\d");
        System.out.println(data.length);
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
