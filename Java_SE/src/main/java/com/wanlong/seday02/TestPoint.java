package com.wanlong.seday02;

/**
 * 用来测试Point重写Object的相关方法
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /**
         * Object定义了方法:
         * String toString()
         * 通常，当我们需要使用一个对象的toString
         * 方法，就应当重写该方法。因为Object提供
         * 的该方法返回的是该对象的句柄:
         * 类名@地址
         * 这样得不到关于该对象内容的实际相关信息。
         */
        String str = p.toString();
        System.out.println(str);
        /*
         * System.out.println(Object obj)
         * 该方法就是将给定对象toString方法返回
         * 的字符串输出到控制台。
         */
        System.out.println(p);

        Point p2 = new Point(1,2);
        System.out.println("p2:"+p2);

        System.out.println(p==p2);//false
        System.out.println(p.equals(p2));//true


    }
}
