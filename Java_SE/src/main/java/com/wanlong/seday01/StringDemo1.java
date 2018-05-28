package com.wanlong.seday01;

/**
 * 字符串常量池
 * java对字符串有一个优化措施，即:JVM在堆内存中
 * 创建了一段区域--字符串常量池，用来缓存曾经通过
 * 字面量形式创建过的字符串对象。一旦使用曾经创建
 * 过的字符串字面量创建对象时，会直接重用常量池中
 * 的该对象而不是再新创建。这样可以避免因大量使用
 * 内容一样的字符串对内存的大量开销。
 * 但也因此，java要求字符串是不变对象。即:字符串
 * 对象创建后其内容不可改变，改变一定创建新字符串
 * 对象。
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "123abc";
        /**
         * 重用s1对象
         */
        String s2 = "123abc";
        String s3 = "123abc";

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        /**
         * 修改内容会创建新对象
         */
        s1 = s1 + "!";
        System.out.println(s1);
        System.out.println(s2);
        //s1不再引用原对象，所以s1不再与s2相等
        System.out.println(s1==s2);
    }
}
