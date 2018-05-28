package com.wanlong.seday01;

/**
 * char charAt(int index)
 * 返回当前字符串中给定位置的字符
 *
 * @author wanlong
 *Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringCharAt {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        char c = str.charAt(9);
        System.out.println(c);
        /**
         * 检查回文
         * 上海自来水来自海上
         */
        str = "上海自来水来自海上";
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("不是回文");
                return;//结束方法
            }
        }
        System.out.println("是回文");
    }
}
