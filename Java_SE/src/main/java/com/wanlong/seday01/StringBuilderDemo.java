package com.wanlong.seday01;

/**
 *
 * java.lang.StringBuilder
 * 内部维护一个可变的字符数组，由于字符串的设计
 * 不利于频繁修改字符串内容(每次修改内容创建对象
 * 是很消耗内存的)，StringBuilder由于维护可变的
 * 字符数组，所以基于它修改字符串都是在一个字符
 * 数组进行的，所以内存开销小。频繁修改时的优势明显。
 *
 * StringBuilder的设计目的就是为了解决修改字符串
 * 的问题，所以其提供了很多便于修改字符串内容的方法
 *
 * @author wanlong
 *Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";

        StringBuffer builder
                = new StringBuffer(str);
        /*
         * String append(String str)
         * 将给定内容追加到当前字符串末尾
         * 等同于"+"的作用
         *
         * 好好学习java
         *      v
         * 好好学习java,为了找个好工作!
         */
        builder.append(",为了找个好工作!");
        str = builder.toString();
        System.out.println(str);

        /*
         * String replace(int s,int e,String str)
         * 将当前字符串中指定范围内的字符串替换为
         * 给定的字符串
         *
         * 好好学习java,为了找个好工作!
         *          v
         * 好好学习java,就是为了改变世界!
         */
        builder.replace(9, 16, "就是为了改变世界");
        System.out.println(builder.toString());

        /*
         * 好好学习java,就是为了改变世界!
         *            v
         * ,就是为了改变世界!
         */
        builder.delete(0, 8);
        System.out.println(builder.toString());

        /*
         * ,就是为了改变世界!
         *        v
         * 活着,就是为了改变世界!
         */
        builder.insert(0, "活着");
        System.out.println(builder.toString());


        builder.reverse();//反转字符串
        System.out.println(builder.toString());
    }
}
