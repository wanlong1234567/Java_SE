package com.wanlong.seday01;

/**
 *  String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringSubString {
    public static void main(String[] args) {
        String str = "www.oracle.com";
        /**
         * java API有一个特点，通常用两个数字
         * 表示范围时，都是"含头不含尾"的.
         */
        String sub = str.substring(4,10);
        System.out.println(sub);

        String name = getHostName("www.baidu.com");
        System.out.println(name);//baidu
        name = getHostName("http://www.tedu.com.cn");
        System.out.println(name);//tedu
    }
    /**
     * 解析给定的地址，获取其中的域名并返回
     * @param str 类型
     * @return 结果
     */
    public static String getHostName(String str){
        //查找第一个"."之后第一个字符的位置
        int start = str.indexOf(".")+1;
        //查找第二个"."的位置
        int end = str.indexOf(".",start);
        return str.substring(start,end);
    }
}
