package com.wanlong.seday02;

/**
 * 包装类提供了一个静态方法:
 * parseXXX(String str)
 * 可以将给定的字符串转换为对应的基本类型数据。但是
 * 前提是该字符串描述的数据能被该基本类型保存。
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class IntegerParseInt {
    public static void main(String[] args) {
        String str = "123";
        int d = Integer.parseInt(str);
        System.out.println(d+1);//124

        double dd = Double.parseDouble(str);
        System.out.println(dd+1);//124.123
    }
}
